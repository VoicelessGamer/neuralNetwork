package com.mycompany.neuralnet.activationFunctions;

/**
 * A function performed on the output of a neuron
 *
 * @author Adam Matthews
 */
public interface ActivationFunction {

    /**
     * Performs calculation on the output of a neuron
     *
     * @param input 
     *
     * @return Output's calculation based on the sum of inputs
     */
    double calculateOutput(double input);
}
