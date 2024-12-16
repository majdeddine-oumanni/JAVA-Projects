import java.util.Scanner;


public class Main {
    static double num1, num2;
    static double number;
    public static void twoNumbers(){
        Scanner num = new Scanner(System.in);

        System.out.print("entre premiere nombre: ");
        num1 = num.nextDouble();

        System.out.print("entre deuxiem nombre: ");
        num2 = num.nextDouble();
    }
    public static void oneNumber(){
        Scanner num = new Scanner(System.in);
        System.out.print("entre une nombre: ");
        number = num.nextDouble();
    }
    public static void menu(){
        System.out.println("-----Menu-----");
        System.out.println("  1. pour L'addition");
        System.out.println("  2. pour la Soustraction");
        System.out.println("  3. pour la Multiplication");
        System.out.println("  4. pour la Division");
        System.out.println("  5. pour calculet premier nombre à la puissance du deuxième nombre");
        System.out.println("  6. pour calculet le Racine carrée");
        System.out.println("  7. pour la factorielle");
        System.out.println("  0. pour quitter");
    }
    public static void add(){
        twoNumbers();
        double total = num1 + num2;
        String result = String.format("\n  %.2f + %.2f = %.2f  \n", num1, num2, total);
        System.out.println(result);
    }
    public static void sub(){
        twoNumbers();
        double subNumber = num1 - num2;
        String result = String.format("\n  %.2f - %.2f = %.2f  \n", num1, num2, subNumber);
        System.out.println(result);
    }
    public static void mult(){
        twoNumbers();
        double multNumber = num1 * num2;
        String result = String.format("\n  %.2f x %.2f = %.2f  \n", num1, num2, multNumber);
        System.out.println(result);
    }
    public static void div(){
        twoNumbers();
        double divNumber = num1 / num2;
        if(num2 == 0){
            System.out.println("Error");
        }else {
            String result = String.format("\n  %.2f / %.2f = %.2f  \n", num1, num2, divNumber);
            System.out.println(result);
        }
    }
    public static void power(){
        twoNumbers();
        double powerNumber = Math.pow(num1, num2);
        String result = String.format("\n  %.2f ^ %.2f = %.2f  \n", num1, num2, powerNumber);
        System.out.println(result);
    }
    public static void squareRoot(){
        oneNumber();
        if (number < 0){
            System.out.println("Error");
        }else{
            double sqrt;
            sqrt = Math.sqrt(number);
            String result = String.format(" \n √%.2f = %.2f  \n ", number, sqrt);
            System.out.println(result);
        }
    }


    public static void factorial() {
        oneNumber();
        double factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        String result = String.format(" \n Le factorial de %.2f est %.2f \n ", number, factorial);
        System.out.println(result);
    }


    public static void main(String[] args){


        while (true){
            menu();
            Scanner chnum = new Scanner(System.in);
            System.out.print("entre votre choix: ");
            int choice = chnum.nextInt();
            switch (choice){
                case 1:
                    add();
                    break;
                case 2:
                    sub();
                    break;
                case 3:
                    mult();
                    break;
                case 4:
                    div();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    squareRoot();
                    break;
                case 7:
                    factorial();
                    break;
                case 0:
                    System.out.println("\n quitter \n");
                    return;
                default:
                    System.out.println("non valide");
            }
        }
    }
}

