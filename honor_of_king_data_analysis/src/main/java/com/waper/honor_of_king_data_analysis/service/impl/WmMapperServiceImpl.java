package com.waper.honor_of_king_data_analysis.service.impl;

import com.waper.honor_of_king_data_analysis.mapper.WmMapperingMapper;
import com.waper.honor_of_king_data_analysis.service.WmMapperingService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @ClassName WmMapperServiceImpl
 * @Description TODO
 * @Author wangpeng
 * @Date 2020/8/20 16:57
 */
@Service
public class WmMapperServiceImpl implements WmMapperingService {

    @Resource
    private WmMapperingMapper vmMapperMapper;


    @Override
    public List<Map<String, Object>> listVmCatelog(String bookId) {
        return vmMapperMapper.listVmCatelog(bookId);
    }

    @Override
    public List<Map<String, Object>> listXKCatelog(String bookId) {
        return vmMapperMapper.listXKCatelog(bookId);
    }
}
