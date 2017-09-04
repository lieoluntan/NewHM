/**
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2016，所有权利保留。
 * 
 * 项目名：	hmstore-service
 * 文件名：	StoreHostService.java
 * 模块说明：
 * 修改历史：
 * 2016-6-17 - xiepingping - 创建。
 */
package com.hd123.hema.store.service.material;

import java.util.List;

import com.hd123.hema.store.bean.material.StoreHost;

/**
 * @author xiepingping
 * 
 */
public interface StoreHostService {

  String insert(StoreHost storeHost);

  void update(StoreHost storeHost);

  void delete(String uuid);

  StoreHost getByUuid(String uuid);

  List<StoreHost> queryByList(String orgUuid);
}
