package org.example;

public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone("99503222121", "iPhone 14", 0.2);
        System.out.println(phone1.toString());
        Phone phone2 = new Phone("98765432113", "Samsung S21");
        System.out.println(phone2.getNumber());

        Phone phone3 = new Phone();
        phone3.receiveCall("VV Putin");
        phone3.receiveCall("VV Putin", "77777777777");
        phone3.sendMessage(new String[]{"843403343241", "457835783404", "675756345534"});
    }

}