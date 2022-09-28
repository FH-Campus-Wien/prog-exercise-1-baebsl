package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void sayHelloWorld(){
        // input your solution here
        System.out.println("Hello World!");
    }

    //todo Task 2
    public void helloRobot(){
        // input your solution here
        System.out.println("0123456789012345678901\r\n" +
                "         __" + System.lineSeparator() +
                " _(\\    |@@|" + System.lineSeparator() +
                "(__/\\__ \\--/ __" + System.lineSeparator() +
                "   \\___|----|  |   __"+ System.lineSeparator() +
                "       \\ }{ /\\ )_ / _\\" + System.lineSeparator() +
                "       /\\__/\\ \\__O (__" + System.lineSeparator() +
                "      (--/\\--)    \\__/" + System.lineSeparator() +
                "      _)(  )(_" + System.lineSeparator() +
                "     `---''---`");
    }

    //todo Task 3
    public void sumOfLiterals(){
        // input your solution here
        char a = 'Z';
        long b = 0xface;
        int c_int = 012;
        long d = 80L;
        float e = 44e-1f;
        float f = 5.5f;
        double g = 8.88e1;
        double h = 99.9;

        int sum;

        int a_int = (int)a;
        int b_int = (int)b;
        int d_int = (int)d;
        int e_int = (int)e;
        int f_int = (int)f;
        int g_int = (int)g;
        int h_int = (int)h;

        sum = a_int + b_int + c_int + d_int + e_int + f_int + g_int + h_int;

        System.out.println(sum);
    }

    //todo Task 4
    public void addTwoNumbers(){
        // input your solution here
        Scanner scanner = new Scanner(System.in);
        int num1;
        int num2;

        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

        int result = (num1 + num2);

        System.out.println(result);
    }

    //todo Task 5
    public void swapTwoNumbers(){
        // input your solution here
        Scanner scanner = new Scanner(System.in);
        int x;
        int y;

        x = scanner.nextInt();
        y = scanner.nextInt();

        String before = "Before Swap:" + System.lineSeparator() +
                "x: " +
                "y: ";

        System.out.print(before);

        x = x - y;
        y = x + y;
        x = y - x;

        String after = "After Swap:" + System.lineSeparator() +
                "x: " + x + System.lineSeparator() +
                "y: " + y + System.lineSeparator();

        System.out.print(after);
    }

    //todo Task 6
    public void compareTwoNumbers(){
        // input your solution here
        Scanner scanner = new Scanner(System.in);
        int n1;
        int n2;

        n1 = scanner.nextInt();
        n2 = scanner.nextInt();

        if (n1 > n2){
            String higher = "n1: " + "n2: " + "n1 > n2" + System.lineSeparator();
            System.out.print(higher);
        }
        if (n1 < n2){
            String lower = "n1: " + "n2: " + "n2 > n1" + System.lineSeparator();
            System.out.print(lower);
        }

        if (n1 == n2){
            String same = "n1: " + "n2: " + "n1 == n2" + System.lineSeparator();
            System.out.print(same);
        }
    }

    //todo Task 7
    public void ratingSalesPerson(){
        // input your solution here
        Scanner scanner = new Scanner(System.in);
        int sales;

        sales = scanner.nextInt();

        System.out.print("Enter annual Revenue: ");

        if (sales < 0) {
            System.out.println("Invalid Revenue"); }
        else if (sales >= 0 & sales < 20000) {
            System.out.println("Poor Sales Revenue"); }
        else if (sales >= 20000 & sales < 50000) {
            System.out.println("Average Sales Revenue"); }
        else if (sales >= 50000 & sales < 80000) {
            System.out.println("Good Sales Revenue"); }
        else if (sales >= 80000 & sales < 100000) {
            System.out.println("Excellent Sales Revenue"); }
        else if (sales >= 100000){
            System.out.println("Invalid Revenue"); }
    }

    //todo Task 8
    public void getCommissionRate(){
        // input your solution here
        Scanner scanner = new Scanner(System.in);
        int commission;

        commission = scanner.nextInt();

        System.out.print("Enter CommissionClass: ");

        switch (commission) {
            case 1:
                System.out.println("Your Commission Rate was set to 0.01");
                break;
            case 2:
                System.out.println("Your Commission Rate was set to 0.02");
                break;
            case 3:
                System.out.println("Your Commission Rate was set to 0.03");
                break;
            case 4:
                System.out.println("Your Commission Rate was set to 0.04");
                break;
            default:
                System.out.println("Your Commission Rate was set to 0.0");
                break;
        }
    }

    //todo Task 9
    public void leapyear(){
        // input your solution here
        Scanner scanner = new Scanner(System.in);
        int year;

        year = scanner.nextInt();

        System.out.print("Year: ");

        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Leapyear"); }
        else {
            System.out.println("Not a Leapyear"); }
    }

    //todo Task 10
    public void transposedNumbers(){
        // input your solution here
        Scanner scanner = new Scanner(System.in);
        int number;
        int leftdigit;
        int middledigit;
        int rightdigit;

        number = scanner.nextInt();

        if (number >= 0 & number < 10) {
            System.out.print(number); }
        else if (number >= 10 & number < 100) {
            leftdigit = number / 10;
            rightdigit = number - (leftdigit * 10);
            String twonumbers = Integer.toString(rightdigit)+ Integer.toString(leftdigit);
            System.out.print("Number: " + twonumbers); }
        else if (number >= 100 & number < 1000) {
            leftdigit = number / 100;
            middledigit = (number / 10) - (leftdigit * 10);
            rightdigit = number - (leftdigit * 100) - (middledigit * 10);
            String threenumbers = Integer.toString(rightdigit) + Integer.toString(middledigit) + Integer.toString(leftdigit);
            System.out.println("Number: " + threenumbers); }
    }


    public static void main(String[] args){
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}