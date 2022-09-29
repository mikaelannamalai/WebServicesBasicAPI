package ca.leo;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class ScoreManagerTest 
{
    /**
     * Rigorous Test :-)
     * @throws Exception
     */
    @Test
    public void shouldAnswerWithTrue() throws Exception
    {
        Double score = 6.0; 
        boolean result=ScoreManager.scoreManager(score);
        assertTrue("Testing 6.0",result==true);
    }
 @Test
    public void shouldAnswerWithfalse() throws Exception
    {
        Double score = 3.0; 
        boolean result=ScoreManager.scoreManager(score);
        assertTrue("Testing 3.0",result==false);
    }




}
