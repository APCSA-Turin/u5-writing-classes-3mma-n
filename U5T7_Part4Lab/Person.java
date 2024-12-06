package U5T7_Part4Lab;

public class Person {
    private String name;
    private boolean vaccinated;

    public Person(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public boolean isVaccinated() {
        return vaccinated;
    }

    public void becomeVaccinated() {
        vaccinated = true;
    }
}
