package hust.soict.dsai.aims.cart;//Tran Huong Giang 20215040
//Create the hust.soict.dsai.aims.cart.Cart class to work with DigitalVideoDisc
import java.util.Scanner;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;
public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered = 0;

    //Method to add an item to the list
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if(qtyOrdered <= MAX_NUMBERS_ORDERED) {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The disc with name "+disc.getTitle()+" has been added!");

        }
        else {
            System.out.println("The cart is almost full");
        }
    }
    public void addDigitalVideoDisc(DigitalVideoDisc [] dvdList){
        for(DigitalVideoDisc dvd : dvdList){
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
// Nếu tạo thêm 1 phương thức sử dụng truyển tham số với số lượng tùy ý và có tồn tại phương thức truyền tham số vào là 1 mảng sẽ xảy ra lỗi
// vì phương thức đó cũng được định nghĩa tham số là mảng. Vì vậy 2 phương thức sẽ có cùng chưx kí từ đó vi phạm quy tắc xếp chồng phương thức.

    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2){
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
    //In gio hang
    public void print() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        for(int i = 0; i < qtyOrdered; i++) {
            int j = i+1;
            System.out.println(j + ". " +itemsOrdered[i].toString());
        }
        System.out.println("Total cost: " + totalCost());
        System.out.println("***************************************************");

    }
    //Tim kiem dvd theo id
    public void searchDvdId() {
        int id, cnt = 0;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter ID: ");
        id = keyboard.nextInt();
        for (int i = 0; i < qtyOrdered; i++) {
            if (id == itemsOrdered[i].getId()) {
                System.out.println(itemsOrdered[i].toString());
                cnt++;
                break;
            }
        }
        if(cnt == 0) System.out.println("This ID doesn't exist!");
    }

    //Tim kiem dvd theo tieu de
    public void searchDvdTitle() {
        String title;
        int cnt = 0;
        Scanner keyboard = new Scanner(System.in);
        String checkString = "1";
        System.out.println("Input title: ");
        title = keyboard.nextLine();
        for(int i = 0; i < qtyOrdered; i++) {
            if(itemsOrdered[i].isMatch(title) == true) {
                System.out.println(itemsOrdered[i].toString());
                cnt ++;
                break;
            }
        }
        if(cnt == 0) {
            System.out.println("This Title doesn't exist!");
        }
    }
}
