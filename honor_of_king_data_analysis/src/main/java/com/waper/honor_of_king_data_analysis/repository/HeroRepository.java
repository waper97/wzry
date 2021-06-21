package com.waper.honor_of_king_data_analysis.repository;

import com.waper.honor_of_king_data_analysis.entity.Hero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

/**
 * @ClassName HeroRepository
 * @Description TODO
 * @Author wangpeng
 * @Date 2021/6/21 15:13
 */
public interface HeroRepository  extends JpaRepository<Hero,Long> {

}
