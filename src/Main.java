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
        task8Var2();

    }

    public static void task1() {
        System.out.println("Task1");
        int savingsPerMonth = 15_000;
        int totalSavings = 0;
        int monthCount = 0;

        while (totalSavings <= 2_459_000) {
            totalSavings += savingsPerMonth;
            monthCount++;
            System.out.printf("Месяц %d сумма накоплений равна %d рублей\n", monthCount, totalSavings);
        }

    }

    public static void task2() {
        System.out.println("Task2");
        int i = 1;
        while (i < 11) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println("\n");

        for (int j = 10; j > 0; j--) {
            System.out.print(j + " ");
        }

        System.out.println("\n");

    }

    public static void task3() {
        System.out.println("Task3");
        int birthRate = 17;
        int mortality = 8;
        int population = 12_000_000;

        for (int i = 1; i <= 10; i++) {
            population = population + population * (birthRate - mortality) / 1000;
            System.out.printf("Год %d численность населения составляет %d\n", i, population);
        }


    }

    public static void task4() {
        System.out.println("Task4");
        int initialDeposit = 15_000;
        int targetAmount = 12_000_000;
        double deposit = initialDeposit;
        double depositInterest = 0.07;
        int monthCount = 0;

        while (deposit <= targetAmount) {
            deposit = deposit + deposit * depositInterest;
            monthCount++;
            System.out.printf("За месяц %d сумма накоплений %.2f руб.\n", monthCount, deposit);
        }

    }

    public static void task5() {
        System.out.println("Task5");
        int initialDeposit = 15_000;
        int targetAmount = 12_000_000;
        double deposit = initialDeposit;
        double depositInterest = 0.07;
        int monthCount = 0;

        while (deposit <= targetAmount) {
            for (int i = 1; i <= 6; i++) {
                deposit = deposit + deposit * depositInterest;
            }

            monthCount += 6;
            System.out.printf("За месяц %d сумма накоплений %.2f руб.\n", monthCount, deposit);
        }
    }


    public static void task6() {
        System.out.println("Task6");
        int initialDeposit = 15_000;
        //int targetAmount = 0;
        double deposit = initialDeposit;
        double depositInterest = 0.07;
        int monthCount = 0;
        int depositTerm = 9 * 12;

        do {
            for (int i = 1; i <= 6; i++) {
                deposit = deposit + deposit * depositInterest;
            }
            monthCount += 6;
            System.out.printf("За месяц %d сумма накоплений %.2f руб.\n", monthCount, deposit);
        }
        while (monthCount <= depositTerm);

    }

    public static void task7() {
        System.out.println("Task7");
        int firstFridayDate = 7;

        do {
            System.out.printf("Сегодня пятница, %d-е число. Необходимо подготовить отчет\n", firstFridayDate);
            firstFridayDate += 7;
        } while (firstFridayDate < 31);

    }


    public static void task8() {
        System.out.println("Task8");
        int startYear = 1823;
        int endYear = 2123;
        int flyPeriod = 79;

        for (int i = startYear - startYear % flyPeriod; i <= endYear; i+=flyPeriod) {
            if (i >= startYear) {
                System.out.println(i);
            }
        }

    }


    public static void task8Var2() {
        System.out.println("Task8");
        int startYear = 1823;
        int endYear = 2123;
        int flyPeriod = 79;

        for (int i = 0; i <= endYear; i+=flyPeriod) {
            if (i >= startYear) {
                System.out.println(i);

            }
        }

    }


}