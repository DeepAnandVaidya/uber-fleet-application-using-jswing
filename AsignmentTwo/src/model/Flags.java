/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author deepv
 */
public class Flags {

    private String location;
    private String user;
    private String locationFilter;
    private String manufacturerFilter;
    private String manufactureYearFilter;
    private int minSeatsFilter;
    private int maxSeatsFilter;
    private String serialNoFilter;
    private String modelNoFilter;
    private String expiredMaintCert;
    private String availability;
    private String findFirstCar;
    private String serialNumber;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getLocationFilter() {
        return locationFilter;
    }

    public void setLocationFilter(String locationFilter) {
        this.locationFilter = locationFilter;
    }

    public String getManufacturerFilter() {
        return manufacturerFilter;
    }

    public void setManufacturerFilter(String manufacturerFilter) {
        this.manufacturerFilter = manufacturerFilter;
    }

    public String getManufactureYearFilter() {
        return manufactureYearFilter;
    }

    public void setManufactureYearFilter(String manufactureYearFilter) {
        this.manufactureYearFilter = manufactureYearFilter;
    }

    public int getMinSeatsFilter() {
        return minSeatsFilter;
    }

    public void setMinSeatsFilter(int minSeatsFilter) {
        this.minSeatsFilter = minSeatsFilter;
    }

    public int getMaxSeatsFilter() {
        return maxSeatsFilter;
    }

    public void setMaxSeatsFilter(int maxSeatsFilter) {
        this.maxSeatsFilter = maxSeatsFilter;
    }

    public String getSerialNoFilter() {
        return serialNoFilter;
    }

    public void setSerialNoFilter(String serialNoFilter) {
        this.serialNoFilter = serialNoFilter;
    }

    public String getModelNoFilter() {
        return modelNoFilter;
    }

    public void setModelNoFilter(String modelNoFilter) {
        this.modelNoFilter = modelNoFilter;
    }

    public String getExpiredMaintCert() {
        return expiredMaintCert;
    }

    public void setExpiredMaintCert(String expiredMaintCert) {
        this.expiredMaintCert = expiredMaintCert;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public String getFindFirstCar() {
        return findFirstCar;
    }

    public void setFindFirstCar(String findFirstCar) {
        this.findFirstCar = findFirstCar;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

}
