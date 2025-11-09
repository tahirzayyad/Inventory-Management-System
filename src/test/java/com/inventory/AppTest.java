package com.inventory;

public class AppTest {
    public static void main(String[] args) {
        System.out.println("Running simple test...");

        // Example "test" logic
        App app = new App();
        if (app != null) {
            System.out.println("Test passed ✅");
        } else {
            System.out.println("Test failed ❌");
        }
    }
}
