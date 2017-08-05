/**
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2016，所有权利保留。
 * 
 * 项目名：	hmstore-service
 * 文件名：	PickSchemeTemplateService.java
 * 模块说明：
 * 修改历史：
 * 2016-6-27 - zhanglin - 创建。
 */
package com.hd123.hema.store.service.facility.pickscheme;

import java.util.List;

import com.hd123.hema.store.bean.facility.pickscheme.PickSchemeTemplate;
import com.hd123.wms.antman.common.query.QueryParam;

/**
 * @author zhanglin
 * 
 */
public interface PickSchemeTemplateService {
  String insert(PickSchemeTemplate template);

  void insertBatch(List<PickSchemeTemplate> templates);

  void update(PickSchemeTemplate template);

  void delete(String uuid);

  PickSchemeTemplate getByUuid(String uuid);

  List<PickSchemeTemplate> queryByList(QueryParam param);

  /**
   * 分发
   * 
   * @param uuid
   */
  void distribute(String uuid);
}