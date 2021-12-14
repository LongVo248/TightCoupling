package com.company;

public class Tester_TightCoupling {
    public static void main(String[] args) {
        A a = new A();
        a.display();
    }
}

class A {
    B b;

    public A() {
        b = new B();
    }

    public void display() {
        System.out.println("A");
        b.display();
    }
}

class B {
    public B() {
    }

    public void display() {
        System.out.println("B");
    }
}
