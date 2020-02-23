package execution;

import definition.MyLinkList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner ( System.in );
        MyLinkList user =new MyLinkList ();
        boolean response= true;
        do {
            System.out.println ( "welcome to Ananya's Contact List App\n" +
                    "Press 1 to add a new contact\n" +
                    "Press 2 to view all contacts\n" +
                    "Press 3 to search for a contacts\n" +
                    "Press 4 to delete a contact\n" +
                    "Press 5 to exit program" );
            String str = sc.next ();
            if (str.length () > 1) {
                System.out.println ( "Invalid option" );
                continue;

            }
            char choice = str.charAt ( 0 );
            switch (choice) {
                case '1':
                    user.addContact ();
                    break;
                case '2':
                    user.viewContact ();
                    break;
                case '3':
                    user.searchContact ();
                    break;
                case '4':
                    user.deleteContact ();
                    break;
                case '5':
                    System.out.println ( "THANK YOU" );
                    System.out.println ( "HAVE A GREAT DAY" );
                    response = false;
                    break;
                default:
                    System.out.println ( "INVALID OPTION" );
            }
            }
            while (response) ;

            sc.close ();


        }
    }



