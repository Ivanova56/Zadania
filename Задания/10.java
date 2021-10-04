
public class Main
{
	public static void main(String[] args) 
	{
	    
	    int[] mas = {15,10,0,-6,-5,3,0,-34,0,32,56,0,24,52};
        int i = 0;
		System.out.print("Исходный массив \n");
		
		for (int n : mas)
            System.out.print(n+"  ");
		
        for(int j = 0, l = mas.length; j < l;) {
            if(mas[j] == 0)
                j++;
            else {
                int temp = mas[i];
                mas[i] = mas[j];
                mas[j] = temp;
                i ++;
                j ++;
            }
        }
        
        while (i < mas.length)
            mas[i++] = 0;
            
		System.out.print("\nМассив после перемещения нулей в конец \n");
        
        for (int n : mas)
            System.out.print(n+"  ");
			System.out.print("\n");
	}    
}