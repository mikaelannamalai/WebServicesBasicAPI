package ca.leo;

/**
 * Hello world!
 *
 */
public class Main 
{
    /**
     * @param args
     */
    public static void main( String[] args )
    {
        boolean result;
    
        Double score=Double.valueOf(args[0]);
        try {
        result = ScoreManager.scoreManager(score);
        System.out.println("the score is accepted; "+result);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
