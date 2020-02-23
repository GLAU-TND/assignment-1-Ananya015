package definition;

import Adt.MyContactListAdt;

import java.util.Scanner;
import java.util.regex.Pattern;

public class MyLinkList implements MyContactListAdt {
    Scanner sc = new Scanner ( System.in );
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
                System.out.println ("Please Enter a Vaild Input i.e., y(lowercase) for Yes or n(lowercase for NO");
            }
        }
        return contactNumbers;

    }

    @Override
    public void addContact() {

    }

    @Override
    public void viewContact() {

    }

    @Override
    public void deleteContact() {

    }

    @Override
    public void searchContact() {

    }


}
