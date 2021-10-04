
public class Main { 
   public static void main(String[] args) 
   {
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Введите 1ое число:");
      int a = sc.nextInt();
      
      System.out.println("Введите 2ое число:");
      int b = sc.nextInt();
      
      System.out.println("Введите 3ье число:");
      int c = sc.nextInt();
      
      sc.close();
      
      int min = 0;
      
      if (a < b)
      {
        min = a;  
      }
      else
      {
        min = b;  
      }
      if (c < min)
      {
        min = c;  
      }
      
      System.out.println("Наименьшее число:" +min);
      
   }
}
