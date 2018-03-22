package com.cherishclark;

public class Main {

    public static void main(String[] args) {
	Animal animal = new Animal("Animal", 1, 1, 5, 5);

	Dog dog = new Dog("yorkie", 8, 20, 4,1, 1, 3,"long silky");
	dog.eat();

//	dog.walk();
	dog.run();

	Outlander outlander = new Outlander(36);
	outlander.accelerate(30);
    }


}

