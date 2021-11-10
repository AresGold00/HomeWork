package lessons.lesson_4;

import java.util.Random;
import java.util.Scanner;

public class TicTacToeGame2 {
    private static final char DOT_X = 'X';
    public static final String USER_SIGN_SECOND = "O";
    private static final char DOT_O = 'O';
    private static final char DOT_EMPTY = '.';
    private static final Scanner scanner = new Scanner(System.in);
    private static final Random random = new Random();
    private static char[][] field;
    private static char dotHuman;
    private static char dotAi;
    private static int fieldSizeX;
    private static int fieldSizeY;
    private static int scoreHuman;
    private static int scoreAi;
    private static int roundCounter;
    private static int winLength;

    public static void main(String[] args) {
        mainMenu();
        play();
    }

    public static void mainMenu() {
        System.out.println("Выберите режим игры: ");
        System.out.println("1. Игра против компьютера.");
        System.out.println("2. 2 игрока.");
        System.out.println("3. Выход.");
        int i = 0;
        Scanner sc = new Scanner(System.in);
        i = sc.nextInt();
        switch (i) {
            case 1: {
                play();
                break;
            }
            case 2: {
//                modeTwoPlayers();
                break;
            }
            case 3: {
                System.exit(0);
                break;
            }
            default: {
                System.out.println("Было введено неверное значение!");
            }
        }
    }

//    public static void modeTwoPlayers() {
//        int count = 0;
//        initField(3,3);
//        while (true) {
//            printField();
//            userShot(DOT_X, 1);
//            count++;
//            if (checkWin(DOT_X)) {
//                System.out.println("USER 1 WIN!!!");
//                printField();
//                break;
//            }
//            userShot(USER_SIGN_SECOND, 2);
//            count++;
//            if (checkWin(USER_SIGN_SECOND)) {
//                System.out.println("USER 2 WIN!!!");
//                printField();
//                break;
//            }
//            if (count == Math.pow(fieldSizeX, 2)) {
//                printField();
//                break;
//            }
//            if (count == Math.pow(fieldSizeY, 2)) {
//                printField();
//                break;
//            }
//        }
//    }

//    public static void modeAgainstAI() {
//        int count = 0;
//        initField(3,3);
//        while (true) {
//            printField();
//            userShot(DOT_X, 0);
//            count++;
//            if (checkWin(DOT_X)) {
//                System.out.println("USER WIN!!!");
//                printField();
//                break;
//            }
////            aiShot();
//            count++;
//            if (checkWin(DOT_O)) {
//                System.out.println("AI WIN!!!");
//                printField();
//                break;
//            }
//            if (count == Math.pow(fieldSizeX, 2)) {
//                printField();
//                break;
//            }
//            if (count == Math.pow(fieldSizeY, 2)) {
//                printField();
//                break;
//            }
//        }
//    }


    private static void play() {
        while (true) {
            chooseTheDot();
            playRound();
            System.out.printf("Счёт:  Человек     AI\n" +
                    "          %d       %d\n", scoreHuman, scoreAi);
                System.out.print("Хочешь поиграть еще раз? Y или N>>> ");
            if (!scanner.next().toLowerCase().equals("y")) {
                System.out.println("Good bye!");

                mainMenu();
                break;
            }
        }
    }

    private static void playRound() {
        System.out.printf("ROUND %d START\n", ++roundCounter);
        initField(3, 3);
        printField();
        if (dotHuman == DOT_X) {
            humanFirstTurn();
        } else {
            aiFirstTurn();
        }
    }

    private static void aiFirstTurn() {
        while (true) {
            aiTurn();
            printField();
            if (checkGame(dotAi)) break;
            userShot(1);
            printField();
            if (checkGame(dotHuman)) break;
        }
    }

    private static void humanFirstTurn() {
        while (true) {
            userShot(1);
            printField();
            if (checkGame(dotHuman)) break;
            aiTurn();
            printField();
            if (checkGame(dotAi)) break;
        }
    }


    private static void chooseTheDot() {
        System.out.print("Если вы хотите поиграть с 'X', введите 'O', в противном случае введите что-нибудь >>>");
        if (scanner.next().toLowerCase().equals("x")) {
            dotHuman = DOT_X;
            dotAi = DOT_O;
        } else {
            dotHuman = DOT_O;
            dotAi = DOT_X;
        }
    }

    private static boolean checkGame(char dot) {
        if (checkWin(dot)) {
            if (dot == dotHuman) {
                System.out.println("Human win!!!");
                scoreHuman++;
            } else {
                System.out.println("AI win!!!");
                scoreAi++;
            }
            return true;
        }
        if (checkDraw()) return true;
        return false;
    }

    private static void aiTurn() {
        int x;
        int y;
        do {
            x = random.nextInt(fieldSizeX);
            y = random.nextInt(fieldSizeY);
        } while (!isCellEmpty(y, x));
        field[y][x] = dotAi;
    }

    private static void userShot( int i) {
        int x;
        int y;

        do {
            if (i == 0) {
                System.out.println("Введите координаты X Y (1 - " + fieldSizeX + "): ");
            } else {
                System.out.println("Игрок " + i + ". Введите координаты x y (1 - " + fieldSizeX +  "): ");
            }
            Scanner sc = new Scanner(System.in);
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        }
        while (isCellBusy(x, y));
        field[y][x] = dotHuman;
    }

    public static boolean isCellBusy(int x, int y) {
        if (x < 0 || y < 0 || x > fieldSizeX - 1 || y > fieldSizeY - 1) {
            return false;
        }
        return field[x][y] != DOT_EMPTY;
    }


    public static boolean checkWin(char sign) {
        // проверка по строкам
        {
            for (int i = 0; i < fieldSizeX; i++) {
                if (field[i][0] == sign && field[i][1] == sign && field[i][2] == sign) {
                    return true;
                }
            }
        }
        // проверка по столбцам
        {
            for (int j = 0; j < fieldSizeY; j++) {
                if (field[0][j] == sign && field[1][j] == sign && field[2][j] == sign) {
                    return true;
                }
            }
        }
        // проверка диагоналей
        {
            if (field[0][0] == sign && field[1][1] == sign && field[2][2] == sign) {
                return true;
            }
            if (field[0][2] == sign && field[1][1] == sign && field[2][0] == sign) {
                return true;
            }
        }
        return false;
    }

    private static boolean checkDraw() {
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                if (isCellEmpty(y, x)) return false;
            }
        }
        System.out.println("It's DRAW!!!");
        return true;
    }

    private static boolean isCellEmpty(int y, int x) {
        return field[y][x] == DOT_EMPTY;
    }

    private static boolean isCellValid(int y, int x) {
        return x >= 0 && y >= 0 && x < fieldSizeX && y < fieldSizeY;
    }

    private static void initField(int sizeX, int sizeY) {
        fieldSizeX = sizeX;
        fieldSizeY = sizeY;
        field = new char[fieldSizeY][fieldSizeX];
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                field[y][x] = DOT_EMPTY;
            }
        }
    }

    private static void printField() {
        System.out.print("+");
        for (int i = 0; i < fieldSizeX * 2 + 1; i++) {
            System.out.print(i % 2 == 0 ? "-" : i / 2 + 1);
//            if (i % 2 == 0) {
//                System.out.print("-");
//            } else {
//                System.out.print(i / 2 + 1);
//            }
        }
        System.out.println();
        for (int i = 0; i < fieldSizeY; i++) {
            System.out.print(i + 1 + "|");
            for (int j = 0; j < fieldSizeX; j++) {
                System.out.print(field[i][j] + "|");
            }
            System.out.println();
        }
        for (int i = 0; i < fieldSizeX * 2 + 1; i++) {
            System.out.print("_");
        }
        System.out.println();
//        for (int y = 0; y < fieldSizeY; y++) {
//            for (int x = 0; x < fieldSizeX; x++) {
//                System.out.print(field[y][x] + " ");
//            }
//            System.out.println();
//        }
    }
}
