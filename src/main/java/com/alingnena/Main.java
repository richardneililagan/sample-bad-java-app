package com.alingnena.demoapp;

public class Main {
  public static void main(String[] args) {
    int len = Integer.parseInt(args[0]);
    char[] thing = new char[len];

    for (int i = 0; i < thing.length; i++) {
      thing[i] = 'x';
    }

    System.out.println("Did a thing: " + len);
  }
}
