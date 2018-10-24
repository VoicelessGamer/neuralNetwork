package com.mycompany.neuralnet;

import java.util.ArrayList;
import java.util.List;

/**
 * A set of neurons defining of a single neural net's layer.
 *
 * @author Adam Matthews
 */
public class NeuralNetLayer {
    //Unique identifier
    private String id;
    
    //The collection of neurons defining this layer
    protected List<Neuron> neurons;

    /**
     * Creates an empty layer with a given id.
     *
     * @param id Layer identifier
     */
    public NeuralNetLayer(String id) {
        this.id = id;
        neurons = new ArrayList<>();
    }

    /**
     * Creates a layer with a list of neurons
     *
     * @param id Layer identifier
     * @param neurons List of neurons that define this layer
     */
    public NeuralNetLayer(String id, List<Neuron> neurons) {
        this.id = id;
        this.neurons = neurons;
    }
}
