package HW12;

import org.junit.Assert;
import org.junit.Test;

public class BalloonTest {

    private Balloon balloon = new Balloon();
    String text = "nlaebolko";

    @Test
    public void testCondition() {
        Assert.assertEquals(1, balloon.maxNumberOfBalloons(text));
    }

    @Test
    public void testNullexcept() {
        Assert.assertThrows(NullPointerException.class, () -> {
            balloon.maxNumberOfBalloons(null);
        });
    }
    @Test
    public void testOnConditionDoing() {
        Assert.assertTrue(balloon.maxNumberOfBalloons(text) > 0);
    }

    @Test
    public void testNew(){
        Assert.assertSame(1,balloon.maxNumberOfBalloons(text));
    }



}
