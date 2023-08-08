class UpperString 
{
	public static void main(String[] args) 
	{
		String s = "CHANDU";
		String res = "";
		for (int i =0;i<=s.length()-1 ;i++ )
		{
			char c = s.charAt(i);
			if (c >= 'A' && c <= 'Z')
			{
				res += (char) ((int)c + 32) ;
			}
		}
		System.out.println(res);
		System.out.println((char) 1);
	}
}
