package HW12;

import org.junit.Assert;
import org.junit.Test;

public class GoodPairTest {

    private GoodPair goodPair = new GoodPair();
    private int[] nums = {1,2,3,1,1,3};


    @Test
    public void testCondition(){
        Assert.assertEquals(4,goodPair.numIdenticalPairs(nums));
    }
    @Test
    public void testNullExcept(){
        Assert.assertThrows(NullPointerException.class,()->{
            goodPair.numIdenticalPairs(null);
        });
    }

    @Test
    public void testRightArray(){
        Assert.assertArrayEquals(new int[]{1,2,3,1,1,3},nums);
    }

}
