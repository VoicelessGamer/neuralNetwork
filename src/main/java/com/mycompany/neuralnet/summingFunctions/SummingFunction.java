package com.mycompany.neuralnet.summingFunctions;

import com.mycompany.neuralnet.Connection;
import java.util.List;

/**
 * Represents a signal collector
 * Summing function for all the incoming connections
 *
 * @author Adam Matthews
 */
public interface SummingFunction {

    /**
     * Performs calculations on the output values of the input neurons.
     *
     * @param inputConnections List of the incoming neuron connection
     * @return The outcome of the performed calculation(s) on the input connections
     */
    double calculateOutput(List<Connection> inputConnections);
}
