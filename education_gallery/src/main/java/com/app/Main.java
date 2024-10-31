package com.app;
import java.util.Scanner;


public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("[1] - Usuário\n[2] - Academico \n[3] - Financeiro \n[4] - Instituição\n[5] - Sair");
        System.out.print("Digite uma opção: ");
        int option = input.nextInt();

        switch (option) {
            case 1:
                System.out.println("\nUsuários");
                break;
            case 2:
                System.out.println("\nAcademico");
                break;
            case 3:
                System.out.println("\nFinanceiro");
                break;
            case 4:
                System.out.println("\nInstituição");
                break;
            case 5:
                System.exit(0);
                break;
            default:
                break;
        } 
    }
}