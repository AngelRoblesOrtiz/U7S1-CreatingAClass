package com.codedifferently.labs.partA.ex02;

import partA.ex02.SavingBond;

public class SavingBondTest {
    public static void main(String[] args) {
        SavingBond saving = new SavingBond();
        saving.setBalance();
        saving.setTermAndRate();
        saving.earnInterest();
        saving.finalBalance();
    }
}
