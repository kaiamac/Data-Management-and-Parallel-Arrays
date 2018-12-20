/*
 * Kaia Mac
 * december 2018
 */

package datamanagementandparallelarrays;
import java.util.Scanner;


/**
 *
 * @author kamac8665
 */
public class DataManagementandParallelArrays 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner (System.in);
        
        String userInput;
        int entries = 0;
        int choice = 0;
        boolean invalid = true;
        
        while (invalid == true)
        {
            System.out.println("Eter the number of people: ");
            userInput = keyedInput.nextLine();
            System.out.println("");
            
            try
            {
                entries = Integer.parseInt(userInput);
                invalid = false;
            }    
            
            catch (NumberFormatException e)
            {
                System.out.println("Sorry, that is not valid input.");
                System.out.println("");
            }    
            
            String personName [ ] = new String [entries];
            int favNum [ ] = new int [entries];
            int leastFavNum [ ] = new int [entries];
            String favColour [ ] = new String [entries];
            
            System.out.println("-----DATA ENTRY-----");
            for (int i = 0; i < entries; i = i + 1)
            {
                System.out.println("");
                System.out.println("Enter the name for person " + (i + 1) + ": ");
                personName[i] = keyedInput.nextLine();
                
                invalid = true;
                while (invalid)
                {
                    System.out.println("Enter " + personName[i] + "'s favourite colour: ");
                    userInput = keyedInput.nextLine();
                    
                    try
                    {
                        favColour[i] = userInput;
                        invalid = false;
                    }
                    
                    catch (NumberFormatException e)
                    {
                        System.out.println("Sorry that was not valid input.");
                    }        
                }
                
                invalid = true;
                while (invalid)
                {
                    System.out.println("Enter " + personName[i] + "'s favourite number: ");
                    userInput = keyedInput.nextLine();
                    
                    try
                    {
                        favNum[i] = Integer.parseInt(userInput);
                        invalid = false;
                    }
                    
                    catch (NumberFormatException e)
                    {
                        System.out.println("Sorry that was not valid input.");
                    }        
                }
                
                invalid = true;
                while (invalid)
                {
                    System.out.println("Enter " + personName[i] + "'s least favourite number: ");
                    userInput = keyedInput.nextLine();
                    
                    try
                    {
                        leastFavNum[i] = Integer.parseInt(userInput);
                        invalid = false;
                    }
                    catch (NumberFormatException e)
                    {
                        System.out.println("Sorry that was not valid input.");
                    } 
                }    
            }    
            
            while(choice != 3)
            {
                invalid = true;
                
                while (invalid)
                {
                    System.out.println("");
                    System.out.println("Select an option: ");
                    System.out.println("1... Output original data");
                    System.out.println("2... Output only their favourite colour");
                    System.out.println("3... Output only their least favourite number");
                    System.out.println("4... Output only their favourite number");
                    System.out.println("4... Output only their name");
                    System.out.println("6... Exit");
                    System.out.println("Enter your choice: ");
                    userInput = keyedInput.nextLine();
                    System.out.println("");
                    
                    try
                    {
                        choice = Integer.parseInt(userInput);
                        invalid = false;
                    }
                    catch (NumberFormatException e)
                    {
                        System.out.println("Sorry that was not valid input.");
                    }    
                }
                switch (choice)
                {
                    case 1:
                    {
                    for (int i = 0; i < entries; i = i + 1)
                        {
                            System.out.println(personName[i] + "'s favourite number is " + favNum[i] + " and their least favourite number is " + leastFavNum[i] + " and their favourite colour is " + favColour[i]);
                        }    
                    
                    break;
                    }    
                    
                    case 2:
                    {
                    for (int i = 0; i < entries; i = i + 1)
                        {
                            System.out.println(personName[i] + "'s favourite colour is " + favColour[i]);
                        }    
                    
                    break;
                    } 
                    
                    case 3:
                    {
                    for (int i = 0; i < entries; i = i + 1)
                        {
                            System.out.println(personName[i] + "'s least favourite number is " + leastFavNum[i]);
                        }    
                    
                    break;
                    } 

                    case 4:
                    {
                    for (int i = 0; i < entries; i = i + 1)
                        {
                            System.out.println(personName[i] + "'s favourite number is " + favNum[i]);
                        }    
                    
                    break;
                    } 

                    case 5:
                    {
                    for (int i = 0; i < entries; i = i + 1)
                        {
                            System.out.println(personName[i]);
                        }    
                    
                    break;
                    } 
                    
                    case 6:
                    {
                        System.out.println("Thank you for using the program.");
                    }    
                }
            }    
        }
    }
}
