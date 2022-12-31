package com_tutorial;

class Hero {
    String name;

    void display() {
        System.out.println("Nama Hero : " + this.name);

    }

}

class HeroStrength extends Hero {
    // kosong
}

class HeroIntell extends Hero {

}

public class App {
    public static void main(String[] args) throws Exception {

        // instansiasi atau penciptaan objek
        Hero hero1 = new Hero();
        hero1.name = "Iron Man ";
        hero1.display();

        HeroStrength hero2 = new HeroStrength();
        hero2.name = "spideman";
        hero2.display();

        HeroIntell hero3 = new HeroIntell();
        hero3.name = "FLapu-Lapu";
        hero3.display();

    }
}
