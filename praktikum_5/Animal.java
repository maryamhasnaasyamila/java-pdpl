package praktikum_5;

// Quiz no. 2

class Animal {
    void eat() {
        System.out.println("eating...");
    }  
}

class Dog extends Animal {
    void bark() {
        System.out.println("barking...");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("meowing...");
    }
}

class TestInheritance3 {
    public static void main(String arg[]) {
        Cat c = new Cat();
        c.meow();
        c.eat();
    }
}

// Jawaban: mengasilkan output "meowing.." "eating..."