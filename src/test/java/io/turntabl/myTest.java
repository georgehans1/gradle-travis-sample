package io.turntabl;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.List;

public class myTest {
    @Test
    public void ClientNameTest(){
        AccountManager manager1 = new AccountManager("Manager George");
        Corporate client1 = new Corporate("Hanson",6536363,Level.Platinum,manager1);
        Private client2 = new Private("Kwame",47474,Level.Gold);
        Corporate client3 = new Corporate("Kofi",1234,Level.Premium,manager1);
        List<Client> clients =List.of(client1,client2,client3);
        assertEquals("Test passed","Manager George",client1.getClientName());
    }

}
