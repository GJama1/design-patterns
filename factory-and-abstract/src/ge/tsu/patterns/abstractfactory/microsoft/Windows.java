package ge.tsu.patterns.abstractfactory.microsoft;

import ge.tsu.patterns.abstractfactory.OS;
import ge.tsu.patterns.abstractfactory.OSSpecs;

public class Windows implements OS {
    @Override
    public OSSpecs getSpecs() {
        return new OSSpecs("Windows", "10.0.19042.867");
    }
}
