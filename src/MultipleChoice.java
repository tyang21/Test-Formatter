
public class MultipleChoice extends Question
{
	private String[] answerChoices;
	private char correctAnswer;
	
	public  MultipleChoice(int num, String txt)
	{
		super(num,txt);
	}
	
	public String toString()
	{
		String t = getNumber() + getText();
		char a = 'a';
		for(String answer : answerChoices)
		{
			t += a + ":" + answer;
			a++;
		}
		
		return t;
	}	
	public String getSolution()
	{
		return String.valueOf(correctAnswer);
	}
	
}
	
