package com.mycompany.neuralnet;

import com.mycompany.neuralnet.summingFunctions.SummingFunction;
import com.mycompany.neuralnet.activationFunctions.ActivationFunction;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Adam Matthews
 */
public class Neuron {
    //Unique identifier
    private String id;
    
    //List of the input connections TO this neuron
    protected List<Connection> inputConnections;
    
    //List of the output connections FROM this neuron to other neurons     
    protected List<Connection> outputConnections;
    
    //Input summing function for this neuron    
    protected SummingFunction summingFunction;
    
    //Activation function for this neuron
    protected ActivationFunction activationFunction;

    /**
     * Default constructor
     */
    public Neuron() {
        this.inputConnections = new ArrayList<>();
        this.outputConnections = new ArrayList<>();
    }

    /**
     * Calculates the neuron's output
     * @return The output of passing the total input into the activation function
     */
    public double calculateOutput() {
        double totalInput = summingFunction.calculateOutput(inputConnections);
        return activationFunction.calculateOutput(totalInput);
    }
}
