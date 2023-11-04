package org.example;

import lombok.Getter;

import java.util.Scanner;

public class Container {
    @Getter
    private static Scanner sc;

    static void scan() {
        sc = new Scanner(System.in);
    }

    public static void close() {
        sc.close();
    }

}
