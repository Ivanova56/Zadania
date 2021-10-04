
public class Main { 
   public static void main(String[] args) 
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("Введите число:");
      int a = sc.nextInt();
      sc.close();
      double ru;
      String st = "Стоимость разговора: ";
      
      switch (a)
      {
          case 905:
              ru = 4.15 * 10;
              System.out.println("Москва." + st + ru + " рублей");
              break;
              
          case 194:
              ru = 1.98 * 10;
              System.out.println("Ростов." + st + ru + " рублей"); 
              break;
              
          case 491:
              ru = 2.69 * 10;
              System.out.println("Краснодар." + st + ru + " рублей");
              break;
              
          case 800:
              ru = 5 * 10;
              System.out.println("Киров." + st + ru + " рублей");
              break;
              
          default:
              System.out.println("Неверный код");
              break;
                
      }
      
   }
}
