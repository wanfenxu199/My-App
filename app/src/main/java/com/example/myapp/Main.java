package com.example.myapp;

import java.util.Scanner;

class say {
  String sayhello() {
    return "欢迎回家";
  }

  String sayerror() {
    return "密码错误，禁止入内";
  }
}

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    say systemsay = new say();
    System.out.println("请输入密码");

    if (in.hasNextInt()) {
      int password = in.nextInt();
      if (password == 888) {
        for (int i = 3; i > 0; i--) {
          System.out.println(systemsay.sayhello());
        }
      } else {
        System.out.println(systemsay.sayerror());
      }
    } else {
     
    System.out.println(systemsay.sayerror());
    System.out.println("尝试次数过多，请等待3秒...");
    
    try {
        Thread.sleep(3000); // 暂停3000毫秒（3秒）
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
}
    }
}

