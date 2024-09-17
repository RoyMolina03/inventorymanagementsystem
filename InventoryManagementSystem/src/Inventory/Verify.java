package Inventory;

import java.util.Scanner;

//purpose of this class is to use modular code to check inputs instead of having to make a method in each class
public class Verify {

    public static Scanner user = new Scanner(System.in);

    public String checkWords(String words)
    {


        return words;
    }

    //accepts a number and a char to specify what number will be used for since different values have different restrictions
    public int checkNums(int nums, char type)
    {
        Character.toLowerCase(type);

        switch (type)
        {
            case 'i': // for IDs & skus
                nums = checkID(nums);
                break;
            case 'a': // for checking amounts
                nums = checkAmount(nums);
                break;
            case 'p': // for checking price
                nums = checkPrice(nums);
                break;
            default:

        }

        return nums;
    }

    //part of checkNums
    public int checkID(int nums) // skus & ids are only permitted to be in the range of 1 < n < 999
    {
        if ( (nums < 1) || (nums > 999) )
        {
            do
            {
                System.out.println("SKU cannot be less than 1 or greater than 999. Please re-enter SKU: ");
                nums = user.nextInt();
            } while ( (nums < 1) || (nums > 999) );
        }

        return nums;
    }

    //part of checkNums
    public int checkAmount(int nums) // quantity must fall in the range of 1 < n < 100,000
    {
        if ( (nums < 1) || (nums > 99999) )
        {
            do {
                System.out.print("Quantity cannot be less than 1 or greater than 99,999. Please re-enter Quantity: ");
                nums = user.nextInt();
            }while ( (nums < 1) || (nums > 99999) );
        }

        return nums;
    }

    //part of checkNums
    public int checkPrice(int nums) // price has to be a non-negative integer
    {
        if (nums < 1)
        {
            do {
                System.out.print("Price cannot be negative or 0. Please re-enter Price: ");
                nums = user.nextInt();
            }while (nums < 1);
        }

        return nums;
    }



}
