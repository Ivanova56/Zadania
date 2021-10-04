
public class Main
{
	public static void main(String[] args) 
	{
	    int[] j = {1,-10,5,6,45,23, 45,-34,0,32,56,-1,2,-2};
		
        int maxNum = j[0];
        int kolvopos = 0;
        for (int n : j) 
        {
            if (n > maxNum)
                maxNum = n;
        }
        System.out.println("Максимальное число = " + maxNum);
        
        int sumpos = 0;
        for (int i = 0; i < j.length; i++) 
        {
            
            if (j[i] > 0)
            {
                sumpos = sumpos +j[i];
                kolvopos = kolvopos + 1;
            }    
        }
        System.out.println("Сумма положительных элементов = " + sumpos);
        System.out.println("Колличество положительных элементов = " +kolvopos);
        
        int sumall = 0;
        int sumneg = 0;
        int kolvoneg = 0;
        for (int i = 0; i < j.length; i++) 
        {
            
            if (j[i] < 0)
            {
                kolvoneg = kolvoneg + 1;
                sumall = j[i] + sumall;
                if( j[i] % 2 == 0)
                {
                sumneg = sumneg +j[i];
                }
            } 
            
        }
        int srarif = sumall / kolvoneg ;
        
        System.out.println("Среднее арифметическое отрицательных элементов = " + srarif);
        System.out.println("Сумма отрицательных четных элементов = " + sumneg);
        
	}
}

