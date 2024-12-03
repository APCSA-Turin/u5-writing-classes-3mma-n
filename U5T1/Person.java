public class Person {
    private String firstName;
    private int meetings;

    public Person(String first, String last) {
        firstName = first;
        meetings = 0;
    }

    public void meet(Person person2) {
        System.out.println("Hello, my name is " + firstName);
        System.out.println("Hi, my name is " + person2.getFirstName());
        addMeeting();
        person2.addMeeting();
    }

    public int getMeetings() {
        return meetings;
    }

    private void addMeeting() {
        meetings += 1;
    }

    private String getFirstName() {
        return firstName;
    }
}
