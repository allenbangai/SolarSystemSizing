/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solarsystemsizing.Sizing;

import solarsystemsizing.Total;
import solarsystemsizing.Model.Energy;
import java.util.ArrayList;

/**
 * This class Battery.java describes the characteristics of a battery used in sizing 
 * solar systems... As we all know, a battery both has the Energy it stores in Ampere hour
 * (Ah) and the voltage at which it is either charged or discharged measured in volts (VDC).
 * This characteristics are used to describe an object of a battery so we could this class to 
 * describe different types of objects of batteries. This characteristics are {@link #voltage} 
 * and {@link #ampereHour}.
 * @since year 2022
 * 
 * @version 1.0
 * 
 * @author Kamadje Allen
 */
public class TEnergy extends Total{
    private ArrayList<Energy> energys = new ArrayList<>();
    private int tEnergy;
    private int hours;

    /**
     * 
     * @param energys
     */
    public TEnergy(ArrayList<Energy> energys) {
        this.energys = energys;
    }

    /**
     * 
     * @param tEnergy
     * @param hours
     */
    public TEnergy(int tEnergy, int hours) {
        this.tEnergy = tEnergy;
        this.hours = hours;
    }

    /**
     * 
     * @return
     */
    public int getHours(){
        return hours;
    }

    /**
     * 
     * @return
     */
    public int gettEnergy() {
        return tEnergy;
    }

    /**
     * 
     * @param tEnergy
     */
    public void settEnergy(int tEnergy) {
        this.tEnergy = tEnergy;
    }

    /**
     * 
     * @return
     */
    public ArrayList<Energy> getEnergys() {
        return energys;
    }

    /**
     * 
     * @param tEnergys
     */
    public void setEnergys(ArrayList<Energy> tEnergys) {
        this.energys = tEnergys;
    }

    private int val1 = 0, val2 = 0;
    /**
     * 
     */
    private void toHelp(){
        for (Energy energy : energys) {
            val1 = val1 + energy.getEnergy();
            val2 = val2 + energy.getPower();
        }

    }

    /**
     * 
     */
    @Override
    public double totalE() {
        if (getEnergys().isEmpty()) {
            return getVal() * gettEnergy();
        }else {
            toHelp();
            return (double) (getVal() * val1);
        }
    }
    
    /**
     * 
     */
    @Override
    public double totalP(){
        if(getEnergys().isEmpty()){
            return (double) (gettEnergy()/getHours());
        }else{
            toHelp();
            return (double) (val2);
        }
    }
}
