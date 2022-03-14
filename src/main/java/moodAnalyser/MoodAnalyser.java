package moodAnalyser;

public class MoodAnalyser {
	String message;
	
	public void MoodAnalyzer(String message) {
        this.message = message;
    }
	/**
	 * convert the Message to Lowercase and check its Mood
	 * @param message
	 * @return
	 */
	
	public String analyseMood(String message) {
		if (message.toLowerCase().contains("happy")) {
			return "HAPPY";
		} else if (message.toLowerCase().contains("sad")) {
            return "SAD";
        } else if (message.toLowerCase().contains("any")) {
            return "HAPPY";
        } else {
            return null;
		}
	}
}
