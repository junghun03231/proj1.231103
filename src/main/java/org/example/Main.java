package org.example;


import org.example.App;

public class Main {
    public static void main(String[] args) {

        Container.scan();
        new App().run();
        Container.close();
        
    }
}