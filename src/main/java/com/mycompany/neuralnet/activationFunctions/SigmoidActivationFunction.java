package com.mycompany.neuralnet.activationFunctions;

/**
 * A function performed on the output of a neuron
 * 
 * @author Adam Matthews
 */
public class SigmoidActivationFunction implements ActivationFunction {

    /**
     * 
     * @param input
     * @return Sigmoid calculation performed on the input
     */
    @Override
    public double calculateOutput(double input) {
        return 1 / (1 + Math.exp(-input));
    }
}
