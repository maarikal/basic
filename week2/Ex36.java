package week2;

import java.util.Scanner;

// https://materiaalit.github.io/2013-oo-programming/part1/week-2/
public class Ex36 {
    public static void main(String[] args) {
        System.out.println("Type number: ");
        Scanner reader = new Scanner(System.in);
        int number;
        int sum = 0;
        int count = 0;
        int even = 0;
        int odd = 0;
        while (true) {
            number = Integer.parseInt(reader.nextLine());
            if (number == -1) {
                break;
            }
            sum += number;
            count++;
            if(number % 2 ==0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Thank you and see you later, ok!");
        System.out.println("The sum is " + sum);
        System.out.println("There are " + count + " numbers in the list.");
        System.out.println("Average of the numbers is " + sum/count);
        System.out.println("Average of the number (not int) is " + 1.0*sum/count);
        System.out.println("Average of the numbers (as double) is " + (double)sum/count);  // parem variant
        double average = (double)sum/count;
        System.out.println("Average of the numbers (with variable) is: " + average);
        System.out.println("The number of even numbers is: " + even);
        System.out.println("The number of odd numbers is: " + odd);
    }
}
