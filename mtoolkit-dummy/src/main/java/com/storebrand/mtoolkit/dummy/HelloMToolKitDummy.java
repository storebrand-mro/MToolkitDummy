package com.storebrand.mtoolkit.dummy;

/**
 * TODO :: Delete me - I'm just because git doesn't track empty folders.
 *
 * @author Kevin Mc Tiernan, kevin.mc.tiernan@storebrand.no, 2022-05-09
 */
public class HelloMToolKitDummy {

    private final String _myToolkitName;

    public HelloMToolKitDummy(String myToolkitName) {
        _myToolkitName = myToolkitName;
    }

    public String hello() {
        return "Hello " + _myToolkitName;
    }
}
