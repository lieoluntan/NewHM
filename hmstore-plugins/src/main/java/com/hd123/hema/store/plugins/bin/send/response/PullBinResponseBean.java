/**
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2016，所有权利保留。
 * 
 * 项目名： hmstore-plugins
 * 文件名： PullBinResponseBean.java
 * 模块说明：
 * 修改历史：
 * 2016-7-21 - zhanglin - 创建。
 */
package com.hd123.hema.store.plugins.bin.send.response;

import java.util.ArrayList;
import java.util.List;

import com.hd123.hema.store.bean.facility.jobpoint.JobPoint;
import com.hd123.wms.mm.wdk.common.bean.WDKResponseBean;

/**
 * @author zhanglin
 * 
 */
public class PullBinResponseBean extends WDKResponseBean {
  private static final long serialVersionUID = -2667471131404897339L;

  private List<JobPoint> items = new ArrayList<JobPoint>();

  public PullBinResponseBean() {
    super();
  }

  public PullBinResponseBean(int code, String message) {
    super(code, message);
  }

  public List<JobPoint> getItems() {
    return items;
  }

  public void setItems(List<JobPoint> items) {
    this.items = items;
  }

}
