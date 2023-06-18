package ge.tsu.patterns.abstractfactory.apple;

import ge.tsu.patterns.abstractfactory.AbstractITFactory;
import ge.tsu.patterns.abstractfactory.OS;
import ge.tsu.patterns.abstractfactory.PC;

public class AppleFactory implements AbstractITFactory {
    @Override
    public PC createPC() {
        return new MacBook();
    }

    @Override
    public OS createOS() {
        return new MacOS();
    }
}
