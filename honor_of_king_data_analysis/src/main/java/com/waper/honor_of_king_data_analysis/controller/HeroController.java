package com.waper.honor_of_king_data_analysis.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.sun.org.apache.regexp.internal.RE;
import com.waper.honor_of_king_data_analysis.model.BaseInfo;
import com.waper.honor_of_king_data_analysis.util.StaticUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName HeroController
 * @Description TODO
 * @Author wangpeng
 * @Date 2020/8/18 10:40
 */
@RestController
@RequestMapping("waper/api/hero")
public class HeroController extends BaseController {

    @GetMapping("test")
    public  Object test(String filePath){
        filePath = "C:\\Users\\waper\\Downloads\\herolist.json";
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

            System.out.println(jsonStr);

            Map<String,Object> paramMap = new HashMap<>();
            paramMap.put("name","cname");
            paramMap.put("title","title");
            paramMap.put("hero_type","hero_type");
            paramMap.put("new_type","new_type");
            paramMap.put("id","id");
            paramMap.put("data",jsonStr);


            return successData(jsonStr);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }


    }

}

