/**
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2016，所有权利保留。
 * 
 * 项目名：	hmstore-service
 * 文件名：	JobPointService.java
 * 模块说明：
 * 修改历史：
 * 2016-6-27 - zhanglin - 创建。
 */
package com.hd123.hema.store.service.facility.jobpoint;

import java.util.List;

import com.hd123.hema.store.bean.facility.jobpoint.JobPoint;
import com.hd123.wms.antman.common.query.QueryParam;

/**
 * @author zhanglin
 *
 */
public interface JobPointService {
  String insert(JobPoint jobPoint);

  void insertBatch(List<JobPoint> jobPoints);

  /**
   * 不影响分区
   */
  void update(JobPoint jobPoint);

  void delete(String uuid);

  void deleteByOrg(String orgUuid);

  JobPoint getByUuid(String uuid);

  List<JobPoint> queryByList(QueryParam param);

  /**
   * 查询还被分配的电子标签
   */
  List<String> queryAvaliableEleTags(QueryParam param);
}