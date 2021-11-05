package io.turntabl;

public class PrivateClient extends Client{

    public PrivateClient(String name, int ID, Level level) {
        super(name, ID, level);
    }

    @Override
    public String getClientName() {
        return getName();
    }


}
