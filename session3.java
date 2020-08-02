public class session3 {
    public static void main(String[] arguments) {
        int i = 0;
        while (i < 4) { // while loop format
          System.out.println(i);
          i += 1;
        }
        
        for (int i = 0; i < 4; i += 1) { // i++ is the same as += 1, but for every other number, use += (i-- is also a thing); --i will subtract first and then print, i-- prints first then subtracts
            if (i == 3) {
                break; // breaks out of the loop after 5 and 4 are printed
            }
            System.out.println(i);
          }
          
          for (INITIALIZE ; CONDITION TESTS ; UPDATE) {
            STATEMENTS
          }
    
    }
        
}

//ARRAYS:

int[] // integer array
double[]
String[]

// Declaring an array

int[] integers = new int[SIZE];
//or this works: TYPE[] NAME; NAME = new type[SIZE];
int[] integers2;
// ex. new int[5]

int[] integers3 = {1, 4, 7, 9, 10}; // we can do this if we know the list immediately

int[] integers4;
integers4 = {1, 4, 7, 9, 10}; // will return error, only can assign specific values while declaring, not separately

String hello = "Hello!";
int length_hello = hello.length(); // to find length of string

int[] integers = {1, 4, 7, 9, 10};
int length_array = integers.length; // to find length of array; no parantheses because it's a data attribute, not a method

      	

  public static void main(String[] arguments) {
    String hello = "Hello!";
    char[] helloArray = new char[hello.length()]; // this is to make sure you're making an arrary of one character at a time
    for (int i = 0; i < hello.length(); i++) {    // if you wanted to input a phrase and then make an array with each word as a diff element, you would have to somehow separate the string at each space, but the type of the array would still be String[]
      helloArray[i] = hello.charAt(hello.length() - 1 - i);
      System.out.println(hello.charAt(hello.length() - 1 - i));
            }
        }