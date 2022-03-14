package moodAnalyser;

import static org.junit.Assert.*;

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
        String result = moodAnalyser.analyseMood("I am Sad Mood");
        Assert.assertEquals("SAD", result);
    }
	
	/**
	 * This method will return Happy if we pass as in any mood.
	 */
	@Test
    public void givenMessage_IsProper_AndContain_Any_ShouldReturnHappy() {
        String result = moodAnalyser.analyseMood("I am in Any Mood");
        Assert.assertEquals("HAPPY", result);
    }


}
