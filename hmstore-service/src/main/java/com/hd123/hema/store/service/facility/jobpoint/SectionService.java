/**
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2016，所有权利保留。
 * 
 * 项目名：	hmstore-service
 * 文件名：	SectionService.java
 * 模块说明：
 * 修改历史：
 * 2016-6-27 - zhanglin - 创建。
 */
package com.hd123.hema.store.service.facility.jobpoint;

import java.util.List;

import com.hd123.hema.store.bean.facility.jobpoint.Section;
import com.hd123.wms.antman.common.query.QueryParam;

/**
 * @author zhanglin
 *
 */
public interface SectionService {
  String insert(Section section);

  void insertBatch(List<Section> sections);

  void update(Section section);

  void delete(String uuid);

  void deleteByPickArea(String pickAreaUuid);

  Section getByUuid(String uuid);

  List<Section> queryByList(QueryParam param);
}
