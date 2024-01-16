package com.github.liyue2008.rpc.client.stubs;
import com.github.liyue2008.rpc.serialize.SerializeSupport;

/**
 * 方便观测和调试，这里展示HelloService的Stub类源码文件；
 */
public class HelloServiceStub extends AbstractStub implements com.github.liyue2008.rpc.hello.HelloService {
    @Override
    public String hello(String arg) {
        return SerializeSupport.parse(
                invokeRemote(
                        new RpcRequest(
                                "com.github.liyue2008.rpc.hello.HelloService",
                                "hello",
                                SerializeSupport.serialize(arg)
                        )
                )
        );
    }
}