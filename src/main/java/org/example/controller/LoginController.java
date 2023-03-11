package org.example.controller;

import org.example.util.ScannerUtil;



public class LoginController {
    private String menu = """
            *** MENU ***
            1. Login
            0. Exit
            """;
    public void start() {
        boolean b = true;
        while (b) {
            System.out.println(menu);
            switch (ScannerUtil.getAction()) {
                case 1 -> getLogin();
                case 0 -> {
                    System.out.println("Programm finished!");
                    b = false;
                }
                default -> {
                    System.out.println("Are you mazgi? Write correctly!");
                    start();
                }
            }
        }
    }

    private void getLogin() {
    }
}
