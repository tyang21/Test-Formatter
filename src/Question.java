
public abstract class Question 
{
	private static int currentNum;
	private int number;
	private String text;
	
	public Question(int num, String txt)
	{
		number = num;
		text  = txt;
	}
	
	public int getNumber()
	{
		return number;
	}
	
	public String getText()
	{
		return text;
	}
	
	public abstract String getSolution();
}
