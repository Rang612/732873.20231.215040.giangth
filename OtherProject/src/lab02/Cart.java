package lab02;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private hust.soict.dsai.aims.disc.DigitalVideoDisc itemsOrdered[] = new hust.soict.dsai.aims.disc.DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered = 0;

    //Method to add an item to the list
    public void addDigitalVideoDisc(hust.soict.dsai.aims.disc.DigitalVideoDisc disc) {
        if(qtyOrdered <= MAX_NUMBERS_ORDERED) {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The disc with name "+disc.getTitle()+" has been added!");

        }
        else {
            System.out.println("The cart is almost full");
        }
    }
    public void addDigitalVideoDisc(hust.soict.dsai.aims.disc.DigitalVideoDisc[] dvdList){
        for(hust.soict.dsai.aims.disc.DigitalVideoDisc dvd : dvdList){
            if(qtyOrdered <= MAX_NUMBERS_ORDERED) {
                itemsOrdered[qtyOrdered] = dvd;
                qtyOrdered++;
                System.out.println("The disc with name "+dvd.getTitle()+" has been added!");

            }
            else {
                System.out.println("The cart is almost full");
            }
        }


    }

//    public void addDigitalVideoDisc(DigitalVideoDisc ... dvdList){
//        for(DigitalVideoDisc dvd : dvdList){
//            if(qtyOrdered <= MAX_NUMBERS_ORDERED) {
//                itemsOrdered[qtyOrdered] = dvd;
//                qtyOrdered++;
//                System.out.println("The disc with name "+dvd.getTitle()+" has been added!");
//
//            }
//            else {
//                System.out.println("The cart is almost full");
//            }
//        }
//
//    }
//Java là một ngôn ngữ truyền tham trị tuy nhiên có 1 trường hợp đặc biệt trong java cho phép truyền tham chiếu đó là khi mình tham chiếu đến 1 đối tượng
 //trong trường hợp này phương thưc sẽ nhận bản sao của tham chiếu đấy nhưng tham chiếu đó sẽ trỏ đến cùng 1 đối tượng trong bộ nhớ điều này làm thay đổi giá trị bên ngoài phương thức
    
    public void addDigitalVideoDisc(hust.soict.dsai.aims.disc.DigitalVideoDisc dvd1, hust.soict.dsai.aims.disc.DigitalVideoDisc dvd2){
        if(qtyOrdered <= MAX_NUMBERS_ORDERED-2) {
            itemsOrdered[qtyOrdered] = dvd1;
            qtyOrdered++;
            System.out.println("The disc with name "+dvd1.getTitle()+" has been added!");
            itemsOrdered[qtyOrdered] = dvd2;
            qtyOrdered++;
            System.out.println("The disc with name "+dvd2.getTitle()+" has been added!");

        }
        else {
            System.out.println("The cart is almost full");
        }
    }


    //Method which loops through the values of the array and sums the costs of the individual DigitalVideoDiscs
    public float totalCost(){
        float sum = 0;
        for (int i = 0 ; i < qtyOrdered ; i++){
            sum += itemsOrdered[i].getCost();
        }
        return sum;
    }

    //Method to remove the item
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        boolean found = false;
        for (int i=0; i<qtyOrdered; i++) {
            if (itemsOrdered[i] == disc) {
                found = true;
                for (int j=i; j<qtyOrdered-1; j++) {
                    itemsOrdered[j] = itemsOrdered[j+1];
                }
                qtyOrdered--;
                itemsOrdered[qtyOrdered] = null;
                System.out.println("The disc \"" + disc.getTitle() + "\" has been removed.");
            }
        }

        if (!found) {
            System.out.println("Couldn't find the specified disc.");
        }
    }
}
