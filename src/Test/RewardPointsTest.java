
import com.mwhite.RewardPoints;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import java.math.BigDecimal;

import static org.junit.Assert.*;

public class RewardPointsTest {
    RewardPoints rewardPoints;

    @Before
    public void setUp() throws Exception {
        rewardPoints = new RewardPoints("Mary", "White", 8675309, 500);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void earnPointsTest() {
        assertTrue(rewardPoints.earnPoints(BigDecimal.valueOf(9.75)));
        assertEquals(510, rewardPoints.getPointsBalance());
    }

    @Test
    public void shouldNotEarnPointsForZeroDollarPurchase(){
        assertFalse(rewardPoints.earnPoints(BigDecimal.valueOf(0.00)));
        assertEquals(500, rewardPoints.getPointsBalance());
    }

    @Test
    public void shouldNotEarnPointsForNegativeDollarPurchase(){
        assertFalse(rewardPoints.earnPoints(BigDecimal.valueOf(-10.00)));
        assertEquals(500, rewardPoints.getPointsBalance());
    }

    @Test
    public void redeemPointsTest() {
        assertTrue(rewardPoints.redeemPoints(400));
        assertEquals(100, rewardPoints.getPointsBalance());
    }

    @Test
    public void shouldNotBeAbleToRedeemMorePointsThanIHaveTest(){
        assertFalse(rewardPoints.redeemPoints(600));
        assertEquals(500, rewardPoints.getPointsBalance());
    }
}