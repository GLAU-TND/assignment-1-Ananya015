package definition;

public class Person {
    private String firstName;
    private String lastName;
    private String Email;
   private LinkedList<String> ContactNumbers;

    public Person(String firstName, String lastName, String email, LinkedList<String> contactNumbers) {
        this.firstName = firstName;
        this.lastName = lastName;
        Email = email;
        ContactNumbers = contactNumbers;

    }
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return Email;
    }

    public LinkedList<String> getContactNumbers() {
        return ContactNumbers;
    }
}
