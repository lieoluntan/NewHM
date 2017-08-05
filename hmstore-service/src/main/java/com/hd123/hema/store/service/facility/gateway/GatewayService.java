/**
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2016，所有权利保留。
 * 
 * 项目名：	hmstore-service
 * 文件名：	GatewayService.java
 * 模块说明：
 * 修改历史：
 * 2016-6-24 - zhanglin - 创建。
 */
package com.hd123.hema.store.service.facility.gateway;

import java.util.List;

import com.hd123.hema.store.bean.facility.gateway.Gateway;
import com.hd123.hema.store.service.facility.gateway.dto.ElectronicTagStateInfo;
import com.hd123.wms.antman.common.query.QueryParam;

/**
 * @author zhanglin
 * 
 */
public interface GatewayService {
  String insert(Gateway gateway);

  void insertBatch(List<Gateway> gateways);

  void update(Gateway gateway);

  void delete(String uuid);

  Gateway getByUuid(String uuid);

  Gateway getByCode(String code, String templateUuid, String orgUuid);

  /**
   * 网关列表，不包含明细
   */
  List<Gateway> queryByList(QueryParam param);

  /**
   * 接收电子标签状态
   */
  void receiveELeTagStatus(String storeCode, List<ElectronicTagStateInfo> infos);

  void deleteByOrg(String orgUuid);
}
