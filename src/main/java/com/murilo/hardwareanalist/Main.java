/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.murilo.hardwareanalist;

/**
 * @author Murilo
 */
public class Main {

    static Hardware hardware = new Hardware();

    public static void main(String args[]) {
        hardware.setNomePc();
        hardware.setIpPc();
        String ipPc = hardware.getIpPc();
        System.out.println(ipPc);
    }
}
