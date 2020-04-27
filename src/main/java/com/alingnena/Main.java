package com.alingnena.demoapp;

import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    doOperation(args);
    String username = readInput();
  }

  static void doOperation (String[] args) {
    int len = Integer.parseInt(args[0]);
    char[] thing = new char[len];

    for (int i = 0; i < thing.length; i++) {
      thing[i] = 'x';
    }

    System.out.println("Did a thing: " + len);
  }

  static String readInput () {
    Scanner in = new Scanner(System.in);

    System.out.println("Enter username:");
    String username = in.nextLine();

    return username;
  }
}
