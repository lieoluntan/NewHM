/**
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2016，所有权利保留。
 * 
 * 项目名：	hmstore-service
 * 文件名：	PickSchemeService.java
 * 模块说明：
 * 修改历史：
 * 2016-6-27 - zhanglin - 创建。
 */
package com.hd123.hema.store.service.facility.pickscheme;

import java.util.List;

import com.hd123.hema.store.bean.facility.pickscheme.PickScheme;
import com.hd123.wms.antman.common.query.QueryParam;

/**
 * @author zhanglin
 * 
 */
public interface PickSchemeService {
  String insert(PickScheme template);

  void insertBatch(List<PickScheme> templates);

  void update(PickScheme template);

  void delete(String uuid);

  PickScheme getByUuid(String uuid);

  List<PickScheme> queryByList(QueryParam param);

  /**
   * 启用拣货方案
   * <p>
   * <li>停用其他使用中的拣货方案
   * <li>当前拣货方案状态置为使用中
   * 
   * @param uuid
   */
  void effective(String uuid);

  void deleteByOrg(String orgUuid);
}