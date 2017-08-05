/**
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2016，所有权利保留。
 * 
 * 项目名：	hmstore-bean
 * 文件名：	NodeType.java
 * 模块说明：
 * 修改历史：
 * 2016-6-15 - zhanglin - 创建。
 */
package com.hd123.hema.store.bean.facility.gateway;

/**
 * @author zhanglin
 * 
 */
public enum NodeType {
  PickTag("拣货标签"), DisplayTag("显示标签");
  private String caption;

  private NodeType(String caption) {
    this.caption = caption;
  }

  public String getCaption() {
    return caption;
  }

}
