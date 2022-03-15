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
	
    public void givenMessage_IsProper_ShouldReturnSad() {
//		moodAnalyser.setMessage("I am in sad Mood");
        String result = moodAnalyser.analyseMood("I am in sad Mood");
        Assert.assertEquals("SAD", result);
    }
	
	/**
	 * This method will return Happy if we pass Happy mood.
	 */
	@Test
    public void givenMessage_IsProper_ShouldReturnHappy() {
//		moodAnalyser.setMessage("I am in happy Mood");
        String result = moodAnalyser.analyseMood("I am in happy Mood");
        Assert.assertEquals("HAPPY", result);
    }

	

}
