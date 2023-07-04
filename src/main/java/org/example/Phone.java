package org.example;

public class Phone {
    private String number;
    private String model;
    private double weight;

    public Phone (String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone (String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone (){
    }

    public void receiveCall(String callName) {
        System.out.println("Звонит " + callName);
    }

    public String getNumber() {
        return number;
    }

    public void receiveCall(String callName, String callNumber) {
        System.out.println("Звонит " + callName + ": " + callNumber);
    }

    public void sendMessage(String[] phoneNumbers) {
        for (String number: phoneNumbers) {
            System.out.println(number);
        }
    }

    public String toString(){
        return "Phone: " + "number = " + number + '\'' + ", model = " + model + '\'' + ", weight = " + weight;
    }
}
