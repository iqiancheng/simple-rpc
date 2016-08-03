package me.qiancheng.simple.rpc.service;

import me.qiancheng.simple.rpc.api.HeyService;

/**
 * Created by Joseph on 8/4/16.
 */
public class HeyServiceImpl implements HeyService {

    public String say(String words) {
        String msg = "hello, "+words;
        System.out.println(msg);
        return msg;
    }
}
