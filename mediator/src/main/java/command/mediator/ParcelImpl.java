package command.mediator;

import java.util.List;
import java.util.ArrayList;

public class ParcelImpl implements Parcel {

    private List<User> users;

    public ParcelImpl() {
        this.users = new ArrayList<>();
    }

    @Override
    public void addUser(User user) {
        this.users.add(user);
    }

    @Override
    public void sendParcel(String par, User user) {
        for (User u : this.users) {
            //message should not be received by the user sending it
            if (u != user) {
                u.receive(par);
            }
        }
    }
    
    @Override
    public void sendTo(String par, User user){
        for(User u : this.users){
            if(u == user){
                u.receive(par);
            }
        }
    }

}

