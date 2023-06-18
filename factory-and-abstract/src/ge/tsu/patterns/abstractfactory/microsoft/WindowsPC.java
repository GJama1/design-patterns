package ge.tsu.patterns.abstractfactory.microsoft;

import ge.tsu.patterns.abstractfactory.HardwareSpecs;
import ge.tsu.patterns.abstractfactory.PC;

public class WindowsPC implements PC {
    @Override
    public HardwareSpecs getSpecs() {
        return new HardwareSpecs(
                "AMD Ryzen 5 3600",
                "16GB DDR4",
                "1TB SSD",
                "NVIDIA GeForce RTX 2060"
        );
    }
}
