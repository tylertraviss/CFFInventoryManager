package com.company;

import java.util.Collections;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        // Bob, our test Student
        Student Bob = new Student("S", "M", "Male", 7, "rms.csv");
        Student Julie = new Student("S", "M", "Male", 7, "rms.csv");

        InventoryManager IM = new InventoryManager();
        IM.addStudent(Bob);
        IM.addStudent(Julie);
        IM.calculateSupplyDemand();
        IM.printInformation();

    }
}
