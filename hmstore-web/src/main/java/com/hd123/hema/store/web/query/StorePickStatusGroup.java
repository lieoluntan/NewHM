/**
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2016，所有权利保留。
 * 
 * 项目名：	hmstore-web
 * 文件名：	StorePickStatusGroup.java
 * 模块说明：
 * 修改历史：
 * 2016-7-13 - zhanglin - 创建。
 */
package com.hd123.hema.store.web.query;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.hd123.hema.store.bean.query.StorePickStatus;

/**
 * @author zhanglin
 * 
 */
public class StorePickStatusGroup implements Serializable {
  private static final long serialVersionUID = 8626137419051888522L;

  /** 拣货情况 */
  private List<StorePickStatus> status = new ArrayList<StorePickStatus>();
  /** 分时段订单数 */
  private List<StorePickStatusChart> charts = new ArrayList<StorePickStatusChart>();

  public List<StorePickStatus> getStatus() {
    return status;
  }

  public void setStatus(List<StorePickStatus> status) {
    this.status = status;
  }

  public List<StorePickStatusChart> getCharts() {
    return charts;
  }

  public void setCharts(List<StorePickStatusChart> charts) {
    this.charts = charts;
  }

}
