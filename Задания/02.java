
public class Main { 
   public static void main(String[] args) 
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("Введите трехзначное число:");
      int number = sc.nextInt();
      sc.close();
      int sum = 0;
      int currentDigit;
      currentDigit = number % 10;
      sum = sum + currentDigit;
      
      number = number / 10;
      currentDigit = number % 10;
      sum = sum + currentDigit;
      number = number / 10;
      
      sum = sum + number;
      
      
      System.out.println("Сумма цифр трехзначного числа: " + sum);
   }
}

