package com_tutorial;



public class App {
    public static void main(String[] args) throws Exception {

        // instansiasi atau penciptaan objek
        Hero hero1 = new Hero();
        hero1.name = "Iron Man ";
        hero1.display();

        HeroStrength hero2 = new HeroStrength();
        hero2.name = "spideman";
        hero2.defencePower = 100;
        hero2.display();
        

        HeroIntell hero3 = new HeroIntell();
        hero3.name = "FLapu-Lapu";
        hero3.display();

    }
}
