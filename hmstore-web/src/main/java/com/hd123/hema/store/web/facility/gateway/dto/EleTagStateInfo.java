/**
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2016，所有权利保留。
 * 
 * 项目名：	hmstore-web
 * 文件名：	EleTagStateInfo.java
 * 模块说明：
 * 修改历史：
 * 2016-7-8 - zhanglin - 创建。
 */
package com.hd123.hema.store.web.facility.gateway.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.hd123.hema.store.service.facility.gateway.dto.ElectronicTagStateInfo;

/**
 * @author zhanglin
 * 
 */
public class EleTagStateInfo implements Serializable {
  private static final long serialVersionUID = 1933917700825010346L;

  private String storeName;
  private List<ElectronicTagStateInfo> infos = new ArrayList<ElectronicTagStateInfo>();

  public String getStoreName() {
    return storeName;
  }

  public void setStoreName(String storeName) {
    this.storeName = storeName;
  }

  public List<ElectronicTagStateInfo> getInfos() {
    return infos;
  }

  public void setInfos(List<ElectronicTagStateInfo> infos) {
    this.infos = infos;
  }

}
