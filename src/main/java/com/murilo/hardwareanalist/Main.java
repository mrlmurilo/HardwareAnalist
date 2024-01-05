package com.murilo.hardwareanalist;

/**
 * @author Murilo
 */
public class Main {

    static Hardware hardware = new Hardware();

    public static void main(String args[]) {
        Hardware hard = new Hardware();
        
        String os = hard.getMemoriaPc();
        System.out.println(os);
    }
}
