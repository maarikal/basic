package week4;

import java.util.Scanner;

public class Ex79 {
    public static void main(String[] args) {
        NumberStatistics stats = new NumberStatistics();

        NumberStatistics stats1 = new NumberStatistics();
        System.out.println("Type number for point 3: ");
        Scanner reader = new Scanner(System.in);
        int number;
        while (true) {
            number = Integer.parseInt(reader.nextLine());
            if (number == -1) {
                break;
            }
            stats1.addNumber(number);
        }

        NumberStatistics all = new NumberStatistics();
        NumberStatistics odd = new NumberStatistics();
        NumberStatistics even = new NumberStatistics();

        System.out.println("Type number for point 4: ");
        Scanner reader1 = new Scanner(System.in);
        int num;
        while (true) {
            num = Integer.parseInt(reader.nextLine());
            if (num == -1) {
                break;
            }
            all.addNumber(num);

            if(num % 2 == 0) {
                even.addNumber(num);
            } else {
                odd.addNumber(num);
            }
        }

        stats.addNumber(3);
        stats.addNumber(5);
        stats.addNumber(1);
        stats.addNumber(2);
        System.out.println("----- Exercise 79.2 output ------");
        System.out.println("amount: " + stats.amountOfNumbers());
        System.out.println("sum: " + stats.sum());
        System.out.println("average: " + stats.average());

        System.out.println();
        System.out.println("----Exercise 79.3------");
        System.out.println("amount: " + stats1.amountOfNumbers());
        System.out.println("sum: " + stats1.sum());
        System.out.println("average: " + stats1.average());

        System.out.println();
        System.out.println("-----Exercise 79.4----");
        System.out.println("sum of all: " + all.sum());
        System.out.println("sum of even: " + even.sum());
        System.out.println("sum of odd: " + odd.sum());
    }
}
