package com_tutorial;

public class HeroStrength extends Hero {
  // atribut
  double defencePower;

  //Method Overriding
  void display(){
    System.out.println("Hero Strength");
    System.out.println("Nama Hero ; " + this.name);
    System.out.println("Defance Power : " + this.defencePower);
  }
  
}
