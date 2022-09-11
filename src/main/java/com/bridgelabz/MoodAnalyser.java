package com.bridgelabz;

public class MoodAnalyser {

    String message;

    public MoodAnalyser() {
    }

    public MoodAnalyser(String message) {
        this.message = message;
    }

    public String analyseMood() throws MoodAnalyserException {
        try {
            if (message.toLowerCase().contains("sad"))
                return "SAD";
            else
                return "HAPPY";
        }
        catch (Exception e){
            throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.NULL,"Message is Null");
        }
    }
}
