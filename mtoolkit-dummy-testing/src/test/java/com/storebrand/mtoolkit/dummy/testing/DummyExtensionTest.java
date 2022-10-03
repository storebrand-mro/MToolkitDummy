package com.storebrand.mtoolkit.dummy.testing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * TODO :: Delete me - I'm here because git doesn't track empty folders.
 *
 * @author Kevin Mc Tiernan, kevin.mc.tiernan@storebrand.no, 2022-05-09
 */
class DummyExtensionTest {

    @Test
    void helloTest() {
        Assertions.assertEquals("Hello!", DummyExtension.hello());
    }
}
