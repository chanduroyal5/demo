class Pascal_triangle_pattern 
{
	public static void main(String[] args) 
	{
		int space=5;
		int star=1;
		for (int i=0;i<=4 ;i++ )
		{
			int n=1;
			for (int a=1;a<=space ;a++ )
			{
				System.out.print("   ");
			}
			//int n=1;
			for (int j=0;j<star ;j++ )
			{
				System.out.print("  "+n+"   ");
				n=n*(i-j)/(j+1);
			}
			System.out.println();
			space--;
			star++;
		}
	}
}
