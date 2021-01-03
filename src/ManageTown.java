import java.time.LocalDate;
import java.util.ArrayList;

public class ManageTown {
    ArrayList<Town> list = new ArrayList();

    public void addTown(Town town) {
        list.add(town);
    }

    public void displayAll() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public void tesAgeMoreThan80() {
        for (int i = 0; i < list.size(); i++) {
            String birthday = list.get(i).getPeople().getBirthday();
            String birthYear = birthday.substring(6);
            int birthYear1 = Integer.parseInt(birthYear);
            LocalDate time = LocalDate.now();
            int year = time.getYear();
            int age = year - birthYear1;
            if (age >= 80) {
                System.out.println(list.get(i));
                break;
            }
        }
    }
}
