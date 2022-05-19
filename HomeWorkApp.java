package Lesson1;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class HomeWorkApp {
    public static void main(String[] args) {
        //printThreeWords();
        //checkSumSign();
        //printColor();
        //compareNumbers();
        System.out.println(checkSumRange(4, 5));
        System.out.println(isNegative(-6));
        printString("Друзья", 2);
        checkInt(-8);
    }

    private static void checkInt(int a) {
        if (a >= 0){
            System.out.println("Число положительное");}
            else {System.out.println("Число отрицательное");
        }
    }
    public static boolean isNegative(int x) {
        if (x < 0) {
            return true;
        }
        return false;
    }
    private static void printString(String a, int b) {
        for (int i = 0; i < b; i++) {
            System.out.println(a);
        }
    }

    private static boolean checkSumRange(int a, int b) {
        boolean result = true;
        if (a + b < 10 || a + b > 20) {
            result = false;
        }
        return result;
    }

    /*static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    static void checkSumSign() {
        int a = 1;
        int b = -3;
        if (a + b >= 0) System.out.println("Сумма положительная");
        else {
            System.out.println("Сумма отрицательная");
        }
    }
    static void printColor(){
        int value = -1;
        if (value<=0) System.out.println("Красный");
        else if (value<=100) {System.out.println("Желтый");
            
        } else {System.out.println("Зеленый");}
    }
    static void compareNumbers(){
        int a = 22;
        int b = 33;
        if (a>=b) System.out.println("a>=b"); else {System.out.println("b>a");}
    }*/
}
