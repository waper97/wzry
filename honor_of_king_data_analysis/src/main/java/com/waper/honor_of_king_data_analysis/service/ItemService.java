package com.waper.honor_of_king_data_analysis.service;

import com.waper.honor_of_king_data_analysis.entity.Hero;
import com.waper.honor_of_king_data_analysis.entity.Props;
import com.waper.honor_of_king_data_analysis.repository.HeroRepository;
import com.waper.honor_of_king_data_analysis.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @ClassName ItemService
 * @Description TODO
 * @Author wangpeng
 * @Date 2021/6/21 23:11
 */
@Service
public class ItemService  {
    @Autowired
    private ItemRepository itemRepository;

    public List<Props> findAll(Example<Props> propsExample){
        return itemRepository.findAll(propsExample);
    }

    public Optional<Props> findOne(Example<Props> propsExample){

        return itemRepository.findOne(propsExample);
    }

    public Object save(Props props){
        return itemRepository.save(props);
    }

    public Object saveAll(List<Props> propsList){
        return itemRepository.saveAll(propsList);
    }
}
