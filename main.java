import java.util.Stack;
import java.util.Queue;
import java.util.Scanner;
import java.util.LinkedList;

class Main {
  public static void main(String[] args) {
    //creating stack object from Stack class
    Stack stack = new Stack();
    // importing Queue library and creating linkedlist object from the class
    Queue queue = new LinkedList();
    
    String inputSentence;
    int length;
    boolean isPalindrome = true;
    System.out.print("Input a sentence to check for palindrome: ");
    Scanner input = new Scanner(System.in);
    inputSentence = input.nextLine();
    length = inputSentence.length();

    for(int i = 0 ; i< length ; i++)
    {
     
        if(inputSentence.charAt(i) != '.' )
        {
          stack.push(inputSentence.charAt(i));
        }
    }
    for(int i = 0 ; i< length ; i++)
    {
      if(!stack.empty())
      {
       queue.add(stack.peek());
       stack.pop();
      }
    } 
    int i =0;
    char ch;
    while(!queue.isEmpty() && isPalindrome)
    {
         ch =(Character)queue.peek();
         System.out.println(ch);

         queue.remove();
        if( ch == inputSentence.charAt(i) )
          i++;
        else
          isPalindrome = false;
      
    }

   
    if(isPalindrome)
      System.out.println("Yes");
      else
      System.out.println("No");
    
    
  }
}
