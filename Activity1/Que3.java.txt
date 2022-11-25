package question3;

public class pattern {

	public static void main(String[] args) {
		int number=1;
		for(int i=0;i<=4;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(number++ +" ");
			}
			System.out.println();
		}
		
	}

}