package com.mwhite;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        RewardPoints rewardPoints = new RewardPoints("Mary", "White", 8675309, 500);
        System.out.println(rewardPoints.getPointsBalance());
        rewardPoints.earnPoints(BigDecimal.valueOf(9.75));
        System.out.println(rewardPoints.getPointsBalance());

    }
}
