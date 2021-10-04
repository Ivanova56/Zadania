
public class Main { 
   public static void main(String[] args) 
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("Введите целое число:");
      int a = sc.nextInt();
      int i = a;
      sc.close();
      if ( i >= 0)
      {
          if (i > 0)
          {
            i = i + 1;
            System.out.println("Число положительное " + a + " + 1 = " + i);
          }
          else
          {
            i = 10;
            System.out.println("Число " + a + " заменяем на " + i);
          }
      }
      else
      {
        i = i - 2;  
        System.out.println("Число отрицательное " + a + " - 2 = " + i);  
      }
      
   }
}
