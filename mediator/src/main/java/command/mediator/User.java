package command.mediator;

public abstract class User {

    protected Parcel mediator;
    protected String name;

    public User(Parcel med, String name) {
        this.mediator = med;
        this.name = name;
    }

    public abstract void send(String par);
    public abstract void sendTo(String par, User user);
    public abstract void receive(String par);
}

