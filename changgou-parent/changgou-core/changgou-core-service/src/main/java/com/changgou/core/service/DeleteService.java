package com.changgou.core.service;

/***
 * @ClassName DeleteService
 * @Description 描述
 * @version 1.0.0
 * @author ayuan
 * @createTime 2020/11/16 11:50:00
 */
public interface DeleteService<T> {
    //根据条件删除记录
    int delete(T record);
    //根据ID删除记录
    int deleteById(Object id);
}
