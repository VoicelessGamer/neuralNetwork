package com.mycompany.neuralnet.summingFunctions;

import com.mycompany.neuralnet.Connection;
import java.util.List;

/**
 * Summing function for all the incoming connections
 * Calculates the sum of the weighted connections outputs
 *
 * @author Adam Matthews
 */
public final class WeightedSummingFunction implements SummingFunction {

    /**
     * @return Sum of the weighted input connections
     */
    @Override
    public double calculateOutput(List<Connection> inputConnections) {
        double weightedSum = 0;
        for (Connection connection : inputConnections) {
            weightedSum += connection.getWeightedInput();
        }
        return weightedSum;
    }

}
