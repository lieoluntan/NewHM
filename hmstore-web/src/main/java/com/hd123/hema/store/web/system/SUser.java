/**
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2016，所有权利保留。
 * 
 * 项目名：	hmstore-web
 * 文件名：	SUser.java
 * 模块说明：
 * 修改历史：
 * 2016-7-11 - zhanglin - 创建。
 */
package com.hd123.hema.store.web.system;

import java.io.Serializable;

/**
 * @author zhanglin
 * 
 */
public class SUser implements Serializable {
  private static final long serialVersionUID = 5294647405569068732L;

  private String code;
  private String name;

  private String orgUuid;
  private String orgCode;
  private String orgName;

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getOrgUuid() {
    return orgUuid;
  }

  public void setOrgUuid(String orgUuid) {
    this.orgUuid = orgUuid;
  }

  public String getOrgCode() {
    return orgCode;
  }

  public void setOrgCode(String orgCode) {
    this.orgCode = orgCode;
  }

  public String getOrgName() {
    return orgName;
  }

  public void setOrgName(String orgName) {
    this.orgName = orgName;
  }

}
