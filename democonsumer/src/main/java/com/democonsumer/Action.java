package com.democonsumer;

import groupId.HelloInterface;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Component;

/**
 * @Author: czw
 * @CreateTime: 2020-07-14 11:31
 * @UpdeteTime: 2020-07-14 11:31
 * @Description:
 */
@Component("action")
public class Action {
	@DubboReference
	private HelloInterface demoService;

	public String doSayHello(String name) {
		return demoService.sayHello(name);
	}
}
