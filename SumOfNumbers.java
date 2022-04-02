//A method that recursively sums numbers from one to n given as parameters.

public class Main{

  public static void main(String args[]) { 
   System.out.println("Sum of numbers :"+sum(3)) ;
   System.out.println("Sum of numbers :"+sum(5)) ;
   System.out.println("Sum of numbers :"+sum(12)) ;
}
  
  public static int sum (int n){
  if(n==1){
    return 1;
    }
    return n+sum(n-1);
    
}
}
