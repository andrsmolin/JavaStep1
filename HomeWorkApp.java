package Lesson1;

import java.util.Arrays;

public class HomeWorkApp {
    public static void main(String[] args) {
        //printThreeWords();
        //checkSumSign();
        //printColor();
        //compareNumbers();
        //System.out.println(checkSumRange(4, 5));
        //System.out.println(isNegative(8));
        //printString("Друзья", 2);
        //checkInt(-8);
        changeOneZero ();                        /* for 3 lesson*/
        printHundred();
        multyply();
        paintSquare();
        insertArray(4,6);
        findMinMax();
        System.out.println(checkBalance(createMass(12)));
        shiftMassiv(createMass(10),-2);
    }
    private static void shiftMassiv(int[] mass, int s) {                   /*  задание 8  */
        System.out.println("start " + Arrays.toString(mass));
        int l = mass.length - 1;
        if (s > 0) {
            System.out.println("shift to right size on " + s + " point");
            for (int j = 0; j < s; j++) {
                int tmp = mass[0];
                int tmp1 = mass[l];
                for (int i = 0; i < l; i++) {
                    mass[i] = tmp1;
                    tmp1 = tmp;
                    tmp = mass[i + 1];
                }
                mass[l] = tmp1;
            }
            System.out.println("finish " + Arrays.toString(mass));
        } else if (s < 0) {
            s = Math.abs(s);
            System.out.println("shift to left size on " + s + " point");
            for (int j = 0; j < s; j++) {
                int tmp = mass[0];
                int tmp1 = mass[l];
                for (int i = 0; i < l; i++) {
                    mass[l-i] = tmp;
                    tmp = tmp1;
                    tmp1 = mass[l-i-1];
                }
                mass[0] = tmp;
            }
            System.out.println("finish " + Arrays.toString(mass));
        }
        else {
            System.out.println("shift to " + s + " point");
            System.out.println("finish " + Arrays.toString(mass));
        }
    }
    private static boolean checkBalance(int[] mass) {                   /*  задание 7  */
        int a = 0;
        int b = 0;
        boolean r = false;
        for (int i = 0; i < mass.length; i++){
            a = a + mass[i]; b = 0;
            for (int j = i+1; j < mass.length; j++){
                b = b + mass[j];
            }
            if (a == b) r = true;
            //System.out.println(a + " " + b);
        }
        return r;
    }
    private static int[] createMass(int i) {                         /* для создания массива */
        int[] arr = new int[i];
    for(int a = 0; a<i; a++) {
        arr[a] = i+a;
    }
    return arr;
    }
    private static void findMinMax() {                                   /*   задание 6  */
        int[] data = {1,2,5,4,45,2,0};
        int a = data[0];
        int b = data[0];
        for(int i = 0; i < data.length; i++){
            if(a < data[i]){
                a = data[i];}
            if(b > data[i]){
                b = data[i];
            }
        }
        System.out.println("Min = " + b +", max = " + a);
    }
    private static void insertArray(int len, int initialValue) {      /*   задание 5  */
       int[] data = new int[len];
       for (int i = 0; i < data.length; i++) {
           data[i] = initialValue;
       }
       System.out.println(Arrays.toString(data));
   }
    private static void paintSquare() {                            /*   задание 4  */
        int[][] square = new int [5][5];
        for (int i = 0; i < square.length; i++){
            for (int j = 0; j < square[i].length; j++){
                if (i==j){square[i][j] = 1;}
                else if (i + j == square.length - 1) {
                    square[i][j] = 1;}
                else {square[i][j] = 88;}
                System.out.printf("%2d ", square[i][j]);
            }
            System.out.println();
        }
    }
    private static void multyply() {                                /*   задание 3  */
        int[] data = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < data.length; i++){
            if (data[i] < 6){
                data[i] = data[i] * 2;}
            else {continue;}
        }
        System.out.println(Arrays.toString(data));
    }
    private static void printHundred() {                            /*   задание 2  */
        int[] hundred = new int[100];
        for (int i = 0; i < hundred.length; i++){
            hundred[i] = 1 + i;}
            System.out.println(Arrays.toString(hundred));
    }
    private static void changeOneZero() {                           /*   задание 1  */
        int [] oneZero = {1,0,1,0,1};
        for (int i = 0; i < oneZero.length; i++) {
            if (oneZero[i] == 1) {
                oneZero[i] = 0;
            } else {oneZero[i] = 1;}
            System.out.println(oneZero[i]);
        }
    }
    /*
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
        //return x < 0;
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
