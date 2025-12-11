/**
 *
 * Schritt 1: Konvertiere deine Anwendung aus der Listen-Vorlesung so, dass das Schulobjekt anstelle einer ArrayList eine Hashmap verwendet.
 *
 * Programmierung: Apotheke
 *
 * Schritt 1: Erstelle eine Klasse ‘Medication’ mit den Methoden ‘getName’, ‘getPrice’ und ‘getAvailability’.
 * Schritt 2: Erstelle eine Java-Klasse ‘Pharmacy’, die eine Java Map verwendet, um den Medikamentennamen als Schlüssel und seine Informationen als Wert zu speichern.
 * Schritt 3: Erstelle eine Methode ‘int getCount()’ in der Klasse Pharmacy. Diese Methode soll die Anzahl der Medikamente in der Apotheke zurückgeben.
 * Schritt 4: Erstelle eine Methode ‘void save(Medication medication)’ in der Klasse Pharmacy. Diese Methode soll das Medikament, indiziert nach seinem Namen, in die Apotheke einfügen.
 * Schritt 5: Erstelle eine Methode ‘Medication find(String medicationName)’ in der Klasse Pharmacy. Diese Methode soll das angeforderte Medikament mit diesem Namen zurückgeben. Wenn kein Medikament mit diesem Namen gefunden wird, soll die Methode null zurückgeben.
 * Schritt 6: Erstelle eine Methode ‘void delete(String medicationName)’ in der Klasse Pharmacy. Diese Methode soll das Medikament mit diesem Namen löschen.
 * Schritt 7: Implementiere eine Methode, um alle Medikamente in der Map auszugeben, einschließlich ihres Namens, Preises und Verfügbarkeit.*/

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

        System.out.println();

        pharmacy.printAllMedications();

    }
}
