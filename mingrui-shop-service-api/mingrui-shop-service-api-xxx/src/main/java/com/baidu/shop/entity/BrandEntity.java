package com.baidu.shop.entity;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @ClassName BrandEntity
 * @Description: TODO
 * @Author zhuyanlu
 * @Date 2021/1/25
 * @Version V1.0 7
 **/
@Table(name="tb_brand")
@Data
public class BrandEntity {

    @Id
    private Integer id;

    private String name;

    private String image;

    private Character letter;

}
