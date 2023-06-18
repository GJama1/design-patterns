package ge.tsu.patterns.abstractfactory.microsoft;

import ge.tsu.patterns.abstractfactory.AbstractITFactory;
import ge.tsu.patterns.abstractfactory.OS;
import ge.tsu.patterns.abstractfactory.PC;

public class MicrosoftFactory implements AbstractITFactory {
    @Override
    public PC createPC() {
        return new WindowsPC();
    }

    @Override
    public OS createOS() {
        return new Windows();
    }
}
