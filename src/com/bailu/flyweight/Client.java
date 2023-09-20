package com.bailu.flyweight;

/**
 * @Author: JasonD
 * @date: 2023/9/6 22:16
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        WebSiteFactory factory = new WebSiteFactory();

        WebSite webSite = factory.getWebSiteCategory("news");
        webSite.use(new User("tom"));

        WebSite webSite1 = factory.getWebSiteCategory("blog");
        webSite1.use(new User("jack"));

        WebSite webSite2 = factory.getWebSiteCategory("blog");
        webSite2.use(new User("jason"));

        System.out.println(factory.getWebSiteCount());
    }
}
