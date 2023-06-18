package ge.tsu.patterns.abstractfactory.apple;

import ge.tsu.patterns.abstractfactory.OS;
import ge.tsu.patterns.abstractfactory.OSSpecs;

public class MacOS implements OS {
    @Override
    public OSSpecs getSpecs() {
        return new OSSpecs("MacOS", "11.2.3");
    }
}
