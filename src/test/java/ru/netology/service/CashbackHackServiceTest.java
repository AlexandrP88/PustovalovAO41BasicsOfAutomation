package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void testCalculateRemainLess1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 900;
        int expected = 100;

        assertEquals(cashbackHackService.remain(amount), expected);

    }

    @Test

    public void testCalculateRemainMore1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1300;
        int expected = 700;

        assertEquals(cashbackHackService.remain(amount), expected);

    }

    @Test

    public void testCalculateRemainZero() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 0;
        int expected = 1000;

        assertEquals(cashbackHackService.remain(amount), expected);

    }

    @Test

    public void testCalculateRemain1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;
        int expected = 0;

        assertEquals(cashbackHackService.remain(amount), expected);

    }
}