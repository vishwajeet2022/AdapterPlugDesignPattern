package org.example;

public class IndianEuroPlug implements EuroPlug{
    IndianPlug indianPlug;

    IndianEuroPlug(IndianPlug indianPlug){
        this.indianPlug = indianPlug;
    }

    @Override
    public void plugin() {
        indianPlug.insert();
    }
}
