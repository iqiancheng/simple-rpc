package me.qiancheng.simple.rpc;

import me.qiancheng.simple.rpc.api.HeyService;
import me.qiancheng.simple.rpc.server.RpcServer;
import me.qiancheng.simple.rpc.service.HeyServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Remote Procedure Call (RPC)
 * Created by Joseph on 8/4/16.
 */
public class Main {

    private static final Logger LOG = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        RpcServer server = new RpcServer(9527);
        HeyService heyService = new HeyServiceImpl();
        server.registry(heyService);
        server.start();
    }
}
