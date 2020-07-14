package com.demoservice;

import groupId.HelloInterface;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @Author: czw
 * @CreateTime: 2020-07-14 10:37
 * @UpdeteTime: 2020-07-14 10:37
 * @Description:
 */
@DubboService
public class DemoServiceImpl implements HelloInterface {
	@Override
	public String sayHello(String name) {
		return "hello" + name;
	}
}
