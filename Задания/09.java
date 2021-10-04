
public class Main
{
	public static void main(String[] args) 
	{
	    int[] j = {1515,10,51, 6, 5,3, 10,-34,0,32,56, 12,24, 52};
	    
	    for (int n = 0; n < j.length; n++) 
	    {
            System.out.print(j[n] + " ");
        }
        
		System.out.println();
		
		for (int i = j.length-1; i >= 0; i--) 
		{
            System.out.print(j[i] + " ");
        }
	}    
}


