//
////Use a Scanner object to read in use input.
////        Prompt the user to enter strictly positive ( > 0 ) integers separated by spaces.
////        For all the numbers input compute the maximum value.
////        For all the numbers input compute the minimum value.
////        For all the numbers entered compute the average value
////        You will compute these until you see the number -1. This is called a sentinel value. A value that designates termination of the algorithm.
////        Print the following statement after the sentinel value is reached:
//


import java.util.Scanner;

public class MinMaxAvg {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // giving max and min value
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        int count = 0;
        //printing the first line
        System.out.println("Enter positive integers separated by spaces. Enter -1 to finish:");
        // creating a loop and telling it if you press -1 the code exits.
        while (true) {
            int num = scanner.nextInt();
            if (num == -1) {
                break;
            }
            // making the numbers positive and adding counts
            if (num > 0) {
                sum += num;
                //count++;
                //This is for min and max value
                if (num > max) {
                    max = num;
                }

                if (num < min) {
                    min = num;
                }
            } else {
                System.out.println("Please enter positive integers only.");
            }
        }
        // The formula for minMaxAvg
        if(count > 0) {
            double average = (double) sum / count;
            System.out.println("Maximum value: " + max);
            System.out.println("Minimum value: " + min);
            System.out.println("Average value: " + average);
        } else {
            System.out.println("No positive integers were entered.");
        }
    }

}
