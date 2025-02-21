package com.jiehfut.redis.aredisjedis.demo;

import redis.clients.jedis.Jedis;

import java.util.Set;

public class JedisDemo {
    // 与 jdbc 同理
    public static void main(String[] args) {
        // 1.测试连接 redis 服务器是否成功
        Jedis jedis = new Jedis("192.168.6.100", 6379);
        // 2.指定访问服务器的密码
        jedis.auth("959452");
        // 3.获得了 jedis 的客户端，可以像 jdbc 一样进行访问我们的 redis 服务
        System.out.println(jedis.ping());  // PONG

        // System.out.println(jedis.info());
        Set<String> keys = jedis.keys("*");
        for (String key : keys) {
            System.out.println(key);
        }

    }
}
