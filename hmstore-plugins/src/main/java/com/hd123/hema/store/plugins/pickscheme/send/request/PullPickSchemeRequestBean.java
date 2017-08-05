/**
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2016，所有权利保留。
 * 
 * 项目名：	hmstore-plugins
 * 文件名：	PullPickSchemeRequestBean.java
 * 模块说明：
 * 修改历史：
 * 2016-8-1 - zhanglin - 创建。
 */
package com.hd123.hema.store.plugins.pickscheme.send.request;

import com.hd123.wms.mm.wdk.common.bean.WDKRequestBean;

/**
 * @author zhanglin
 * 
 */
public class PullPickSchemeRequestBean extends WDKRequestBean {
  private static final long serialVersionUID = -2414825930181239893L;

  private String storeCode;

  public String getStoreCode() {
    return storeCode;
  }

  public void setStoreCode(String storeCode) {
    this.storeCode = storeCode;
  }
}
