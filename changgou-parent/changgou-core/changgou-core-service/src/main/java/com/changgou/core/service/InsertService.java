package com.changgou.core.service;

/***
 * @ClassName InsertService
 * @Description 描述
 * @version 1.0.0
 * @author ayuan
 * @createTime 2020/11/16 11:49:00
 */
public interface InsertService<T> {
    //添加记录
    int insert(T record);
}
