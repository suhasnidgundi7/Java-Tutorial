class Animal
{
    String name = "Animal Name : ";
}

class Dog extends Animal
{
    String animal_name = "Dog";
    void display()
    {
        System.out.println(name+animal_name);
    }
}

public class Main extends Dog
{
    public static void main (String[] args) {
        Main mn = new Main();
        mn.display();
    }
}