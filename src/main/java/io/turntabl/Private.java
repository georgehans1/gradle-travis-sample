package io.turntabl;

public class Private extends Client{

    public Private(String name, int ID, Level level) {
        super(name, ID, level);
    }

    @Override
    public String getClientName() {
        return getName();
    }


}
