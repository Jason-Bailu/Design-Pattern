package com.bailu.flyweight;

import java.util.HashMap;

/**
 * @Author: JasonD
 * @date: 2023/9/6 22:14
 * @Description:
 */
public class WebSiteFactory {
    private HashMap<String, ConcreteWebSite> pool = new HashMap<>();

    //返回一个网站，没有就添加一个在池子中
    public WebSite getWebSiteCategory(String type) {
        if (!pool.containsKey(type)) {
            pool.put(type, new ConcreteWebSite(type));
        }
        return (WebSite) pool.get(type);
    }

    //获取池子中有多少个网站
    public int getWebSiteCount() {
        return pool.size();
    }
}
