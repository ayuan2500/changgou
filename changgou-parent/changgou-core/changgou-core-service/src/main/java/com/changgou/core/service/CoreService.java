package com.changgou.core.service;

/***
 * @ClassName CoreService
 * @Description 描述
 * @version 1.0.0
 * @author ayuan
 * @createTime 2020/11/16 11:52:00
 */
//创建CoreService接口继承CRUDPService接口
public interface CoreService<T> extends
        InsertService<T>,
        UpdateService<T>,
        DeleteService<T>,
        SelectService<T>,
        PagingService<T> {
}
