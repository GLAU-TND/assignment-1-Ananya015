package definition;

import Adt.MyContactListAdt;

import java.util.Scanner;

public class MyLinkList implements MyContactListAdt {
    Scanner sc = new Scanner ( System.in );
    private String getFirstName()
    {
        System.out.println ("Please enter the Name of Person");
        System.out.println ("First Name: ");
        String fName=sc.next ();
        return fName;
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
