package solarsystemsizing.Model;

/**
 *
 * @since year 2022
 * 
 * @version 1.0
 * 
 * @author Kamadje Allen
 */
public class Power {
    private int numOfLoad;
    private int powerOfLoad;
    private String nameOfLoad;

    /***
     * Instantiates parameters for a load so the total number of load can be return from object
     * S.I.U of Load is Watt(W).
     * @param numOfLoad
     * @param powerOfLoad 
     */
    public Power(int numOfLoad, int powerOfLoad) {
        this.numOfLoad = numOfLoad;
        this.powerOfLoad = powerOfLoad;
    }

    /**
     * 
     * @param numOfLoad
     * @param powerOfLoad
     * @param nameOfLoad
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

    /**
     * @param nameOfLoad the nameOfLoad to set
     */
    public void setNameOfLoad(String nameOfLoad) {
        this.nameOfLoad = nameOfLoad;
    }

}
