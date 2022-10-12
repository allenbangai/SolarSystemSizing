package solarsystemsizing.Model;

/**
 * Energy stands for Total Energy
 * @since year 2022
 * 
 * @version 1.0
 * 
 * @author Kamadje Allen
 */
public class Energy extends Power{
    private int numOfHours;//hours of utilization of load per day

    /**
     * Instantiate parameters for a load from class Tpower.
     * Instantiate parameters for total hours of use of load per day in Hours (H).
     * S.I.U of hours is H.
     * @param numOfHours
     * @param numOfLoad
     * The {@link #numOfLoad} entered here is of type integer and has no S.I.U.
     * @param powerOfLoad 
     * The {@link #powerOfLoad} entered here is of type integer and has S.I.U in Watt(W).
     */
    public Energy(int numOfHours, int numOfLoad, int powerOfLoad) {
        super(numOfLoad, powerOfLoad);
        this.numOfHours = numOfHours;
    }

    /**
     * Instantiate parameters for a load from class Tpower.
     * Instantiate parameters for total hours of use of load per day in Hours (H).
     * S.I.U of hours is H.
     * @param numOfHours
     * @param numOfLoad
     * The {@link #numOfLoad} entered here is of type integer and has no S.I.U.
     * @param powerOfLoad 
     * The {@link #powerOfLoad} entered here is of type integer and has S.I.U in Watt(W).
     * @param nameOfLoad
     * The {@link #nameOfLoad} entered here is of type string and has no S.I.U.
     */
    public Energy(int numOfHours, int numOfLoad, int powerOfLoad, String nameOfLoad) {
        super(numOfLoad, powerOfLoad, nameOfLoad);
        this.numOfHours = numOfHours;
    }

    /**
     * @return 
     * Return the total number of hours the load is used per day
     */
    public int getNumOfHours() {
        return numOfHours;
    }
    
    /**
     * @param numOfHours 
     * Set the total number of hours of load per day in H
     */
    public void setNumOfHours(int numOfHours) {
        this.numOfHours = numOfHours;
    }
    
    /**
     * @return 
     * Return the total energy consumed by a particular load in a day
     */
    public int getEnergy(){
        return (super.getPower() * getNumOfHours());
    }
    
}
