package com;

public class Demo {

  public static void main(String[] args) {
    Cock cock = new Cock();
    Hen hen = new Hen();
    ChildChicken childChicken = new ChildChicken();

    cock.sell();
    hen.sell();
    childChicken.sell();
  }

}
