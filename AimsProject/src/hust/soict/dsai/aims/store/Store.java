package hust.soict.dsai.aims.store;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;
public class Store {
    public static final int MAX = 200;
    private DigitalVideoDisc itemsInStore[] = new DigitalVideoDisc[MAX];
    private int qtyInStore = 0;

    public void removeDvd(DigitalVideoDisc disc) {
        boolean found = false;
        for (int i = 0; i < qtyInStore; i++) {
            if (itemsInStore[i] == disc) {
                found = true;
                for (int j = i; j < qtyInStore - 1; j++) {
                    itemsInStore[j] = itemsInStore[j + 1];
                }
                qtyInStore--;
                itemsInStore[qtyInStore] = null;
                System.out.println("The disc \"" + disc.getTitle() + "\" has been removed.");
            }
        }
    }
        public void addDvd(DigitalVideoDisc disc){
            if (qtyInStore <= MAX) {
                itemsInStore[qtyInStore] = disc;
                qtyInStore++;
                System.out.println("The disc with name " + disc.getTitle() + " has been added!");

            } else {
                System.out.println("The cart is almost full");
            }
        }

}
