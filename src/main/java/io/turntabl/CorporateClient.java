package io.turntabl;

public class CorporateClient extends Client{
    private AccountManager manager;


    public CorporateClient(String name, int ID, Level level, AccountManager manager) {
        super(name, ID, level);
        this.manager = manager;
    }


    @Override
    public String getClientName() {
        return manager.getName();
    }
}
