import java.util.Scanner;

public class Main {
    public static void add(double num1, double num2){
        double total = num1 + num2;
        String result = String.format("\n  %.2f + %.2f = %.2f  \n", num1, num2, total);
        System.out.println(result);
    }
    public static void sub(double num1, double num2){
        double subNumber = num1 - num2;
        String result = String.format("\n  %.2f - %.2f = %.2f  \n", num1, num2, subNumber);
        System.out.println(result);
    }
    public static void mult(double num1, double num2){
        double multNumber = num1 * num2;
        String result = String.format("\n  %.2f x %.2f = %.2f  \n", num1, num2, multNumber);
        System.out.println(result);
    }
    public static void div(double num1, double num2){
        double divNumber = num1 / num2;
        if(num2 == 0){
            System.out.println("Error");
        }else {
            String result = String.format("\n  %.2f / %.2f = %.2f  \n", num1, num2, divNumber);
            System.out.println(result);
        }
    }
    public static void power(double num1, double num2){
        double powerNumber = Math.pow(num1, num2);
        String result = String.format("\n  %.2f ^ %.2f = %.2f  \n", num1, num2, powerNumber);
        System.out.println(result);
    }
    public static void squareRoot(double num1, double num2){
        Scanner choiceNum = new Scanner(System.in);
        System.out.print("écrivez 1 pour le premier nombre ou 2 pour le deuxième nombre: ");
        int number = choiceNum.nextInt();
        double sqrt;
        if (number == 1){
            sqrt = Math.sqrt(num1);
            String result1 = String.format("√%.2f = %.2f", num1, sqrt);
            System.out.println(result1);
        } else if (number == 2) {
            sqrt = Math.sqrt(num2);
            String result2 = String.format("√%.2f = %.2f", num2, sqrt);
            System.out.println(result2);
        }else{
            System.out.println("non valid");
        }
    }

    public static void factorial(double num1, double num2) {
        Scanner choice = new Scanner(System.in);
        System.out.print("Écrivez 1 pour le premier nombre ou 2 pour le deuxième nombre: ");
        double choiceNumber = choice.nextDouble();
        double factorial = 1;

        if (choiceNumber == 1) {
            for (int i = 1; i <= num1; i++) {
                factorial *= i;
            }
            String result1 = String.format("Le factorial de %.2f est %.2f", num1, factorial);
            System.out.println(result1);
        } else if (choiceNumber == 2) {
            for (int i = 1; i <= num2; i++) {
                factorial *= i;
            }
            String result2 = String.format("Le factorial de %.2f est %.2f", num2, factorial);
            System.out.println(result2);
        } else {
            System.out.println("Choix non valide");
        }
    }

    public static void main(String[] args){
        Scanner fnum = new Scanner(System.in);
        System.out.print("entre num 1: ");
        double num1 = fnum.nextDouble();
        Scanner snum = new Scanner(System.in);
        System.out.print("entre num 2: ");
        double num2 = snum.nextDouble();

        while (true){
            Scanner chnum = new Scanner(System.in);
            System.out.println("  1. pour L'addition");
            System.out.println("  2. pour la Soustraction");
            System.out.println("  3. pour la Multiplication");
            System.out.println("  4. pour la Division");
            System.out.println("  5. pour calculet premier nombre à la puissance du deuxième nombre");
            System.out.println("  6. pour calculet le Racine carrée");
            System.out.println("  7. pour la factorielle");
            System.out.println("  0. pour quitter");
            System.out.print("entre votre choix: ");
            int choice = chnum.nextInt();
            switch (choice){
                case 1:
                    add(num1, num2);
                    break;
                case 2:
                    sub(num1, num2);
                    break;
                case 3:
                    mult(num1, num2);
                    break;
                case 4:
                    div(num1, num2);
                    break;
                case 5:
                    power(num1, num2);
                    break;
                case 6:
                    squareRoot(num1, num2);
                    break;
                case 7:
                    factorial(num1, num2);
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