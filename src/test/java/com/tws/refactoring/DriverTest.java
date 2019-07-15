package com.tws.refactoring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class DriverTest {

    private static Driver driver;

    @BeforeEach
    public void init() {
        driver = new Driver();
    }

    @Test
    public void should_return_ture_when_check_age_given_age_equal_18() {
        //given
        driver.setAge(18);

        //when
        boolean actual = driver.isLegalDriver();

        //then
        Assertions.assertTrue(actual);


    }

    @Test
    public void should_return_false_when_check_age_given_age_below_18() {
        //given
        driver.setAge(17);

        //when
        boolean actual = driver.isLegalDriver();

        //then
        Assertions.assertFalse(actual);

    }

    @Test
    public void should_return_true_when_check_age_given_over_18() {
        //given
        driver.setAge(19);

        //when
        boolean actual = driver.isLegalDriver();

        //then
        Assertions.assertTrue(actual);

    }


}