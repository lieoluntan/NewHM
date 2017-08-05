/**
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2016，所有权利保留。
 * 
 * 项目名：	hmstore-dao
 * 文件名：	PickSchemeDao.java
 * 模块说明：
 * 修改历史：
 * 2016-6-16 - zhanglin - 创建。
 */
package com.hd123.hema.store.dao.facility.pickscheme;

import java.util.List;

import com.hd123.hema.store.bean.facility.pickscheme.PickScheme;
import com.hd123.wms.antman.common.daosupport.BaseDao;

/**
 * @author zhanglin
 *
 */
public interface PickSchemeDao extends BaseDao<PickScheme> {

  public PickScheme getByCode(String code, String orgUuid, String jobPointUuid);

  public void insertBatch(List<PickScheme> pickSchemes);

  public void deleteByOrg(String orgUuid);

}
