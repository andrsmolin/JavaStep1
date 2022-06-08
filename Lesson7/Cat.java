package Lesson7;
import java.util.concurrent.ThreadLocalRandom;
public class Cat {
    private String name;
    private int hungry;

    public Cat(String name, int hungry) {
        this.name = name;
        this.hungry = hungry;
    }

    public void eat(Plate plate) {
        int catEatFoodCount = ThreadLocalRandom.current().nextInt(4) + 3;
        if (catEatFoodCount > plate.getFootCount()){ // проверка на отрицательные значения корма
            catEatFoodCount = plate.getFootCount();
        }
        if (catEatFoodCount > hungry) {
            catEatFoodCount = hungry;
        }

        plate.decreaseFood(catEatFoodCount);
        setHungry(catEatFoodCount);
        if (getHungry() <= 0){
            Test.fullCount += 1;
            System.out.printf("Котик %s съел %d корма и наелся", name, catEatFoodCount);
            System.out.println();
        } else {
            System.out.printf("Котик %s съел %d корма и голоден на %d", name, catEatFoodCount, getHungry());
            System.out.println();
        }
    }

    public int setHungry(int a) {
        this.hungry = hungry - a;
        return hungry;
    }

    public int getHungry() {
        return hungry;
    }

}
