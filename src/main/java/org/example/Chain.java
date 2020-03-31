package org.example;

import java.util.ArrayList;
import java.util.List;

public class Chain {
    List<ICalculator> strategies;

    public Chain() {
        strategies = new ArrayList<ICalculator>();

        strategies.add(new Mod15());
        strategies.add(new Mod5());
        strategies.add(new Mod3());
        strategies.add(new Mod1());
    }

    public String calculate(int value) throws Exception {
        for (ICalculator strategy : strategies) {
            String v = strategy.calculate(value);
            if(v != null)
                return v;
        }

        throw new Exception(String.format("Could not calculate value %d", value));
    }
}
