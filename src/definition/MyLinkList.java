package definition;

import Adt.MyContactListAdt;
import Adt.MyLinkListAdt;

import java.util.Scanner;
import java.util.regex.Pattern;

public class MyLinkList implements MyContactListAdt {
    Scanner sc = new Scanner ( System.in );

    LinkedList <Person> ConBook=new LinkedList<> ();
    LinkedList <String> contactNumbers=new LinkedList<>();
    private String getFirstName()
    {
        System.out.println ("Please enter the Name of Person");
        System.out.println ("First Name: ");
        String fName=sc.next ();
        return fName;
    }
    private String getLastName()
    {
        System.out.println ("LastName: ");
        String lName=sc.next ();
        return lName;
    }
    private LinkedList<String> getContactNumbers(){
        LinkedList<String> contactNumbers=new LinkedList<> ();
        System.out.println ("Contact Number");
        String contactNum=sc.next ();
        while(true)
        {
          if(Pattern.matches ( "[0-9]+",contactNum )){
              contactNumbers.add ( contactNum );
              break;
        }
        else{
            System.out.println ("Invalid PhoneNumber");
            break;
        }
        }
        while(true){
            System.out.println ("Do You want to add new Contact Number? (y/n) :");
            String s=sc.next();
            char at=s.charAt(0);
            if(s.length ()>1){
                System.out.println ("Please enter a valid input i.e. , y(lowercase) for Yes or n(lowercase for No)");
                continue;
            }
            if(at=='y'){
                System.out.println ("contactNumber: ");
                contactNum =sc.next ();
                if(Pattern.matches ( "[0-9]+",contactNum))
                {
                    contactNumbers.add(contactNum);
                }
                else
                    {
                    System.out.println ("Invalid PhoneNumber");
                    }
            }
            else if(at=='n'){
                break;
            }
            else{
                System.out.println ("Please Enter a Vaild Input i.e., y(lowercase) for Yes or n(lowercase) for NO");
            }
        }
        return contactNumbers;

    }
    private String getEmail(){
        String Email=null;
        while(true){
            System.out.println ("Do you want to add an Email ? (y/n) :");
            String s=sc.next();
            char at=s.charAt ( 0 );
            if(s.length()>1){
                System.out.println ("Please Enter a valid Input i.e., y(lowercase) for Yes or n(lowercase) for No");
                continue;
            }
            if(at=='y'){
                System.out.println ("Email Address: ");
                Email=sc.next ();
            }else if (at =='n'){
                break;
            }else {
                System.out.println ("Please Enter Valid Input i.e., y(lowecase) for Yes or n(lowercase) for NO");
            }
        }
        return Email;
    }

    @Override
    public void addContact() {
        System.out.println("You have chosen to add a new contact:");
        String firstname = getFirstName ();
        String lastname = getLastName();
        contactNumbers = getContactNumbers ();
        String Email = getEmail ();
        Person newContact;
        newContact = new Person(firstname, lastname, Email, contactNumbers);
        int index = compareFirstName (firstname);
        ConBook.add(newContact, index);
        System.out.println("Contact Added SucessFully");
        System.out.println();
        System.out.println();


    }
    private int compareFirstName(String fName) {
        int index = 0;
        if (ConBook.size == 0) {
        } else {
            for (int i = 0; i < ConBook.size; i++) {
                Person temp = ConBook.getData(i);
                String name = temp.getFirstName();
                name = name.toLowerCase();
                fName = fName.toLowerCase();
                if (name.compareTo(fName) < 0) {
                    index++;
                } else if (name.compareTo(fName) == 0) {
                    return index;

                } else {
                    break;
                }

            }

        }
        return index;
    }


    @Override
    public void viewContact() {
        System.out.println("---Here are all your contacts---\n" +
                "-------- * -------- * -------- * --------");

        for (int i = 0; i < ConBook.size; i++) {
            Person response = ConBook.getData(i);
            System.out.println(response);
        }
        System.out.println("Total Contacts: " + ConBook.size);

    }

    @Override
    public void deleteContact() {

    }

    @Override
    public void searchContact() {

    }


}
