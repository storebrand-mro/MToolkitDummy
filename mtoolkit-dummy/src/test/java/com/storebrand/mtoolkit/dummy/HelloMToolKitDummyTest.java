package com.storebrand.mtoolkit.dummy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * TODO :: Delete me - I'm just because git doesn't track empty folders.
 *
 * @author Kevin Mc Tiernan, kevin.mc.tiernan@storebrand.no, 2022-05-09
 */
class HelloMToolKitDummyTest {

    @Test
    void helloWorld() {
        String whatIsMyName = "NameMe!";

        Assertions.assertEquals("Hello " + whatIsMyName, new HelloMToolKitDummy(whatIsMyName).hello());
    }
}
