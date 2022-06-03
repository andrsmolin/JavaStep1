package Lesson6;

public class Dog extends Animal{
        public Dog(String name) {
        super(name, "Пес");
        Main.Dogs += 1;
    }

    @Override
    void run(int a) {
        if (a > 500) {
            a = 500;
        } else if (a < 0) {
            a = 0;
        }
        super.run(a);
    }

    @Override
    void swim(int a) {
        if (a > 10) {
            a = 10;
        } else if (a < 0) {
            a = 0;
        }
        super.swim(a);
    }
}
