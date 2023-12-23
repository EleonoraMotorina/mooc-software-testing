package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;


public class GHappyTest {

    private GHappy happy;

    @BeforeEach
    public void inilitiaze(){
        this.happy = new GHappy();
    }

    @Test
    public void zeroHappy() {
        boolean resualt = happy.gHappy("gxgxgxg");
        Assertions.assertFalse(resualt);
    }

    @Test
    public void singleHappy() {
        boolean result = happy.gHappy("xxgxx");
        Assertions.assertFalse(result);
    }

    @Test
    public void doubleHappy() {
        boolean result = happy.gHappy("xxggxx");
        Assertions.assertTrue(result);
    }

    @Test
    public void singleAndDoubleHappy() {
        boolean result = happy.gHappy("xxggyygxx");
        Assertions.assertFalse(result);
    }

    @Test
    public void allHappy(){
        boolean result = happy.gHappy("gggg");
        Assertions.assertTrue(result);
    }

    @Test
    public void noGsInString(){
        boolean result = happy.gHappy("xxxx");
        Assertions.assertTrue(result);
    }
}
