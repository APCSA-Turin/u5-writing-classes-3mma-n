package U5T7_Part4Lab;

public class Clinic {
    private static int totalClinics;
    private static int totalVaccinesGiven;
    private int vaccinesGiven;
    private Person lastPerson;

    public int getVaccinesGiven() {
        return vaccinesGiven;
    }

    public Person getLastPersonVaccinated() {
        return lastPerson;
    }

    public static int getTotalClinics() {
        return totalClinics;
    }

    public static int getTotalVaccinesGiven() {
        return totalVaccinesGiven;
    }

    public boolean vaccinate(Person patient) {
        if (patient.isVaccinated()) {
            return false;
        }
        patient.becomeVaccinated();
        lastPerson = patient;
        return true;
    }
}
