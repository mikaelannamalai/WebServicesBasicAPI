package ca.leo;

public class ScoreManager {
    public ScoreManager() {
    }
    
    public static boolean scoreManager(String args[]) throws Exception{

        Double score=Double.valueOf(args[0]);
        return (score>=6);
    }

}
