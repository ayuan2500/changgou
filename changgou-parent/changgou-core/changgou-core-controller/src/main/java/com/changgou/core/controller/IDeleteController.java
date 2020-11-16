package com.changgou.core.controller;

import entity.Result;

/***
 * @ClassName IDeleteController
 * @Description 描述
 * @version 1.0.0
 * @author ayuan
 * @createTime 2020/11/16 12:18:00
 */
public interface IDeleteController<T> {
    //根据ID删除记录
    Result deleteById(Object id);
}
