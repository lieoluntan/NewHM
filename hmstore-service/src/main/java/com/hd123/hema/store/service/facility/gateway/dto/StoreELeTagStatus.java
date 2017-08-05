/**
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2016，所有权利保留。
 * 
 * 项目名：	hmstore-service
 * 文件名：	StoreELeTagStatus.java
 * 模块说明：
 * 修改历史：
 * 2016-7-22 - zhanglin - 创建。
 */
package com.hd123.hema.store.service.facility.gateway.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author zhanglin
 * 
 */
public class StoreELeTagStatus implements Serializable {
  private static final long serialVersionUID = -7745792424857951426L;

  private String storeCode;
  private List<ElectronicTagStateInfo> infos = new ArrayList<ElectronicTagStateInfo>();

  public String getStoreCode() {
    return storeCode;
  }

  public void setStoreCode(String storeCode) {
    this.storeCode = storeCode;
  }

  public List<ElectronicTagStateInfo> getInfos() {
    return infos;
  }

  public void setInfos(List<ElectronicTagStateInfo> infos) {
    this.infos = infos;
  }

}
