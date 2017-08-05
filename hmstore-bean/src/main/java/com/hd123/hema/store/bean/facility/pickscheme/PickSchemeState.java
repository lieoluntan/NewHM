/**
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2016，所有权利保留。
 * 
 * 项目名：	hmstore-bean
 * 文件名：	PickSchemeState.java
 * 模块说明：
 * 修改历史：
 * 2016-6-15 - zhanglin - 创建。
 */
package com.hd123.hema.store.bean.facility.pickscheme;

/**
 * 拣货分区状态
 * 
 * @author zhanglin
 *
 */
public enum PickSchemeState {
  Using("使用中"), UnEffective("待生效");
  private String caption;

  private PickSchemeState(String caption) {
    this.caption = caption;
  }

  public String getCaption() {
    return caption;
  }

}
