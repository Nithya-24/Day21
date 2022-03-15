package moodAnalyser;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
	MoodAnalyser moodAnalyser = new MoodAnalyser();
	
	/**
	 * To check the mood whether it is Happy or Sad or Any
	 * 
	 */
	@Test
	
    public void givenMessage_IsProper_ShouldReturnSad() throws MoodAnalyserException {
		moodAnalyser.setMessage("I am in sad Mood");
        String result = moodAnalyser.analyseMood();
        Assert.assertEquals("SAD", result);
    }
	
	/**
	 * This method will return Happy if we pass Happy mood.
	 */
	@Test
    public void givenMessage_IsProper_ShouldReturnHappy() throws MoodAnalyserException {
		moodAnalyser.setMessage("I am in happy Mood");
        String result = moodAnalyser.analyseMood();
        Assert.assertEquals("HAPPY", result);
    }
	
	/**
	 * created the test case to check for NullException.
	 * If null value passed then it will return Invalid Mood  
	 */
	@Test
	 public void NullReturnHappy() throws MoodAnalyserException{
		try  {
        moodAnalyser.setMessage(null);
        String result = moodAnalyser.analyseMood();
        Assert.assertEquals("Invalid Mood", result);
    }catch (MoodAnalyserException e) {
    System.out.println("Invalid Mood");
    }

}
}
	
