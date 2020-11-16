package com.changgou.core.controller;

import entity.Result;

/***
 * @ClassName IInsertController
 * @Description 描述
 * @version 1.0.0
 * @author ayuan
 * @createTime 2020/11/16 12:16:00
 */
public interface IInsertController<T> {
    //添加记录
    Result insert(T record);
}