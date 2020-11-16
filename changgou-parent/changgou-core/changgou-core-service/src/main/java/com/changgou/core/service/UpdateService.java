package com.changgou.core.service;

/***
 * @ClassName UpdateService
 * @Description 描述
 * @version 1.0.0
 * @author ayuan
 * @createTime 2020/11/16 11:50:00
 */
public interface UpdateService<T> {
    //根据对象进行更新数据
    int updateByPrimaryKey(T record);
}
