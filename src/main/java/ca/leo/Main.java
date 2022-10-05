package ca.leo;

/**
 * Hello world!
 *
 */
public class Main 
{
    /**
     * 
     */
    public static void main( String[] args )
    {
        try {
            System.out.println("the score is; "+ ScoreManager.scoreManager(args));
        
        }
        catch (Exception e){
            
            e.printStackTrace();
        
        }
    }
}
