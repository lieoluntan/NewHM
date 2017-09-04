/**
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2016，所有权利保留。
 * 
 * 项目名：	hmstore-dao
 * 文件名：	StoreDao.java
 * 模块说明：
 * 修改历史：
 * 2016-6-16 - xiepingping - 创建。
 */
package com.hd123.hema.store.dao.material;

import java.util.List;

import com.hd123.hema.store.bean.material.Store;
import com.hd123.wms.antman.common.daosupport.BaseDao;

/**
 * @author xiepingping
 *
 */
public interface StoreDao extends BaseDao<Store> {

  public Store getByCode(String code);

  public void insertBatch(List<Store> stores);

}
