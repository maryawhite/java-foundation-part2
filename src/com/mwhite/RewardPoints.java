package com.mwhite;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class RewardPoints {
    //properties
    private String firstName;
    private String lastName;
    private int idNumber;
    private int pointsBalance;

    //constructor
    public RewardPoints(String firstName, String lastName, int idNumber, int pointsBalance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
        this.pointsBalance = pointsBalance;
    }

    //getters and setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public int getPointsBalance() {
        return pointsBalance;
    }

    public void setPointsBalance(int pointsBalance) {
        this.pointsBalance = pointsBalance;
    }

    //method to earn points. Earn one point per dollar spend, rounded half-up
    //round the amount HALF_UP – rounds towards “nearest neighbor” unless both neighbors are equidistant, in which case rounds up
    public boolean earnPoints (BigDecimal purchaseAmount) {
        if(purchaseAmount.compareTo(BigDecimal.ZERO) <= 0) {
            return false;
        } else {
            BigDecimal rounded = purchaseAmount.round(new MathContext(1, RoundingMode.HALF_UP));
            int earnedPoints = rounded.intValue();
            pointsBalance += earnedPoints;
            return true;
        }
    }

    //method to redeem points
    public boolean redeemPoints(int amount) {
        if(amount > pointsBalance) {
            return false;
        } else {
            pointsBalance -= amount;
            return true;
        }
    }

}
