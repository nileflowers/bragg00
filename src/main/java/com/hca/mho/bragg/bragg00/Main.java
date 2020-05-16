package com.hca.mho.bragg.bragg01;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the name of the soda you'd like to purchase: ");
        String sodaName = scanner.nextLine();
        VendingMachine vm = new VendingMachine();
        Soda soda = vm.buySoda(sodaName);
        System.out.println("Soda Purchased: " + soda);
    }
}