/**
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2016，所有权利保留。
 * 
 * 项目名：	hmstore-service
 * 文件名：	FacilityTemplate.java
 * 模块说明：
 * 修改历史：
 * 2016-6-27 - zhanglin - 创建。
 */
package com.hd123.hema.store.service.facility.template;

import java.util.List;

import com.hd123.hema.store.bean.facility.template.FacilityTemplate;

/**
 * @author zhanglin
 * 
 */
public interface FacilityTemplateService {
  String insert(FacilityTemplate template);

  void insertBatch(List<FacilityTemplate> templates);

  void update(FacilityTemplate template);

  void delete(String uuid);

  FacilityTemplate getByUuid(String uuid);

  List<FacilityTemplate> queryByList();

  /**
   * 从模板生成设施
   * <p>
   * <li>删除原设施，生成新设施</li>
   * 
   * @param templateUuid
   * @param orgUuid
   */
  void generateFacility(String templateUuid, String orgUuid);

  FacilityTemplate getByCode(String code);
}
