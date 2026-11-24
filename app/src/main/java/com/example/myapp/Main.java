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
   
    while (true) {
        System.out.println("请输入密码");
      if (!in.hasNextInt()) {
           System.out.println("请输入数字");
           in.next();
           continue;
        }
        int password = in.nextInt();
      if(password == 888){
        
        for(int i = 3;i > 0;i--){
          System.out.println(systemsay.sayhello());
          
        }
        break;
      }else{
        System.out.println(systemsay.sayerror());
      }  
    }
  }
}
