import java.util.Scanner;

import java.util.ArrayList;

public class Main
{

  public static void main (String[]args)
  {

    Scanner input = new Scanner (System.in);

      ArrayList < Person > person = new ArrayList < Person > ();

    int numOfPerson;


      System.out.print ("How many person do you want to create?: ");

      numOfPerson = input.nextInt ();

      for (int i = 0; i < numOfPerson; i++)

	{

	  System.out.print ("What is person " + (i + 1) + " name? ");

	  String name = input.next ();

	  System.out.print ("What is person " + (i + 1) + " age? ");

	  int age = input.nextInt ();
      
        Person persons = new Person ();

      persons.setName (name);

      persons.setAge (age);

      person.add (persons);
    }

  }
}