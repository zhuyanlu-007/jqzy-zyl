package com.baidu.shop.service.impl;

import com.baidu.shop.base.BaseApiService;
import com.baidu.shop.base.Result;
import com.baidu.shop.entity.CategoryEntity;
import com.baidu.shop.mapper.CategoryMapper;
import com.baidu.shop.service.CategoryService;
import com.baidu.shop.utils.ObjectUtil;
import com.google.gson.JsonObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RestController;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.List;


/**
 * @ClassName CategoryServiceImpl
 * @Description: TODO
 * @Author zhuyanlu
 * @Date 2021/1/19
 * @Version V1.0 7
 **/
@RestController
public class CategoryServiceImpl extends BaseApiService implements CategoryService {
    @Resource
    private CategoryMapper categoryMapper;


    //查询
    @Override
    public Result<List<CategoryEntity>> getCategoryByPid(Integer pid) {

        CategoryEntity categoryEntity = new CategoryEntity();
        categoryEntity.setParentId(pid);

        List<CategoryEntity> list = categoryMapper.select(categoryEntity);
        return this.setResultSuccess(list);
    }


}
