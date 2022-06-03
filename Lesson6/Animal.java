package Lesson6;

public class Animal {

    private String name;
    private String animal;
    //public int animals = 0;

    public Animal(String name, String animal) {
        Main.Animals += 1;
        this.name = name;
        this.animal = animal;
    }
        void run(int a){
            System.out.printf("%s %s пробежал %d метров", animal, name, a);
        }

        void swim(int a){
        System.out.printf("%s %s проплыл %d метров", animal, name, a);
    }
}
