/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayBasedQueues;

import java.time.LocalTime;

/**
 *
 * @author Ryan Kolbe
 */
public class Customer {

    private String custName;
    private LocalTime entryTime;

    public Customer() {
    }

    public Customer(String custName, LocalTime entryTime) {
        this.custName = custName;
        this.entryTime = entryTime;
    }

    public String getCustName() {
        return custName;
    }

    public LocalTime getEntryTime() {
        return entryTime;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public void setEntryTime(LocalTime entryTime) {
        this.entryTime = entryTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Customer{custName=").append(custName);
        sb.append(", entryTime=").append(entryTime);
        sb.append('}');
        return sb.toString();
    }
}
