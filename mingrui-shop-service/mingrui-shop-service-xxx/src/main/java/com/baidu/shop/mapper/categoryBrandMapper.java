package com.baidu.shop.mapper;

import com.baidu.shop.entity.CategoryBrandEntity;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.special.InsertListMapper;
/**
 * @ClassName categoryBrandMapper
 * @Description: TODO
 * @Author zhuyanlu
 * @Date 2021/1/19
 * @Version V1.0 7
 **/
public interface categoryBrandMapper extends Mapper<CategoryBrandEntity>, InsertListMapper<CategoryBrandEntity>{
}
