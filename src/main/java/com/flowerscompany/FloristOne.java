package com.flowerscompany;

public class FloristOne implements Observer {
  private final MainFlower mf;
  private String mainFlower;

  public FloristOne(MainFlower mf) {
    this.mf = mf;
    mainFlower = mf.getMainFlower();
  }

  @Override
  public void update() {
    mainFlower = mf.getMainFlower();
    System.out.println(
        String.format(
            "Main flowers %s in %s was set!", mainFlower, this.getClass().getSimpleName()));
  }
}
