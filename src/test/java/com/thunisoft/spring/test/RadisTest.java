package com.thunisoft.spring.test;

import com.thunisoft.spring.service.RedisService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import redis.clients.jedis.Jedis;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * UserTest
 * @author Administrator
 * @version 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class RadisTest {

    @Autowired
    private RedisService redisService;

    /**
     * 通过BeanFactory获取bean.
     * @throws Exception
     */
    @Test
    public void testGetBean1() throws Exception {
        redisService.set("qwer", "setMyString");
        System.out.println(redisService.get("qwer"));

        List<String> dataList = new ArrayList<>();
        dataList.add("my");
        dataList.add("list");
        redisService.set("dataList", dataList);
        Object list = redisService.get("dataList");
        List<String> resList = (List<String>) list;
        for(int i=0; i<resList.size(); i++) {
            System.out.println("列表项为: "+resList.get(i));
        }
    }

    @Test
    public void RedisTest() {
        //连接本地redis 服务
        Jedis jedis = new Jedis("127.0.0.1");

        /*//设置 redis 字符串数据
        jedis.set("mykey", "www.baidu.com");
        // 获取存储的数据并输出
        System.out.println("String: " + jedis.get("mykey"));

        //存储数据到列表中
        jedis.lpush("mylist", "a");
        jedis.lpush("mylist", "b");
        jedis.lpush("mylist", "c");
        // 获取存储的数据并输出
        List<String> mylist = jedis.lrange("mylist", 0, 2);
        mylist.forEach( str -> {
            System.out.println("mylist: " + str);
        });

        jedis.sadd("myset", "aa");
        jedis.sadd("myset", "bb");
        Set<String> myset = jedis.keys("*");
        System.out.println("myset: " );
        myset.forEach(str -> {
            System.out.println("myset: " + str);
        });*/

        //取不到的原因是Template中set值时会先调用序列化器将键和值都序列化为byte字节数组放入redis数据库中
        System.out.println(jedis.get("qwer"));
    }

}
