package hust.soict.dsai.test.disc;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class TestPassingParameter {
    public static void main(String[] args){
        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");
        swap1(jungleDVD, cinderellaDVD);
        System.out.println("jungle dvd title: " + jungleDVD.getTitle());
        System.out.println("cinderella dvd title: " + cinderellaDVD.getTitle());

         changeTitle(jungleDVD, cinderellaDVD.getTitle());
        System.out.println("jungle dvd title: " + jungleDVD.getTitle());
    }


    public static void swap(Object o1, Object o2){
        Object tmp = o1;
        o1 = o2;
        o2 = tmp;
    }

    public static void changeTitle(DigitalVideoDisc dvd, String title){
        String oldTitle = dvd.getTitle();
        dvd.setTitle(title);
        dvd = new DigitalVideoDisc(oldTitle);
    }
// swap(jungleDVD, cinderellaDVD) không thay đổi tiêu đề của hai đối tượng bởi trong phương thức này khi gọi phương thức này thì sẽ tạo ra 2 bản sao của 2 dổi tượng và chỉ thực hiện swap trên hai bản sao này và thực hiện bên trong phương thức nà cho nên title của 2 phương thức này không bị ảnh hưởng
// changeTile làm thay đôir tiêu đề vì trong hàm này sử dụng getTile tham chiếu trực tiếp đến title của 2 đối tượng và thay đổi trực tiếp 2 title của chúng với nhau

      public static void swap1(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2)
      {
          String oldTitle1 = dvd1.getTitle();
          String oldTitle2 = dvd2.getTitle();
          dvd1.setTitle(oldTitle2);
          dvd2.setTitle(oldTitle1);
      }
}