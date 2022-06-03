package Lesson6;

public class Cat extends Animal{
    int cats = 0;
    public Cat(String name) {
        super(name, "Кот");
        Main.Cats += 1;
    }
    @Override
    void run(int a) {
        if (a < 0) {
            System.out.println("Cat never run's back");}
        else if (a < 200) {
            super.run(a);
            }
        else {
            System.out.println("Кот не может пробежать больше 200 метров (((");
        }
    }
    @Override
    void swim(int a) {
        System.out.println("Кот не умеет плавать");
    }
}
