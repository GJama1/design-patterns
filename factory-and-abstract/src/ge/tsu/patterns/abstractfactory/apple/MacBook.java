package ge.tsu.patterns.abstractfactory.apple;

import ge.tsu.patterns.abstractfactory.HardwareSpecs;
import ge.tsu.patterns.abstractfactory.PC;

public class MacBook implements PC {
    @Override
    public HardwareSpecs getSpecs() {
        return new HardwareSpecs(
                "Apple M1",
                "8GB",
                "256GB SSD",
                "Apple M1 GPU"
        );
    }
}
