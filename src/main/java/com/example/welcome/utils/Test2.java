package com.example.welcome.utils;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.time.LocalDateTime;

public class Test2 {
    public static void main(String[] args) {
        String address = getIpAddress();
        System.out.println("address = " + address);
        try {
            LocalDateTime now = LocalDateTime.now();
            int year = now.getYear();
            Document document = Jsoup.connect("https://"+ year+".ip138.com/").get();
            String text = document.body().tagName("img").text();
            System.out.println("text = " + text);
            String repText = text.replace("ip查询api接口（1元1天约五万次） 安卓SDK（2023年免费）", "");
            System.out.println("repText = " + repText);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static String getIpAddress() {
        try {
            LocalDateTime now = LocalDateTime.now();
            int year = now.getYear();
            Document document = Jsoup.connect("https://"+ year+".ip138.com/").get();
            String text = document.body().tagName("img").text();
//            System.out.println("text = " + text);
            String repText = text.replace("ip查询api接口（1元1天约五万次） 安卓SDK（2023年免费）", "");
//            System.out.println("repText = " + repText);
            String[] split = text.split("：");
            split[1] = split[1].replace(" ", "");

            return  split[1];
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
