public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        // Пишем код для задачи 1
        for (int j = 1; j <= 10; j++) {
            System.out.println(j);
        }
    }

    public static void task2 () {
        System.out.println("\nЗадача 2");
        // Пишем код для задачи 2
        for (int i = 10; i >= 1; i-- ) {
            System.out.println(i);
        }
    }

    public static void task3 () {
        System.out.println("\nЗадача 3");
        // Пишем код для задачи 3
        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println(i);
        }
    }

    public static void task4 () {
        System.out.println("\nЗадача 4");
        // Пишем код для задачи 4
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
    }


    public static void task5 () {
        System.out.println("\nЗадача 5");
        // Пишем код для задачи 5
        for (int i = 1904; i <= 2096; i += 4 ) {
            System.out.println(i + " год является високосным.");
        }

    }
    public static void task6 () {
        System.out.println("\nЗадача 6");
        // Пишем код для задачи 6
        for (int i = 7; i <= 98; i += 7) {
            System.out.println(i);
        }
    }
    public static void task7 () {
        System.out.println("\nЗадача 7");
        // Пишем код для задачи 7
        for (int i = 1; i <= 512; i *= 2) {
            System.out.println(i);
        }
    }

    public static void task8 () {
        System.out.println("\nЗадача 8");
        // Пишем код для задачи 8

        int deposit = 29000;
        int totalSum = 0;

        for (int i = 0; i <= 12; i++) {
            System.out.println("Месяц " + i + ", сумма накоплений равна " + totalSum + " рублей.");
            totalSum = totalSum + deposit;
        }
    }
    public static void task9 () {
        System.out.println("\nЗадача 9");
        // Пишем код для задачи 9
        int deposit = 29000;
        double totalSum = 0.0;

        for (int i = 0; i <= 12; i++) {
            String totalSumFormatted = String.format("%.2f", totalSum);
            System.out.println("Месяц " + i + ", сумма накоплений равна " + totalSumFormatted + " рублей.");
            totalSum = totalSum*1.01 + deposit;
        }
    }
    public static void task10 () {
        System.out.println("\nЗадача 10");
        // Пишем код для задачи 10
        for (int i = 1; i<=10; i++) {
            System.out.println("2*" + i + " = " + 2*i );
        }
    }

}