
class A {
    private int x = 10;

    private void display() {
        System.out.println(x);
    }
}

class B {
    protected int y = 10;

    protected void display() {
        System.out.println(y);
    }
}

class C {
    public int z = 10;

    public void display() {
        System.out.println(z);
    }
}

class Main {
    public static void main(String[] args) {
        // A newObj = new A();
        B myObj = new B();
        C Obj1 = new C();
        // newObj.display();
        myObj.display();
        Obj1.display();
    }
}
