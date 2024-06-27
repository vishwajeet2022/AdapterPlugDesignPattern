package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        IndianPlug indianPlug=new IndianPlug();
        EuroPlug plug =new IndianEuroPlug(indianPlug);
        plug.plugin();
    }
}