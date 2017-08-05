/**
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2016，所有权利保留。
 * 
 * 项目名：	hmstore-dao
 * 文件名：	JobPointGatewayDao.java
 * 模块说明：
 * 修改历史：
 * 2016-7-27 - zhanglin - 创建。
 */
package com.hd123.hema.store.dao.facility.jobpoint;

import java.util.List;

import com.hd123.hema.store.bean.facility.jobpoint.JobPointGateway;
import com.hd123.wms.antman.common.query.QueryParam;

/**
 * @author zhanglin
 * 
 */
public interface JobPointGatewayDao {

  public int insertBatch(List<JobPointGateway> jobPointGateways);

  public int deleteByJobPoint(String jobPointUuid);

  public List<JobPointGateway> queryByList(QueryParam params);
}
