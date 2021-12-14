package com.company;

import java.io.IOException;

public class Tester_LooseCoupling {
    public static void main(String args[]) throws IOException {
        Show b1 = new B1();
        Show c = new C();

        A1 a = new A1(b1);
        //a.display() will print A and B
        a.display();

        A1 a1 = new A1(c);
        //a.display() will print A and C
        a1.display();
    }
}

interface Show {
    public void display();
}

class A1 {
    Show s;

    public A1(Show s) {
        //s is loosely coupled to A
        this.s = s;
    }

    public void display() {
        System.out.println("A");
        s.display();
    }
}

class B1 implements Show {
    public B1() {
    }

    public void display() {
        System.out.println("B");
    }
}

class C implements Show {
    public C() {
    }

    public void display() {
        System.out.println("C");
    }
}