package praktikum_5;

class A {
    void msg() {
        System.out.println("Hello");
    }
}

class B {
    void msg() {
        System.out.println("Welcome");
    }
}

class C extends A,B {
    Public static void main(String args[]) { 
        C obj=new C();
        obj.msg();
    }
    // Now wich msg() method would be invoked
}

// Jawaba: Error sebelum di compile