
public class Main { 
   public static void main(String[] args) 
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("Введите целое число:");
      int i = sc.nextInt();
      sc.close();
      if ( i >= 0)
      {
         i = i + 1;
         System.out.println(": " + i);
      }
      else
      {
        System.out.println(": " + i);  
      }
      
   }
}
