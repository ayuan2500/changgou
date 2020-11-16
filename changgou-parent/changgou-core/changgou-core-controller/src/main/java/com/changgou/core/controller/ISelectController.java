package com.changgou.core.controller;

import entity.Result;

import java.util.List;

/***
 * @ClassName ISelectController
 * @Description 描述
 * @version 1.0.0
 * @author ayuan
 * @createTime 2020/11/16 12:18:00
 */
public interface ISelectController<T> {
    //查询所有数据
    Result<List<T>> findAll();
    //根据id查询一个对象数据
    Result<T> findById(Object id);
}
