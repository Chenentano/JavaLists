package org.example;

import java.util.HashMap;
import java.util.Map;

public class Pharmacy
{

    private int Count;

    Map<String, Medication> medications = new HashMap<>();

    public int getCount() {
        return Count;
    }

    public void save(Medication medication){

        medications.put(medication.getName(), medication);

    }

    public Medication find(String medicationName){
        return medications.getOrDefault(medicationName, null);
    }

    public void delete(String medicationName){
        medications.remove(medicationName);
    }

    public void printAllMedications() {
        System.out.println("Medications in the pharmacy:");
        for (Map.Entry<String, Medication> entry : medications.entrySet()) {
            Medication medication = entry.getValue();
            System.out.println("Name: " + medication.getName() + ", Price: " + medication.getPrice() + ", Availability: " + (medication.isAvailability() ? "Available" : "Not Available"));
        }
    }

}
