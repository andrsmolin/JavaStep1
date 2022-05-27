package game;

import java.util.Random;
import java.util.Scanner;

public class MainGame {

    private static final int SIZE = 3;
    private static final char HUMAN = 'X';
    private static final char COMP = 'O';
    private static final char SPACE = '*';
    public static final String HEAD_SYMBOL = "K";
    public static final String HEADER = " ";
    private static boolean WIN = false;
    private static boolean NOWIN = false;

    private static char[][] MAP = new char[SIZE][SIZE];
    private static int WINSIZE = 3;
    private static Scanner in = new Scanner(System.in);
    private static Random rnd = new Random();

    public static void main(String[] args){
        initMap();               //Рисуем пустую карту
        printHeader();
        printBody();
        playGame();
    }
    private static void playGame() {                // Игра!
        while (!WIN && !NOWIN){
                humanTurn();
                if (WIN) break;
                checkNowin(MAP);
                turnAi();
                checkNowin(MAP);
            }
    }
    private static void turnAi() {                           // Ход компа
        System.out.println("Ходит компьютер");
        int rowNumber;
        int columnNumber;
        do {
            rowNumber = rnd.nextInt(SIZE);
            columnNumber = rnd.nextInt(SIZE);                 
            } while (!isCellFree(rowNumber, columnNumber));
        MAP[rowNumber][columnNumber] = COMP;
        printHeader();
        printBody();
        chekWin(rowNumber, columnNumber, COMP);
    }
    private static void humanTurn() {                   // Ход игрока
        checkNowin(MAP);
        System.out.println("Ход человека!");
        int rowNumber;
        int columnNumber;
        while (true){                                 //цикл будет идти пока не выполнятся все проверки
        System.out.println("Введите номер строки");
        rowNumber = getInt() - 1;                     //метод проверяет введено ли число и входит ли оно в диапозон
        System.out.println("Введите номер столбца");
        columnNumber = getInt() - 1;
        if (isCellFree(rowNumber, columnNumber)){     //метод проверяет свободна ли ячейка (можно использовать для хода ИИ)
            break;}
        System.out.println("Сюда нельзя");
        }
        MAP[rowNumber][columnNumber] = HUMAN;
        printHeader();
        printBody();
        chekWin(rowNumber, columnNumber, HUMAN);
    }
    private static void chekWin(int a, int b, char c) {    //Проверка на победу
        int countRow = 0;
        int countColumn = 0;
        int countD1 = 0;
        int countD2 = 0;
        for (int i = 0; i < SIZE; i++){
            if (MAP[a][i] == c){
               countRow += 1;
            } else {
                countRow = 0;
            }
            if (MAP[i][b] == c){
                countColumn += 1;
            }
            else {countColumn = 0;
            }
            if (MAP[i][i] == c){
                countD1 += 1;
            } else {countD1 = 0;}
            if (MAP[i][MAP.length-1-i] == c) {
                countD2 += 1;
            } else {
                countD2 = 0;
            }
            if (countColumn == WINSIZE || countRow == WINSIZE || countD1 == WINSIZE || countD2 == WINSIZE){
                if (c == HUMAN) {
                    System.out.println("Ты победил!");
                } else {System.out.println("Комп выиграл");
                }
               WIN = true;
            }
        }
    }
    private static void checkNowin(char[][] MAP) {             // Проверка на ничью
        int count = 0;
        for (int i = 0; i < SIZE; i++){
            for (int j = 0; j < SIZE; j++){
                if (!isCellFree(i, j)){
                    count += 1;
                }
            }
        }
        if (count >= SIZE*SIZE){
            System.out.println("Все ходы закончились!! Ничья.");
            NOWIN = true;
        }
    }
    private static boolean isCellFree(int rowNumber, int columnNumber) {    // Проверка на свободу ячейки
        return MAP[rowNumber][columnNumber] == SPACE;
    }
    private static int getInt() {                                           // Проверка введенного символа
        while (true) {
            if (in.hasNextInt()) {
                int n = in.nextInt();
                if (checkD(n)) {
                    return n;
                } else {
                    System.out.println("Сюда нельзя");
                }
            } else{
            System.out.println("Ждем число!");
            in.next();
            }
         }
    }
private static boolean checkD(int n){                    // Проверка на диапазон
    return n > 0 && n <= SIZE;
}
    private static void printBody() {                      // Печать поля
        for (int i = 0; i < SIZE; i++){
            printNumber(i);
            for (int j = 0; j < SIZE; j++){
                System.out.print(MAP[i][j]+ HEADER);
            }
            System.out.println();
        }
    }
    private static void printNumber(int i) {                   // Печать левой координаты поля
        System.out.print(i + 1 + HEADER);
    }
    private static void printHeader() {                         // Печать шапки поля
        System.out.print(HEAD_SYMBOL + HEADER);
        for (int i = 0; i < SIZE; i++){
            printNumber(i);
        }
        System.out.println();
    }
    private static void initMap() {                              //  Создаем пустое поле
        for (int i= 0; i < SIZE; i++){
            for (int j = 0; j < SIZE; j++){
                MAP[i][j] = SPACE;
            }
        }
    }
}
