package io.turntabl;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.List;

public class myTest {
    @Test
    public void ClientNameTest(){
        AccountManager manager1 = new AccountManager("Manager George");
        CorporateClient client1 = new CorporateClient("Hanson",6536363,Level.Platinum,manager1);
        PrivateClient client2 = new PrivateClient("Kwame",47474,Level.Gold);
        CorporateClient client3 = new CorporateClient("Kofi",1234,Level.Premium,manager1);
        List<Client> clients =List.of(client1,client2,client3);
        assertEquals("Test passed","Manager George",client1.getClientName());
    }

}
