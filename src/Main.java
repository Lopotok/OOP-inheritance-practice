// Importáljuk a package-ekbe rendezett classokat
import data.Person;
import data.Staff;
import data.Student;

public class Main {
    public static void main(String[] args) {
        // Ezt nyugodtan módosítsd!
        Person person = new Person();
        Staff staff = new Staff("Fulop","Gyongyos", "Suli",123);
        Student student = new Student("Tanulo", "Gyongyos", "Info", 2000, 12);
    }
}
