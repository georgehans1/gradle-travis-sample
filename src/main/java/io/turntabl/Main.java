package io.turntabl;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        AccountManager manager1 = new AccountManager("George");
        Corporate client1 = new Corporate("Hanson",6536363,Level.Platinum,manager1);
        Private client2 = new Private("Kwame",47474,Level.Gold);
        Corporate client3 = new Corporate("Kofi",1234,Level.Premium,manager1);
        List<Client> clients =List.of(client1,client2,client3);
        System.out.println(client1.getClientName());

        Register register = new Register(clients);
        System.out.println(register.getClientByLevel(Level.Platinum));
        System.out.println(register.getClientNameByID(47474));

        System.out.println(register.getClientCountByLevel());
    }
}
