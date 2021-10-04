
public class Main { 
   public static void main(String[] args) 
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("Введите число:");
      int a = sc.nextInt();
      sc.close();
      
      if (a == 0)
      {
        System.out.println("Число нулевое: ");  
      }
      else
      {
          
        if (a > 0)
        {
            if( a % 2 == 0)
            {
            System.out.println("Положительное четное");
            } 
            else 
            {
            System.out.println("Положительное нечетное");
            }
        }
        else
        {
            if( a % 2 == 0)
            {
            System.out.println("Отрицательное четное");
            } 
            else 
            {
            System.out.println("Отрицательное нечетное");
            }
            
        }
        
      }
   }
}
