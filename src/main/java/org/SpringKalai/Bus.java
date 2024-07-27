package org.SpringKalai;

public class Bus {

    private int busNo;
    private boolean ac;
    private int capacity;

    Bus(int busNo, boolean ac, int capacity) {  //Constuctor parameterized
        this.busNo = busNo;
        this.capacity = capacity;
        this.ac = ac;
    }
    public boolean isAc() {
        return ac;
    }

    public void setAc(boolean ac) {
        this.ac = ac;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getBusNo() {
        return busNo;
    }

    public void setBusNo(int busNo) {
        this.busNo = busNo;
    }
    public void displayBusInfo(){
        System.out.println("BusNo: "+busNo+" Ac "+ac+" Total Capacity: "+capacity );
    }
} 