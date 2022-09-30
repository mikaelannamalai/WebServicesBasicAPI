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
        String args[] = new String [1]
;       args[0]= "6.0"; 
        boolean result=ScoreManager.scoreManager(args);
        assertTrue("Testing 6.0",result==true);
    }
@Test
    public void shouldAnswerWithfalse() throws Exception
    {
        String args[] = new String [1]
;       args[0]= "3.0";
        boolean result=ScoreManager.scoreManager(args);
        assertTrue("Testing 3.0",result==false);
    }



    @Test(expected = Exception.class)
    public void shouldAnswerWithException() throws Exception {
        String args[] = new String[3];
        args[0] = "Hello";
        boolean result=ScoreManager.scoreManager(args);
        assertTrue("Testing invalid format",result==false);
    }
}
