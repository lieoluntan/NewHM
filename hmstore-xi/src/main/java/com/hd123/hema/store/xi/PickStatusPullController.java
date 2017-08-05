/**
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2016，所有权利保留。
 * 
 * 项目名：	hmstore-xi
 * 文件名：	PickStatusPullController.java
 * 模块说明：
 * 修改历史：
 * 2016-7-21 - zhanglin - 创建。
 */
package com.hd123.hema.store.xi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hd123.wms.mm.control.rest.RestReceiveController;

/**
 * @author zhanglin
 *
 */
@RestController
@RequestMapping(value = "/pullpickstatus")
public class PickStatusPullController extends RestReceiveController {

}

