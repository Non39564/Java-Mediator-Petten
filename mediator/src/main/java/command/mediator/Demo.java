/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package command.mediator;

/**
 *
 * @author sarawut
 */
public class Demo {
    public static void main(String[] args) {
        Parcel mediator = new ParcelImpl();
        User Non = new UserImpl(mediator, "Non");
        User Tor = new UserImpl(mediator, "Tor");
        User Shop = new UserImpl(mediator, "Shop");
        User J = new UserImpl(mediator, "J");
        mediator.addUser(Non);
        mediator.addUser(Tor);
        mediator.addUser(Shop);
        mediator.addUser(J);

        Non.send("All people");
        System.out.println("");
        Tor.sendTo("Notebook ", Shop);

    }
}
