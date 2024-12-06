package U5T7_Part3;

public class Employee {
    private static int lastID = 100;
    private static int totalHires = 0;

    private String firstName;
    private String lastName;
    private int ID;

    public Employee(String f, String l) {
        firstName = f;
        lastName = l;
        ID = lastID + 1;
        lastID = ID;
        totalHires++;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public int getID() {
        return ID;
    }

    public static int getMostRecentEmployeeID() {
        return lastID;
    }

    public static int getTotalEmployeesCreated() {
        return totalHires;
    }

    public String employeeInfo() {
        return "--------------------------\r\n" + //
                "Employee full name: " + getFullName() + "\r\n" + //
                "Employee ID: " + getID() + "\r\n" + //
                "Most recent ID assigned: " + getMostRecentEmployeeID() + "\r\n" + //
                "Total employees hired: " + getTotalEmployeesCreated() + "\r\n" + //
                "--------------------------\r\n" + //
                "";
    }
}
