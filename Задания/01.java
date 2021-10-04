
public class Main { 
   public static void main(String[] args) 
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("Введите число:");
      int a = sc.nextInt();
      sc.close();
      System.out.println("Введено число:" + a);
      int thelastdigit = a%10;
      System.out.println("Последняя цифра: " + thelastdigit);
   }
}