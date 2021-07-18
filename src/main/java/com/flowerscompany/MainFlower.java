package com.flowerscompany;

import java.util.HashSet;
import java.util.Set;

public class MainFlower implements Observable {
  private final Set<Observer> observers = new HashSet<>();
  private String mainFlower;

  @Override
  public void attach(Observer observer) {
    observers.add(observer);
  }

  @Override
  public void detach(Observer observer) {
    observers.remove(observer);
  }

  @Override
  public void notifyObservers() {
    observers.forEach(Observer::update);
  }

  public String getMainFlower() {
    return mainFlower;
  }

  public void setMainFlower(String mainFlower) {
    this.mainFlower = mainFlower;
    notifyObservers();
  }
}
