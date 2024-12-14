//Leo Bouchon
//Dec 11
//Punctuation,java, print out all words with punctuation at the end (I'm going to assume that you don't need to print out the punctuation itself)
//Period 6
//Pseudocode
//Class
//main
//	D&I punctuation class
//searchIt
//	call both getPunctuationWords and printWords
//getPunctuationWords
//	Have the String
//	call checkForPunctuation while inputting each index of the entire sentence
//	get all the punctuated words from checkForPunctuation and put them in a new string
//checkForPunctuation
//	Finds the beginning and end of the punctuation word
//	Returns the word
//printWords
//	print the string with only the punctuated words

public class Punctuation
{	
	public static void main(String[] args)
	{
		Punctuation p = new Punctuation(); //Instantiate class
		p.searchIt();//call searchit
	}
	public void searchIt()
	{
		String punctuations = getPunctuationWords();//call getPunctuation words and return to punctuation string
		printWords(punctuations);//call printwords, while using the punctuations string
	}
	public String getPunctuationWords()
	{
		String sentence = new String("Blood, Sweat, and Tears by Winston Churchill " +//Copy paste the sentence
		"May 13, 1940 " +
		"Mr. Speaker:" +
		"On Friday evening last I received His Majesty’s commission to form a new " +
		"Administration. It was the evident wish and will of Parliament and the nation that this should be conceived on the broadest possible basis and that it should include all parties, both those who supported the late Government and also the parties of the Opposition." +
		"I have completed the most important part of this task. "+
		"A War Cabinet has been formed of five Members, representing, with the Liberal Opposition, the unity of the nation. "+
		"The three party Leaders have agreed to serve, either in the War Cabinet or in high executive office. The three Fighting Services have been filled. "+
		"It was necessary that this should be done in one single day, on account of the extreme urgency and rigour of events. "+
		"A number of other key positions were filled yesterday, and I am submitting a further list to His Majesty tonight. "+
		"I hope to complete the appointment of the principal Ministers during tomorrow. "+
		"The appointment of the other Ministers usually takes a little longer, but I trust that, when Parliament meets again, this part of my task will be completed, and that the Administration will be complete in all respects." +
		"Sir, I considered it in the public interest to suggest that the House should be summoned to meet today. "+
		"Mr. Speaker agreed and took the necessary steps, in accordance with the powers conferred upon him by the Resolution of the House. "+
		"At the end of the proceedings today, the Adjournment of the House will be proposed until Tuesday, the 21st May, with, of course, provision for earlier meeting, if need be. "+
		"The business to be considered during that week will be notified to Members at the earliest opportunity. "+
		"I now invite the House, by the Resolution which stands in my name, to record its approval of the steps taken and to declare its confidence in the new Government." );
		String a = "";	//Create empty string
		for(int i = 0; i<sentence.length(); i++)//loop through each char in sentence
		{
			a+=checkForPunctuation(sentence, i);//call checkForPunctuation, parameters are the entire string and i (int)
		}
		return a;
	}
	public String checkForPunctuation(String sentence, int i)
	{
		int punctuationIndex = -1;//Find index num of punctuation
		int spaceIndex = -1;//Find index num of space
		if(sentence.charAt(i)=='!'||sentence.charAt(i)=='.'||sentence.charAt(i)=='?'||sentence.charAt(i)=='\''||sentence.charAt(i)=='\"'||sentence.charAt(i)==','||sentence.charAt(i)==';'||sentence.charAt(i)==':')//check all the possible punctuation marks
		{
			punctuationIndex = i;//find index of punctuation
			spaceIndex = sentence.lastIndexOf(' ', i);//find index of space
			if(spaceIndex==-1)//To prevent errors of the first word being punctuated
				spaceIndex = 0;
			return sentence.substring(spaceIndex, punctuationIndex+1);//Return substring from space to punctuation
		}
		return "";//return nothing incase we don't find punctuated words
	}
	public void printWords(String sentence)
	{
		System.out.println(sentence);//print the word
	}
}
