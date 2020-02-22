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

    public String getContactNumbers() {
        StringBuilder contacts=new StringBuilder ();
        boolean b=false;
        for(int i=0;i<ContactNumbers.size;i++) {
            if (i == 0) {
                contacts.append ( ContactNumbers.getData ( i ) );
            } else {
                contacts.append ( "," ).append ( ContactNumbers.getData ( i ) );
            }
        }
            if(ContactNumbers.size==0){
              contacts.append ( "null" );
            }
            else if(ContactNumbers.size==1){
                b=true;
            }

        return b ? "Contact: " + contacts : "Contacts:" + contacts;
    }

    @Override
    public String toString() {
        return "FirstName: "+getFirstName ()+"\n"+"LastName: "+getLastName ()+"\n"+getContactNumbers ()+"\n"+"Email: "+getEmail ()+"\n"+"-------*-------*-------*-------\n"+
                "--------*--------*--------*\n";

    }
}
