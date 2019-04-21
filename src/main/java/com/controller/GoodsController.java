/*
 * 文件名：GoodsController.java
 * 版权：Copyright by www.newlixon.com/
 * 描述：
 * 修改人：Taojinsen
 * 修改时间：2019年04月21日
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */
package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:
 * 描述
 * author Taojinsen
 * version 1.0
 * date: 2019-04-21 11:05:05
 * see GoodsController
 */
@RestController
public class GoodsController {

    @GetMapping("list")
    public String index() {
        return "goods list";
    }
}
