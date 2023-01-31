package com.imooc.factory.computershop;

public class ShopAssistant {
    public Computer suggest(String purpose){
        switch (purpose) {
            case "网站建设":
                return new Server();
            case "电竞比赛":
                return new Desktop();
            case "日常办公":
                return new Macbook();
            case "游戏":
                return new Alienware();
        }
        return null;
    }
}
