package moodAnalyser;

public class MoodAnalyser {
	String message;
	
	public void MoodAnalyzer(String message) {
        this.message = message;
    }
	
	 	  
	  public String getMessage() {
	        return message;
	    }
	  
	  public void setMessage(String message) {
	        this.message = message;
	    }
	  
	/**
	 * convert the Message to Lowercase and check its Mood
	 * @return
	 */
	
	public String analyseMood() {
		if (message.toLowerCase().contains("happy")) {
			return "HAPPY";
		} else if (message.toLowerCase().contains("sad")) {
            return "SAD";
        } else if (message.toLowerCase().contains("any")) {
            return "ANY";
        } else {
            return null;
		}
	}
}
