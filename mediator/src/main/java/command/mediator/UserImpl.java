package command.mediator;

public class UserImpl extends User {

    public UserImpl(Parcel med, String name) {
        super(med, name);
    }

    @Override
    public void send(String par) {
        System.out.println(this.name + ": Sending Parcel to " + par);
        mediator.sendParcel(par, this);
    }
    
    @Override
    public void sendTo(String par, User user) {
        System.out.println(this.name + ": Sending Parcel to " + par);
        mediator.sendTo(par, user);
    }

    @Override
    public void receive(String par) {
        System.out.println(this.name + ": Received Parcel:" + par);
    }

}
