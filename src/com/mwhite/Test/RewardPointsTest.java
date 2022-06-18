
import com.mwhite.RewardPoints;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


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
    public void earnPoints() {
        fail("test not created yet");
    }

    @Test
    public void redeemPoints() {
        fail("test not created yet");
    }
}