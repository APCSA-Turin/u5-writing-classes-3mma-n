package U5T7_Part3;

public class Student {
    // static variables
    private static int totalPoints = 0;
    private static int greatestPoints = 0;

    // instance variables
    private String firstName;
    private int points;

    public Student(String f) {
        firstName = f;
        points = 0;
    }

    public String studentInfo() {
        return "Student: " + firstName + "\nStudent's Points: " + points;
        
    
    }

    public void addPoints(int amount) {
        points += amount;
        totalPoints += amount;
        if (points > greatestPoints) {
            greatestPoints = points;
        }
    }

    public static int getTotalPointsEarned() {
        return totalPoints;
    }

    public static int getGreatestPoints() {
        return greatestPoints;
    }

    public static String classInfo() {
        return "Total points earned by all students: " + totalPoints + "\r\n" +//
                "Most points earned by any student: " + greatestPoints + "\r\n"; //
    
    }
}
