package lab02;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Aims {
    public static void main(String[] args) {
        //TODO Auto-generated method stub

        // Create new hust.soict.dsai.aims.cart.Cart
        hust.soict.dsai.aims.cart.Cart anOrder = new Cart();

        //Add dvd1
        hust.soict.dsai.aims.disc.DigitalVideoDisc dvd1 = new hust.soict.dsai.aims.disc.DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
//        anOrder.addDigitalVideoDisc(dvd1);

        //Add dvd2
        hust.soict.dsai.aims.disc.DigitalVideoDisc dvd2 = new hust.soict.dsai.aims.disc.DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        anOrder.addDigitalVideoDisc(dvd2);

        //Add dvd3
        hust.soict.dsai.aims.disc.DigitalVideoDisc dvd3 = new hust.soict.dsai.aims.disc.DigitalVideoDisc("Aladin", "Animation", 18.99f);
//        anOrder.addDigitalVideoDisc(dvd3);

        //Add dvd4, dvd5, dvd6
        hust.soict.dsai.aims.disc.DigitalVideoDisc dvd4 = new hust.soict.dsai.aims.disc.DigitalVideoDisc("Aladin", "Animation", 18.99f);
        hust.soict.dsai.aims.disc.DigitalVideoDisc dvd5 = new hust.soict.dsai.aims.disc.DigitalVideoDisc("Aladin", "Animation", 18.99f);
        hust.soict.dsai.aims.disc.DigitalVideoDisc dvd6 = new hust.soict.dsai.aims.disc.DigitalVideoDisc("Aladin", "Animation", 18.99f);
        DigitalVideoDisc[] dvdList = {dvd4, dvd5, dvd6};
        anOrder.addDigitalVideoDisc(dvdList);
        anOrder.addDigitalVideoDisc(dvd2, dvd3);
        //Caculate the cost
        System.out.println("Total Cost is : ");
        System.out.println(anOrder.totalCost());
    }
}

