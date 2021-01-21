package com.baidu.shop.service;

import com.baidu.shop.base.Result;
import com.baidu.shop.entity.CategoryEntity;
import com.google.gson.JsonObject;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @ClassName CategoryService
 * @Description: TODO
 * @Author zhuyanlu
 * @Date 2021/1/19
 * @Version V1.0 7
 **/
@Api(tags = "商品分类接口") // 声明接口
@Validated
public interface CategoryService {
    @ApiOperation(value = "通过pid查询商品分类")
    @GetMapping(value = "category/list")
    Result<List<CategoryEntity>> getCategoryByPid(@NotNull Integer pid);


    @ApiOperation(value = "通过id删除分类")
    @DeleteMapping(value = "/category/delete")
    Result<JsonObject> deleteCategoryById(@NotNull Integer id);

    @ApiOperation(value = "修改商品分类")
    @PutMapping(value = "/category/edit")
    Result<JsonObject> editCategoryById(@RequestBody CategoryEntity categoryEntity);
}
