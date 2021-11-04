package io.turntabl;

public class Corporate extends Client{
    private AccountManager manager;


    public Corporate(String name, int ID, Level level,AccountManager manager) {
        super(name, ID, level);
        this.manager = manager;
    }


    @Override
    public String getClientName() {
        return manager.getName();
    }
}
