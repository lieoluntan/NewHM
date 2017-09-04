/**
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2016，所有权利保留。
 * 
 * 项目名：	hmstore-bean
 * 文件名：	PickState.java
 * 模块说明：
 * 修改历史：
 * 2016-6-15 - xiepingping - 创建。
 */
package com.hd123.hema.store.bean.query;

/**
 * @author xiepingping
 * 
 */
public enum PickState {
  Finished("已完成"), Unfinished("未完成");
  private String caption;

  private PickState(String caption) {
    this.caption = caption;
  }

  public String getCaption() {
    return caption;
  }

}
