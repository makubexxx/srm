package com.ctbu.srm.repository.dao;

import java.util.List;

/**
 * @Author: Meiziyu
 * @Date: 2019/4/9 15:34
 * @Email 308348194@qq.com
 */
public interface BaseDao<T>{


    /**
     * 根据主键id获取对象
     *
     * @param id
     * @return
     */
    public T getObjByID(Integer id);

    /**
     * 根据名获取对象
     *
     * @param name
     * @return 对象
     */
    public  T getObjByName(String name);

    /**
     * 获取所有对象
     *
     * @return 对象
     */
    public List<T> getAllObjs();

    /**
     * 根据对象插入*所有字段*到db
     *
     * @param record
     * @return 插入结果（数量）
     * @deprecated 已经被删除的方法
     */
    public int addObj(T record);

    /**
     * 根据对象有选择性的只插入*字段不为空*到db
     *
     * @param t  对象
     * @return 插入结果（数量）
     */
    public int addObjSelective(T t);

    /**
     * 根据主键ID查询并有选择性的只更新*字段不为空*到db
     *
     * @param t
     * @return 更新结果（数量）
     */
    public int updObjByIDSelective(T t);

    /**
     * 根据主键ID查询并*更新所有字段*到db
     *
     * @param t
     * @return 更新结果（数量）
     * @deprecated  已经被抛弃了的方法
     */
    public int updObjByID(T t);

    /**
     * 根据主键ID查询并删除对象
     *
     * @param id
     * @return 删除结果（数量）
     */
    public int delObjByID(Integer id);

    /**
     * 根据主键ID查询并删除对象
     * 批量删除ID
     *
     * @param ids
     * @return 删除结果（数量）
     */
    public int batchDelObjByIDs(List<String> ids);
}
