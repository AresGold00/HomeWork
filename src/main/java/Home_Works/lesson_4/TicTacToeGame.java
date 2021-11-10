package Home_Works.lesson_4;

import java.util.Random;
import java.util.Scanner;

public class TicTacToeGame {
    public static final String DOT_X = "X";
    public static final String DOT_xSecond = "O";
    public static final String DOT_O = "O";
    public static final String DOT_EMPTY = "*";
    public static int aiLevel = 0;
    private static int fieldSizeX;
    private static int fieldSizeY;
    public static String[][] field = new String[fieldSizeX][fieldSizeY];

    public static void main(String[] args) {
        mainMenu();
    }

    public static void modeTwoPlayers() {
        int count = 0;
        initField(3,3);
        while (true) {
            printField();
            userShot(DOT_X, 1);
            count++;
            if (checkWin(DOT_X)) {
                System.out.println("USER 1 WIN!!!");
                printField();
                break;
            }
            userShot(DOT_xSecond, 2);
            count++;
            if (checkWin(DOT_xSecond)) {
                System.out.println("USER 2 WIN!!!");
                printField();
                break;
            }
            if (count == Math.pow(fieldSizeX, 2)) {
                printField();
                break;
            }
            if (count == Math.pow(fieldSizeY, 2)) {
                printField();
                break;
            }
        }
    }

    public static void modeAgainstAI() {
        int count = 0;
        initField(3,3);
        while (true) {
            printField();
            userShot(DOT_X, 0);
            count++;
            if (checkWin(DOT_X)) {
                System.out.println("USER WIN!!!");
                printField();
                break;
            }
            aiShot();
            count++;
            if (checkWin(DOT_O)) {
                System.out.println("AI WIN!!!");
                printField();
                break;
            }
            if (count == Math.pow(fieldSizeX, 2)) {
                printField();
                break;
            }
            if (count == Math.pow(fieldSizeY, 2)) {
                printField();
                break;
            }
        }
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
                aiLevel();
                break;
            }
            case 2: {
                modeTwoPlayers();
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

    public static void aiLevel() {
        System.out.println("Выберите сложность компьютера: ");
        System.out.println("1. Простой.");
        System.out.println("2. Продвинутый.");
        System.out.println("3. Сложный.");
        System.out.println("4. Вернуться в предыдущее меню.");
        System.out.println("5. Выход.");
        int i = 0;
        Scanner sc = new Scanner(System.in);
        i = sc.nextInt();
        switch (i) {
            case 1: {
                aiLevel = 0;
                modeAgainstAI();
                break;
            }
            case 2: {
                aiLevel = 1;
                modeAgainstAI();
                break;
            }
            case 3: {
                aiLevel = 2;
                modeAgainstAI();
                break;
            }
            case 4: {
                mainMenu();
                break;
            }
            case 5: {
                System.exit(0);
                break;
            }
            default: {
                System.out.println("Было введено неверное значение!");
            }
        }
    }

    public static void initField(int sizeX, int sizeY) {
        fieldSizeX = sizeX;
        fieldSizeY = sizeY;

        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                field[y][x] = DOT_EMPTY;
            }
        }
    }

    public static void printField() {
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
//        for (int i = 0; i <= fieldSizeX; i++) {
//            for (int j = 0; j < fieldSizeY; j++) {
//                System.out.print(i + " ");
//            }
//        }
//        System.out.println();
//        for (int i = 0; i < fieldSizeX; i++) {
//            System.out.print((i + 1) + " ");
//            for (int j = 0; j < fieldSizeY; j++) {
//                System.out.print(field[i][j] + " ");
//            }
//            System.out.println();
//        }
    }

    public static void userShot(String sign, int i) {
        int x = -1;
        int y = -1;
        do {
            if (i == 0) {
                System.out.println("Введите координаты X Y (1 - " + fieldSizeX +fieldSizeY+ "): ");
            } else {
                System.out.println("Игрок " + i + ". Введите координаты x y (1 - " + fieldSizeX + fieldSizeY + "): ");
            }
            Scanner sc = new Scanner(System.in);
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        }
        while (isCellBusy(x, y));
        field[x][y] = sign;
    }

    public static void aiShot() {
        int x = -1;
        int y = -1;
        boolean ai_win = false;
        boolean user_win = false;
        // Находим выигрышный ход
        if (aiLevel == 2) {
            for (int i = 0; i < fieldSizeX ; i++) {
                for (int j = 0; j < fieldSizeY; j++) {
                    if (!isCellBusy(i, j)) {
                        field[i][j] = DOT_O;
                        if (checkWin(DOT_O)) {
                            x = i;
                            y = j;
                            ai_win = true;
                        }
                        field[i][j] = DOT_EMPTY;
                    }
                }
            }
        }
        // Блокировка хода пользователя, если он побеждает на следующем ходу
        if (aiLevel > 0) {
            if (!ai_win) {
                for (int i = 0; i < fieldSizeX; i++) {
                    for (int j = 0; j < fieldSizeY; j++) {
                        if (!isCellBusy(i, j)) {
                            field[i][j] = DOT_X;
                            if (checkWin(DOT_X)) {
                                x = i;
                                y = j;
                                user_win = true;
                            }
                            field[i][j] = DOT_EMPTY;
                        }
                    }
                }
            }
        }
        if (!ai_win && !user_win) {
            do {
                Random rnd = new Random();
                x = rnd.nextInt(fieldSizeX);
                y = rnd.nextInt(fieldSizeY);
            }
            while (isCellBusy(x, y));
        }
        field[x][y] = DOT_O;
        System.out.println("x = " + x + "| y = " + y + "| ai_win = " + ai_win + "| user_win = " + user_win);
    }


    public static boolean isCellBusy(int x, int y) {
        if (x < 0 || y < 0 || x > fieldSizeX - 1 || y > fieldSizeY - 1) {
            return false;
        }
        return field[x][y] != DOT_EMPTY;
    }




    public static boolean checkWin(String sign) {
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
}


