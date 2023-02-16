public class Main {
    public static void main(String[] args) {

        // task 1
        System.out.println("Задача 1");

        int savings = 0;
        int extraMoney = 15_000;
        int totalAmount = 2_459_000;
        int monthTotal = 0;
        while (savings < totalAmount) {
            savings += extraMoney;
            monthTotal ++;
            System.out.println("Месяц " + monthTotal + " сумма накоплений равна " + savings + " рублей");
        }

        // task 2
        System.out.println("Задача 2");

        int numbers = 0;
        while (numbers < 10) {
            numbers++;
            System.out.print(numbers + " ");
        }
        System.out.println();
        for (numbers = 10 ; numbers > 0; numbers--) {
            System.out.print(numbers + " ");
        }

        // task 3
        System.out.println("Задача 3");

        int totalPopulation = 12_000_000;
        int populationPer1000People = 17;
        int mortalityPer1000People = 8;
        int years = 10;
        for (int i = 1; i <= years; i++) {
            totalPopulation += (totalPopulation / 1000) * (populationPer1000People - mortalityPer1000People);
            System.out.println("Год " + i + " численность населения составляет " + totalPopulation);
        }

        // task 4
        System.out.println("Задача 4");

        double initialAmount = 15000;
        double monthlyPercentage = 0.07;
        int maxLimit = 12_000_000;
        int totalMonths = 1;
        while (initialAmount <= maxLimit) {
            initialAmount *= (1 + monthlyPercentage);
            System.out.println("Месяц " + totalMonths + " текущие накопления " + initialAmount);
            totalMonths++;
        }

        // task 5
        System.out.println("Задача 5");

        double initialAmount2 = 15000;
        double monthlyPercentage2 = 0.07;
        int maxLimit2 = 12_000_000;
        int totalMonths2 = 1;
        while (initialAmount2 <= maxLimit2) {
            initialAmount2 *= (1 + monthlyPercentage2);
            if (totalMonths2 % 6 == 0) {
                System.out.println("Месяц " + totalMonths2 + " текущие накопления " + initialAmount2);
            }
            totalMonths2++;

        }

        // task 6
        System.out.println("Задача 6");

        double currentMoney = 15000;
        double ratePerMonth = 0.07;
        for (int month = 1; month < 9 * 12; month++ ) {
            currentMoney *= (1 + ratePerMonth);
            if ( month % 6 == 0) {
                System.out.println("Месяц " + month + ", накопления = " + currentMoney);
            }
        }

        // task 7
        System.out.println("Задача 7");

        int friday = 2;
        while (friday <= 31) {
            System.out.println("Сегодня пятница, " + friday + "-e число. Неоходимо подготовить отчет.");
            friday += 7;
        }

        // task 8
        System.out.println("Задача 8");

        int currentYear = 2023;
        int pastYears = currentYear - 200;
        int futureYear = currentYear + 100;
        for (int i = pastYears; i <= futureYear; i++) {
            if (i % 79 == 0) {
                System.out.println(i);

            }
        }
    }
}