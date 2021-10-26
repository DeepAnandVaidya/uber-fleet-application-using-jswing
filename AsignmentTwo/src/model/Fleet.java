/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author deepv
 */
public class Fleet {

    private ArrayList<Cars> fleet;
    private Date updatedDateTime;

    public Fleet() {
        this.fleet = new ArrayList<>();
    }

    public ArrayList<Cars> getFleet() {
        return fleet;
    }

    public void setFleet(ArrayList<Cars> fleet) {
        this.fleet = fleet;
    }

    public Cars addCars() {
        Cars cars = new Cars();
        fleet.add(cars);
        return cars;
    }

    public void deleteCar(Cars cars) {
        fleet.remove(cars);
    }

    public Date getUpdatedDateTime() {
        return updatedDateTime;
    }

    public void setUpdatedDateTime(Date updatedDateTime) {
        this.updatedDateTime = updatedDateTime;
    }

}
