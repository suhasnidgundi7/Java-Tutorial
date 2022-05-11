class Animal {
    public void move(){
        System.out.println("This is Animal Class");
    }
}

class Dog extends Animal {
    public void display(){
        super.move();
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dg = new Dog();
        dg.display();
    }
}