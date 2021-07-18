package com.flowerscompany;

public class Runner {
  public static void main(String[] args) {
    MainFlower mainFlower = new MainFlower();
    FloristOne floristOne = new FloristOne(mainFlower);
    FloristTwo floristTwo = new FloristTwo(mainFlower);

    mainFlower.setMainFlower("Zonkile");
    floristOne.update();
    floristTwo.update();

    mainFlower.setMainFlower("Tulipany");
    floristOne.update();
    floristTwo.update();
  }
}
