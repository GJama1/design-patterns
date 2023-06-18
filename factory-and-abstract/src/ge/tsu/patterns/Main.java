package ge.tsu.patterns;

import ge.tsu.patterns.abstractfactory.AbstractITFactory;
import ge.tsu.patterns.abstractfactory.OS;
import ge.tsu.patterns.abstractfactory.PC;
import ge.tsu.patterns.abstractfactory.microsoft.MicrosoftFactory;
import ge.tsu.patterns.factorymethod.GorillaFactory;
import ge.tsu.patterns.factorymethod.Jungle;
import ge.tsu.patterns.factorymethod.OrangutanFactory;

public class Main {
    public static void main(String[] args) {

        //Factory method
        Jungle jungle = new OrangutanFactory();
        jungle.anarchy();

        jungle = new GorillaFactory();
        jungle.anarchy();

        jungle = new OrangutanFactory();
        jungle.anarchy();

        //Abstract factory
        AbstractITFactory factory = new MicrosoftFactory();
        PC pc = factory.createPC();
        OS os = factory.createOS();

        System.out.println(pc.getSpecs());
        System.out.println(os.getSpecs());

    }
}