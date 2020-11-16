package com.changgou.core.controller;

import entity.Result;

/***
 * @ClassName IUpdateController
 * @Description 描述
 * @version 1.0.0
 * @author ayuan
 * @createTime 2020/11/16 12:16:00
 */
public interface IUpdateController<T> {
    //根据对象进行更新数据
    Result updateByPrimaryKey(T record);
}
