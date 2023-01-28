package com.company;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class InventoryManager {

    // Collecting All Students
    List<Student> students = new ArrayList<>();
    List<Supply> suppliesNeeded = new ArrayList<>();

    HashMap<String, Integer> NEED = new HashMap<>();
    HashMap<String, Integer> HAVE = new HashMap<>();
    HashMap<String, Integer> BUY = new HashMap<>();




    public InventoryManager(){
        return;
    }

    /**
     * Includes some student s in the IMS.
     * @param s The student being added to the system.
     */
    public void addStudent(Student s){

        students.add(s);
    }

    /**
     * Loads all student data, returns hashMap of corresponding values of each supply needed.
     */
    public void calculateSupplyDemand(){
        for (Student s: students){
            //System.out.println(s.getShirtSize() + " " +  s.getPantSize() + " " + s.getGender() + " " + s.getSchoolFile());

            try {
                File csvFile = new File(s.getSchoolFile());
                Scanner scanner = new Scanner(csvFile);

                // read the file line by line
                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    String[] parts = line.split(",");

                    Supply su = new Supply(parts[0], Integer.parseInt(parts[1]));

                    suppliesNeeded.add(su);


                }
                scanner.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        HashMap<String, Integer> totals = new HashMap<>();

        for (Supply supply : suppliesNeeded) {
            String name = supply.getName();
            int value = supply.getValue();

            if (totals.containsKey(name)) {
                int total = totals.get(name);
                totals.put(name, total + value);
            } else {
                totals.put(name, value);
            }
        }

        NEED = totals;

    }

    public void calculateShoppingList(String inventoryCSVFile){
        ;
    }

    public void printInformation(){

        // Printing All Students
        System.out.println("List of Students \n");
        for (Student s: students) {
            System.out.println(s.getShirtSize() + " " + s.getPantSize() + " " + s.getGender() + " " + s.getSchoolFile());
        }
        System.out.println("\n");

        // Print All Supplies Required

        System.out.println("Required Items \n");
        for (String key : NEED.keySet()) {
            System.out.println(key + " -> " + NEED.get(key));
        }
        System.out.println("\n");

    }

}
