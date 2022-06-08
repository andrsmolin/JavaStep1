package Lesson7;
import java.util.Scanner;

public class Test {
    private static Scanner in = new Scanner(System.in);
public static int fullCount = 0;

    public static void main(String[] args) throws InterruptedException {
        Cat[] arrCat = new Cat[5];
        arrCat[0] = new Cat("Аарсик", 10);
        arrCat[1] = new Cat("Барсик", 15);
        arrCat[2] = new Cat("Варсик", 20);
        arrCat[3] = new Cat("Гарсик", 30);
        arrCat[4] = new Cat("Дарсик", 35);


        Plate plate = new Plate(90);
        plate.printInfo();
        while (true) {
            for (int i = 0; i < arrCat.length; i++) {
                if (arrCat[i].getHungry() <= 0) {
                    continue;
                }
                arrCat[i].eat(plate);
                Thread.sleep(1000);
            }

                if (fullCount == arrCat.length){
                    System.out.println(" Все коты наелись ");
                    plate.printInfo();
                    break;
                }
            if (plate.getFootCount() == 0) {
                System.out.println("Еда закончилась, " + fullCount + " котов наелось");
                System.out.println("Добавить еды в миску?");
                System.out.println("0 - нет, число(положительное, не больше 100) - сколько добавим");
                int n = in.nextInt();
                if (n == 0) {
                    System.out.println("Ясно, пусть мышей ловят!");
                    plate.printInfo();
                    break;
                } else if (n > 0 && n <= 100) {
                    System.out.println("Муррр, от души добавка!");
                    plate.increaseFood(n);
                }
                else {
                    System.out.println("Аккуратней сыпать надо! Котов спугнул!");
                    break;
                }
            }
            }
        }

    }


