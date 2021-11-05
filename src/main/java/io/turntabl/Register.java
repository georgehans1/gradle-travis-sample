package io.turntabl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Register {
    private List<Client> clients = new ArrayList<>();

    public Register(List<Client> clients) {
        this.clients = clients;
    }


    public List<Client> getClientByLevel(Level level){
        List<Client> clientList = clients.stream()
                .filter(x->x.getLevel() == level)
                .collect(Collectors.toList());
        return clientList;
    }

    public Optional getClientNameByID(int ID){
       Optional<Client> client = clients.stream()
                .filter(x->x.getID() == ID)
                .findAny();
        return client.stream().map(Client::getClientName).findAny();
    }

    public String getClientCountByLevel(){
        long goldLevel = clients.stream().filter(x->x.getLevel() == Level.Gold).count();
        long platinumLevel = clients.stream().filter(x->x.getLevel() == Level.Platinum).count();
        long premiumLevel = clients.stream().filter(x->x.getLevel() == Level.Premium).count();
        return "Gold level : " + goldLevel + "\n" +
                "Platinum level : " + platinumLevel + "\n" +
                "Premium level : " + premiumLevel;
    }

//    public String getClientNameByTheirID(int ID){
//        List<Client> client = clients.stream()
//                .filter(x->x.getID() == ID)
//                .collect(Collectors.toList());
//        String name = client.stream().map(Client::getClientName).collect(Collectors.joining());
//        return name;
//    }

    @Override
    public String toString() {
        return "Register{" +
                "clients=" + clients +
                '}';
    }

}
