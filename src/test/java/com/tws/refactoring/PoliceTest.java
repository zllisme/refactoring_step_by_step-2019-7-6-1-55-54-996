package com.tws.refactoring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PoliceTest {

    private Police police;

    @BeforeEach
    public void init(){
        police = new Police();

    }

    @Test
    public void should_return_ture_when_check_age_given_age_equal_18() {
        //given
        Driver driver = new Driver(18);

        //when
        boolean actual = police.checkDriver(driver);

        //then
        Assertions.assertTrue(actual);


    }

    @Test
    public void should_return_false_when_check_age_given_age_below_18() {
        //given
        Driver driver = new Driver(17);

        //when
        boolean actual = police.checkDriver(driver);

        //then
        Assertions.assertFalse(actual);

    }

    @Test
    public void should_return_true_when_check_age_given_age_19() {
        //given
        Driver driver = new Driver(19);

        //when
        boolean actual = police.checkDriver(driver);

        //then
        Assertions.assertTrue(actual);

    }





}