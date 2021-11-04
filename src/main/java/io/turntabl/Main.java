package io.turntabl;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        AccountManager manager = new AccountManager("George");
        Corporate client1 = new Corporate("Hanson",6536363,Level.Platinum,manager);
        Private client2 = new Private("Kwame",47474,Level.Gold);
        List<Client> clients =List.of(client1,client2);
        System.out.println(client1.getClientName());

//        Register register = new Register();

    }
}
