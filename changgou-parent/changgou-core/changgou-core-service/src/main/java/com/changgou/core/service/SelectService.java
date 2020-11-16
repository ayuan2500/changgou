package com.changgou.core.service;

import java.util.List;

/***
 * @ClassName SelectService
 * @Description 描述
 * @version 1.0.0
 * @author ayuan
 * @createTime 2020/11/16 11:50:00
 */
public interface SelectService<T> {
    //查询所有数据
    List<T> selectAll();
    //根据id查询一个对象数据
    T selectByPrimaryKey(Object id);
    //根据条件查询数据
    List<T> select(T record);
}