# simple-rpc
Demo of Simplified Remote-Procedure-Call

### 如何启动
1. 启动服务端：直接运行 `Main.java` 的 `main` 方法
```java
public static void main(String[] args) {
    RpcServer server = new RpcServer(9527);
    HeyService heyService = new HeyServiceImpl();
    server.registry(heyService);
    server.start();
}
```

2. 运行client包下的 `Client.java` 的 `main` 方法调用远程服务

```java
public static void main(String[] args) {
    Client client = new Client("localhost", 9527);
    HeyService proxy = client.getProxy(HeyService.class);
    proxy.say("dubbo");
}
``` 

3. 查看日志

