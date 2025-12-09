package org.example;

import java.util.Objects;

/**
 * Medication – class which contains name, price and availability
 * Author: Deniz Wassmuth
 * Date: 09.12.2025
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

public class Medication {

    private String medicationName;
    private float medicationPrice;
    private boolean medicationAvailability;

    public Medication(String medicationName, float medicationPrice, boolean medicationAvailability) {
        this.medicationName = medicationName;
        this.medicationPrice = medicationPrice;
        this.medicationAvailability = medicationAvailability;
    }

    public String getMedicationName() {
        return medicationName;
    }

    public float getMedicationPrice() {
        return medicationPrice;
    }

    public boolean getMedicationAvailability() {
        return medicationAvailability;
    }

    public void setMedicationAvailability(boolean medicationAvailability) {
        this.medicationAvailability = medicationAvailability;
    }

    public boolean isAvailable() {
        if (medicationAvailability) {
            System.out.println(medicationName + " is available");
            return true;
        }

        System.out.println(medicationName + " is not available");
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Medication that = (Medication) o;
        return Float.compare(medicationPrice, that.medicationPrice) == 0 && medicationAvailability == that.medicationAvailability && Objects.equals(medicationName, that.medicationName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(medicationName, medicationPrice, medicationAvailability);
    }

    @Override
    public String toString() {
        return  medicationName + " - Price:" + medicationPrice +
                " - available: " + medicationAvailability;
    }
}
