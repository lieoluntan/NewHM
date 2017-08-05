/**
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2016，所有权利保留。
 * 
 * 项目名： hmstore-plugins
 * 文件名： PullBinRequestBean.java
 * 模块说明：
 * 修改历史：
 * 2016-7-21 - zhanglin - 创建。
 */
package com.hd123.hema.store.plugins.bin.send.request;

import com.hd123.wms.mm.wdk.common.bean.WDKRequestBean;

/**
 * @author zhanglin
 * 
 */
public class PullBinRequestBean extends WDKRequestBean {
  private static final long serialVersionUID = 9198105615779640552L;

  private String storeCode;

  public String getStoreCode() {
    return storeCode;
  }

  public void setStoreCode(String storeCode) {
    this.storeCode = storeCode;
  }
}
