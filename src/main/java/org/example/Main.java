package org.example;

public class Main {
    static void main() {

        Pharmacy pharmacy = new Pharmacy();

        Medication asperin = new Medication("Asperin", 2.50f, true);
        Medication ritalin = new Medication("Ritalin", 50.00f, true);
        Medication ibu = new Medication("Ibu", 5.20f, false);
        Medication paracetamol = new Medication("Paracetamol", 7.80f, true);

        pharmacy.saveMedication(asperin);
        pharmacy.saveMedication(ritalin);
        pharmacy.saveMedication(ibu);
        pharmacy.saveMedication(paracetamol);

        System.out.println();

        System.out.println(pharmacy);

        System.out.println();

        pharmacy.findMedication("Asperin");

        System.out.println();

        pharmacy.findMedication("testo");

        System.out.println();

        pharmacy.deleteMedication("Asperin");

        System.out.println();

        pharmacy.findMedication("Asperin");

        System.out.println();

        pharmacy.findMedication("Ritalin").setMedicationAvailability(false);

        System.out.println();

        pharmacy.findMedication("Ritalin").isAvailable();

    }
}
