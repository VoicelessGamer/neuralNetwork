package com.mycompany.neuralnet;

import java.util.List;

/**
 * An artificial neural network with layers containing neurons.
 *
 * @author Adam Matthews
 */
public class NeuralNet {
    //Unique identifier
    private String id;
    
    //Input layer
    private NeuralNetLayer inputLayer;
    
    //List of hidden layers
    private List<NeuralNetLayer> hiddenLayers;
    
    //Output layer
    private NeuralNetLayer outputLayer;

    /**
     * Constructs a neural net with all layers
     *
     * @param id Neural network id
     * @param inputLayer Neural network input layer
     * @param hiddenLayers Neural network hidden layers
     * @param outputLayer Neural network output layer
     */
    public NeuralNet(String id, NeuralNetLayer inputLayer, List<NeuralNetLayer> hiddenLayers,
            NeuralNetLayer outputLayer) {
        this.id = id;
        this.inputLayer = inputLayer;
        this.hiddenLayers = hiddenLayers;
        this.outputLayer = outputLayer;
    }

    /**
     * Constructs a neural net without hidden layers.
     *
     * @param id Neural network id
     * @param inputLayer Neural network input layer
     * @param outputLayer Neural network output layer
     */
    public NeuralNet(String id, NeuralNetLayer inputLayer, NeuralNetLayer outputLayer) {
        this.id = id;
        this.inputLayer = inputLayer;
        this.outputLayer = outputLayer;
    }
}
