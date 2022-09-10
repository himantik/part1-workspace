package com.entertainment.client;

import com.entertainment.DisplayType;
import com.entertainment.Television;

public class TelevsionClient {

  public static void main(String[] args) {

    Television tv1 = new Television();
    tv1.setBrand("Zenith");
    tv1.setVolume(125);
    tv1.setDisplay(DisplayType.LED);


    Television tv2 = new Television();
    tv2.setBrand("RCA");
    tv2.setVolume(18);

    tv1.turnOn();
    tv1.turnOff();
    System.out.println();
    System.out.printf("%d television instance created%n" , Television.getInstanceCount());

    tv2.turnOn();
    tv2.turnOff();
    System.out.printf("%d television instance created%n" , Television.getInstanceCount());

    System.out.println(tv1);
    System.out.println(tv1);
    System.out.println(tv2);

    Television tv3 = new Television("LG", 55);
    System.out.println(tv3);
    System.out.printf("%d television instance created%n", Television.getInstanceCount());
  }
}
