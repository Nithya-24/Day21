package moodAnalyser;

public class MoodAnalyser {
	String message;
	
	public void MoodAnalyzer(String message) throws MoodAnalyserException{
        this.message = message;
    }
	
	 	  
	  public String getMessage() {
	        return message;
	    }
	  
	  public void setMessage(String message) {
	        this.message = message;
	    }
	  
	/**
	 * convert the Message to check its Mood
	 * @return
	 */
	
	public String analyseMood() {
		try {
		if (message.toLowerCase().contains("happy")) {
			return "HAPPY";
		} else if (message.toLowerCase().contains("sad")) {
            return "SAD";
       } 
		}catch( NullPointerException e) {
			 return "HAPPY";
		}
		return message;
	}

}
