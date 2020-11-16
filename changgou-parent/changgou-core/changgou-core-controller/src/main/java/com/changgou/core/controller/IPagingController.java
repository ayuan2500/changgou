package com.changgou.core.controller;

import com.github.pagehelper.PageInfo;
import entity.Result;

/***
 * @ClassName IPagingController
 * @Description 描述
 * @version 1.0.0
 * @author ayuan
 * @createTime 2020/11/16 12:18:00
 */
public interface IPagingController<T> {
    /**
     * 查询所有并分页
     * @param pageNo	当前页
     * @param pageSize	每页记录数
     * @return
     */
    Result<PageInfo<T>> findByPage(Integer pageNo, Integer pageSize);
    /**
     * 根据查询条件 record 分页查询
     * @param pageNo	当前页
     * @param pageSize	每页记录数
     * @param record	查询条件
     * @return
     */
    Result<PageInfo<T>> findByPage(Integer pageNo, Integer pageSize, T record);
}
