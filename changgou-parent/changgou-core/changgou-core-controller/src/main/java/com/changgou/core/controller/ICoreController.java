package com.changgou.core.controller;

/***
 * @ClassName ICoreController
 * @Description 描述
 * @version 1.0.0
 * @author ayuan
 * @createTime 2020/11/16 12:19:00
 */
//创建ICoreController接口继承CRUDPController接口
public interface ICoreController<T> extends
        ISelectController<T>,
        IInsertController<T>,
        IPagingController<T>,
        IDeleteController<T>,
        IUpdateController<T> {
}
