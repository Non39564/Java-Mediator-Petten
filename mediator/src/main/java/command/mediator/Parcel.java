package command.mediator;
public interface Parcel {
    void addUser(User user);
    public void sendParcel(String par, User user);        
    public void sendTo(String par, User user);
}
