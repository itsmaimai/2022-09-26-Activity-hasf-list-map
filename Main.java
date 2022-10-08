import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.ArrayList;

public class Main
{

  public static void main (String[]args) throws MyOwnException
  {
    String name;
    int age;
    Scanner scan = new Scanner (System.in);

      ArrayList < Person > person = new ArrayList < Person > ();
      try
    {
      try
      {
	int numOfPerson;
	  System.out.print ("How many person do you want to create?: ");
	  numOfPerson = scan.nextInt ();
	if (numOfPerson <= 0)
	  {
	    throw new MyOwnException ("Sorry, no object added!");
	  }
	for (int i = 0; i < numOfPerson; i++)
	  {
	    System.out.print ("What is person " + (i + 1) + " name? ");
	    name = scan.next ();

	    System.out.print ("What is person " + (i + 1) + " age? ");
	    age = scan.nextInt ();
	    Person persons = new Person (name, age);
	      person.add (persons);
	      System.out.println (person);
	  }

      } catch (InputMismatchException e)
      {
	System.out.print ("Input an integer!");
      }

    } catch (MyOwnException ex)
    {
      System.out.println ("Message: " + ex.getMessage ());
    }
  }
}

