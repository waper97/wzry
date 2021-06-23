package com.waper.honor_of_king_data_analysis.controller;

import com.alibaba.fastjson.JSONArray;
import com.waper.honor_of_king_data_analysis.entity.Hero;
import com.waper.honor_of_king_data_analysis.entity.Props;
import com.waper.honor_of_king_data_analysis.repository.ItemRepository;
import com.waper.honor_of_king_data_analysis.service.HeroService;
import com.waper.honor_of_king_data_analysis.service.ItemService;
import com.waper.honor_of_king_data_analysis.util.AnalysisJsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName HeroController
 * @Description 英雄控制器
 * @Author wangpeng
 * @Date 2020/8/18 10:40
 */
@RestController
@RequestMapping("waper/api/hero")
public class HeroController extends BaseController {

    @Autowired
    private HeroService heroService;
    @Autowired
    private ItemService itemService;

    /**
     * 根绝json文件获取英雄数据，并保存再数据库里
     * @param filePath
     * @return
     */
    @GetMapping("test")
    public  Object test(String filePath){
        filePath = "C:\\Users\\Administrator\\Desktop\\herolist.json";
        String jsonStr = "";
        try {
            File file = new File(filePath);
            FileReader fileReader = new FileReader(file);
            // 读取文件
            Reader reader = new InputStreamReader(new FileInputStream(file),"utf-8");
            int ch = 0;
            StringBuffer sb = new StringBuffer();
            while((ch = reader.read()) != -1){
                sb.append((char)ch);
            }
            fileReader.close();
            reader.close();
            jsonStr = sb.toString();

            // json数组转数组
            JSONArray jsonArray =  JSONArray.parseArray(jsonStr);
            List<Hero> heroList = JSONArray.parseArray(jsonArray.toString(), Hero.class);
            heroService.saveAll(heroList);

            return successData(jsonStr);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 感觉参数查询英雄
     * @param hero
     * @return
     */
    @GetMapping("listHero")
    public Object listHero(Hero hero){
        Example<Hero> heroExample = Example.of(hero);
       return  successData(heroService.findAll(heroExample));
    }
    @GetMapping("findOne")
    public Object findOne(Hero hero){
        Example<Hero> heroExample = Example.of(hero);
       return  successData(heroService.findOne(heroExample));
    }

    /**
     * 保存武器列表到数据库
     * @return
     */
    @GetMapping("saveItems")
    public Object saveItems(){
        String jsonStr =  AnalysisJsonUtil.JsonStringToJsonArray();
        JSONArray jsonArray =  JSONArray.parseArray(jsonStr);
        List<Props> propsList = JSONArray.parseArray(jsonArray.toString(), Props.class);
        return successData(itemService.saveAll(propsList));
    }

    /**
     * 武器列表
     * @param props
     * @return
     */
    @GetMapping("listItems")
    public Object listItems(Props props){
        Example<Props> propsExample = Example.of(props);
        return  successData(itemService.findAll(propsExample));
    }

}

