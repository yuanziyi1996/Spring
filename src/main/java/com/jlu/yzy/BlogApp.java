package com.jlu.yzy;
/**
 * 用switch语句重写下面的代码，功能逻辑保持一致：
 */

import java.util.Scanner;

public class BlogApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean flag = true;
        while(flag){
            String command = scanner.nextLine();
            switch (command){
                case "exit":
                    System.out.println("系统退出");
                    flag=false;
                    break;
                case "create":
                    System.out.println("创建博客");
                    continue;
                case "list":
                    System.out.println("展示博客列表");
                    continue;
                case "show":
                    System.out.println("展示博客内容");
                    continue;
                case "delete":
                    System.out.println("删除博客");
                    continue;
                default:
                    System.out.println("无效指令");
                    continue;
            }
        }

/*
        boolean exit = false;
        while (!exit) {
            String command = scanner.nextLine();
            System.out.println(command);

            if (command.equals("exit")) {
                System.out.println("系统退出");
                exit = true;
            } else if (command.equals("create")) {
                // 处理创建博客的逻辑
                System.out.println("创建博客");
            } else if (command.equals("list")) {
                // 处理显示博客列表的逻辑
                System.out.println("展示博客列表");
            } else if (command.equals("show")) {
                // 处理显示博客内容的逻辑
                System.out.println("展示博客内容");
            } else if (command.equals("delete")) {
                // 处理删除博客的逻辑
                System.out.println("删除博客");
            } else {
                System.out.println("无效指令");
                continue;
            }
        }
        scanner.close();*/
    }
}
