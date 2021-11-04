package io.turntabl;

public abstract class Client {
    private String name;
    private int ID;
    private Level level;

    public Client(String name, int ID, Level level) {
        this.name = name;
        this.ID = ID;
        this.level = level;
    }

    public String getName(){
        return name;
    };

    public int getID() {
        return ID;
    }

    public Level getLevel() {
        return level;
    }

    public abstract String getClientName();

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", ID=" + ID +
                ", level=" + level +
                '}';
    }
}
