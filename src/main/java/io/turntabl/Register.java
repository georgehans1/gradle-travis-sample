package io.turntabl;

import java.util.ArrayList;
import java.util.List;

public class Register {
    private List<Client> clients = new ArrayList<>();

    public Register(List<Client> clients) {
        this.clients = clients;
    }

    @Override
    public String toString() {
        return "Register{" +
                "clients=" + clients +
                '}';
    }
}
