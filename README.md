# dbtest
在Dubbo的核心领域模型中：
1.Protocol是服务域，它是Invoker暴露和引用的主功能入口，它负责
Invoker的声明周期管理
2.Invoker是实体域，它是Dubbo的核心模型，其他模型都向它靠拢，或
转换成它，它代表一个可执行体，可向它发起invoke调用，它有可能是
一个本地的实现，也可能是一个远程的实现，也可能一个集群实现
3.Invocation是会话域，它持有调用过程中的变量，比如方法名，参数等
