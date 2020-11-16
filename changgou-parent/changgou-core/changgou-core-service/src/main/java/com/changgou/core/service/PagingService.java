package com.changgou.core.service;

import com.github.pagehelper.PageInfo;

/***
 * @ClassName PagingService
 * @Description 描述
 * @version 1.0.0
 * @author ayuan
 * @createTime 2020/11/16 11:51:00
 */
public interface PagingService<T> {
    /**
     * 查询所有并分页
     * @param pageNo	当前页
     * @param pageSize	每页记录数
     * @return
     */
    PageInfo<T> findByPage(Integer pageNo, Integer pageSize);
    /**
     * 根据查询条件 record 分页查询
     * @param pageNo	当前页
     * @param pageSize	每页记录数
     * @param record	查询条件
     * @return
     */
    PageInfo<T> findByPage(Integer pageNo, Integer pageSize, T record);
    /**
     * 根据查询条件exmaple来分页查询
     * @param pageNo	当前页
     * @param pageSize	每页记录数
     * @param example	封装了查询条件的对象
     * @return
     */
    PageInfo<T> findByPageExample(Integer pageNo, Integer pageSize, Object example);
}
