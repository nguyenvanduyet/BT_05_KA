import java.util.Scanner;

public class TestMain {
    static Scanner sc = new Scanner(System.in);
    static ManageTown manageTown = new ManageTown();

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. thêm hộ dân");
            System.out.println("2. hiển thị các hộ dân");
            System.out.println("3. hiện thị hộ dân có người từ 80 tuổi trở lên");
            System.out.println("0. thoát chương trình");
            System.out.println("nhập biến choice");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("nhập số hộ dân");
                    int number=Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < number; i++) {
                        addNew();
                    }
                    break;
                case 2:
                    manageTown.displayAll();
                    break;
                case 3:
                    manageTown.tesAgeMoreThan80();
                    break;
                case 0:
                    System.exit(0);
                    break;
            }
        } while (choice != 0);
    }
    public static void addNew(){
        Scanner sc1=new Scanner(System.in);
        System.out.println("nhập tên");
        String name =sc.nextLine();
        String birthday="";
        do {
            System.out.println("nhập ngày sinh dd/mm/yyyy");
            birthday=sc1.nextLine();
        }while (birthday.length()!=10);

        System.out.println("nhập nghề nghiệp");
        String job=sc.nextLine();
        System.out.println("nhập số người trong hộ");
        int numberOfMember=Integer.parseInt(sc1.nextLine());
        System.out.println("nhập số nhà");
        int homeNumber=Integer.parseInt(sc.nextLine());
        People people =new People(name,birthday,job);
        Town town =new Town(people,numberOfMember,homeNumber);
        manageTown.addTown(town);
    }
}
