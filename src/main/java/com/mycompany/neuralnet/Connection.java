package com.mycompany.neuralnet;

/**
 * A weighted connecting between two neurons
 * @author Adam Matthews
 */
public class Connection {
    //This connection is the output connection for the source neuron    
    protected Neuron sourceNeuron;
    
    //This connection is the input connection for the target neuron
    protected Neuron targetNeuron;
    
    //Connection weighting
    protected double weighting;

    /**
     * Creates a connection between two neurons with a randomised weighting between 0 and 1
     *
     * @param sourceNeuron Neuron to connect from
     * @param targetNeuron Neuron to connect to
     */
    public Connection(Neuron sourceNeuron, Neuron targetNeuron) {
        this.sourceNeuron = sourceNeuron;
        this.targetNeuron = targetNeuron;
        this.weighting = Math.random();
    }

    /**
     * Creates a connection between two neurons with a given weighting
     *
     * @param sourceNeuron Neuron to connect from
     * @param targetNeuron Neuron to connect to
     * @param weighting Connection weighting
     */
    public Connection(Neuron sourceNeuron, Neuron targetNeuron, double weighting) {
        this(sourceNeuron, targetNeuron);
        this.weighting = weighting;
    }

    /**
     * 
     * @return Weighting
     */
    public double getWeighting() {
        return weighting;
    }

    /**
     * 
     * @param weighting 
     */
    public void setWeighting(double weighting) {
        this.weighting = weighting;
    }

    /**
     * Returns the calculated output of the source neuron, which is the input value for this connection
     *
     * @return The input value for this connection
     */
    public double getInput() {
        return sourceNeuron.calculateOutput();
    }

    /**
     * Returns the calculated output of the source neuron multiplied by a weighting value
     *
     * @return The input value of this connection multiplied by the connection weighting
     */
    public double getWeightedInput() {
        return sourceNeuron.calculateOutput() * weighting;
    }

    /**
     *
     * @return The source neuron for this connection
     */
    public Neuron getSourceNeuron() {
        return sourceNeuron;
    }

    /**
     *
     * @return The target neuron for this connection
     */
    public Neuron getTargetNeuron() {
        return targetNeuron;
    }
}
