package HW12;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JewelsAndStonesTest {
    private JewelsAndStones jewelsAndStones = new JewelsAndStones();
    private String jewels = "aA";
    private String stones = "aAAbbbb";


    @Test
    public void testOnNull(){
        jewelsAndStones.numJewelsInStones(jewels,stones);
        Assert.assertNotNull(jewels);
        Assert.assertNotNull(stones);
    }
    @Test
    public void testCondition(){

        Assert.assertEquals(3, jewelsAndStones.numJewelsInStones(jewels,stones));
    }
    @Test
    public void testEmpty(){
        jewels = "zz";

        Assert.assertEquals(0,jewelsAndStones.numJewelsInStones(jewels,stones));
    }

    @Test
    public void testNullExcept(){

        Assert.assertThrows(NullPointerException.class, () -> {
            jewelsAndStones.numJewelsInStones(null, stones);
        });
    }





}
