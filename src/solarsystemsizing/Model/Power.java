package solarsystemsizing.Model;

/**
 * @since year 2022
 * 
 * @version 1.0
 * 
 * @author Kamadje Allen
 * @description
 * This class Power.java describes the characteristics of the different loads that can be used to sizing a PV system.
 * To size a PV system, we need to know the number of loads, power of load and the name of that load. Hence, our class has 
 * three data variables which are {@link #numOfLoad}, {@link #powerOfLoad}, and {@link #nameOfLoad}.
 * 
 * Hence, the following three data variables are the characteristics used to discribe the a load when sizing a PV system
 * and the object of type power is instantiated using this data variables.
 */
public class Power {
    private int numOfLoad;
    private int powerOfLoad;
    private String nameOfLoad;

    /**
     * Instantiates data variables for a load to obtain an object of type power with number and power of load
     * @param numOfLoad
     * The {@link #numOfLoad} enter here is of type integer and has no S.I.U.
     * @param powerOfLoad 
     * The {@link #powerOfLoad} enter here is of type integer and has S.I.U in Watt(W).
     */
    public Power(int numOfLoad, int powerOfLoad) {
        this.numOfLoad = numOfLoad;
        this.powerOfLoad = powerOfLoad;
    }

    /**
     * Instantiates data variables for a load to obtain an object of type power with number and power of load
     * @param numOfLoad
     * The {@link #numOfLoad} entered here is of type integer and has no S.I.U.
     * @param powerOfLoad 
     * The {@link #powerOfLoad} entered here is of type integer and has S.I.U in Watt(W).
     * @param nameOfLoad
     * The {@link #nameOfLoad} entered here is of type string and has no S.I.U.
     */
    public Power(int numOfLoad, int powerOfLoad, String nameOfLoad) {
        this.numOfLoad = numOfLoad;
        this.powerOfLoad = powerOfLoad;
        this.nameOfLoad = nameOfLoad;
    }

    /**
     * @return 
     * Return the available number of load.
     */
    public int getNumOfLoad() {
        return numOfLoad;
    }

    /**
     * @param numOfLoad 
     * Set available number of load for a given load.
     */
    public void setNumOfLoad(int numOfLoad) {
        this.numOfLoad = numOfLoad;
    }

    /**
     * @return 
     * Return the power of particular load.
     */
    public int getPowerOfLoad() {
        return powerOfLoad;
    }

    /**
     * @param powerOfLoad 
     * Set the power of a given load in Watt.
     */
    public void setPowerOfLoad(int powerOfLoad) {
        this.powerOfLoad = powerOfLoad;
    }
    
    /**
     * @return 
     * Implementation to return the total power (W) from the load of a single device 
     * and number of load available.
     */
    public int getPower(){
        return (numOfLoad * powerOfLoad);
    }

    /**
     * @return String return the nameOfLoad
     */
    public String getNameOfLoad() {
        return nameOfLoad;
    }
}
