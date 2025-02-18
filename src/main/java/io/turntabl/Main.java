package io.turntabl;


import java.util.List;

public class Main {
    public static void main(String[] args) {
        AccountManager manager1 = new AccountManager("George");
        CorporateClient client1 = new CorporateClient("Hanson",6536363,Level.Platinum,manager1);
        PrivateClient client2 = new PrivateClient("Kwame",47474,Level.Gold);
        CorporateClient client3 = new CorporateClient("Kofi",1234,Level.Premium,manager1);
        List<Client> clients =List.of(client1,client2,client3);
        System.out.println(client1.getClientName());

        Register register = new Register(clients);
        System.out.println(register.getClientByLevel(Level.Platinum));
        System.out.println(register.getClientNameByID(47474));

        System.out.println(register.getClientCountByLevel());
    }
}
