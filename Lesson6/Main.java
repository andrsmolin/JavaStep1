package Lesson6;

public class Main {
    public static int Animals = 0;
    public static int Dogs = 0;
    public static int Cats = 0;

    public static void main(String[] args) {
    Cat cat1 = new Cat("Барсик");
    Dog dog1 = new Dog("Рэкс");
    cat1.run(230);
    dog1.run(510);
        System.out.println();
        System.out.println("Было создано " + Animals + " животных");
        System.out.println("Из них " + Dogs + " псов и " + Cats + " котов");
    }
    }
