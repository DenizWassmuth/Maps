package org.example;

import java.util.HashMap;
//import java.util.Map;
import java.util.*;


/**
 *
 * PasswordValidator – kurze Beschreibung
 * Author: Deniz Wassmuth
 * Date: 05.12.2025
 * <p>
 * KEEP IN MIND:
 * - check and/or change user and email through GitBash
 * - add /target, *.iml and .idea to gitignore
 * - exclude previously added files from git changes through GitBash (git rm -r) and readd the files needed (git add .)
 * -> maven mostly handles this automatically after changing gitignore
 * <p>
 * add dependency: junit-jupiter
 * <p>
 * add plugin: maven-surefire
 * <p>
 * in GITHUB add Action: ... with maven
 */

public class Pharmacy {

    private Map<String, Medication> medicationsMap;

    public Pharmacy() {
        medicationsMap = new HashMap<>();
    }

    public int getCount() {
        return medicationsMap.size();
    }

    public void saveMedication(Medication medication) {
        medicationsMap.put(medication.getMedicationName(), medication);
    }

    public Medication findMedication(String medicationName) {

        if(isEmpty())
        {
            return null;
        }

        if (medicationsMap.containsKey(medicationName)){

            Medication medication = medicationsMap.get(medicationName);
            System.out.println("Found: " + medication);

            return medicationsMap.get(medicationName);
        }

        System.out.println(medicationName + " not found in entries");
        return null;
    }

    public void deleteMedication(String medicationName) {

        if(isEmpty())
        {
            return;
        }

        if (!medicationsMap.containsKey(medicationName)) {

            System.out.println("No medication found with name " + medicationName);
            return;
        }

        medicationsMap.remove(medicationName);
        System.out.println(medicationName + " deleted");
    }

    public void printMedications() {

        if (isEmpty()) {
            return;
        }

        for (Map.Entry<String, Medication> entry : medicationsMap.entrySet()) {
            System.out.println(entry.getValue());
        }
    }

    boolean isEmpty() {

        if (medicationsMap.isEmpty()) {
            System.out.println("No medication entries");
            return true;
        }

        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Pharmacy pharmacy = (Pharmacy) o;
        return Objects.equals(medicationsMap, pharmacy.medicationsMap);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(medicationsMap);
    }

    @Override
    public String toString() {
        return "Pharmacy entries: " + medicationsMap;

    }
}
