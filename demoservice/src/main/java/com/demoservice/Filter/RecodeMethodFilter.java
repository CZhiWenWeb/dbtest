package com.demoservice.Filter;

import org.apache.dubbo.common.extension.Activate;
import org.apache.dubbo.rpc.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author: czw
 * @CreateTime: 2020-07-14 15:52
 * @UpdeteTime: 2020-07-14 15:52
 * @Description:
 */
@Activate
public class RecodeMethodFilter implements Filter, Filter.Listener {
	static final Logger logger = LoggerFactory.getLogger("RecodeMethod");

	@Override
	public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
		logger.debug(invoker.getInterface().getName());

		return invoker.invoke(invocation);
	}

	@Override
	public void onResponse(Result appResponse, Invoker<?> invoker, Invocation invocation) {

	}

	@Override
	public void onError(Throwable t, Invoker<?> invoker, Invocation invocation) {

	}
}
