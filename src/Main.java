import com.company.Computer;
import model.peripheral.Peripheral;
import model.peripheral.peripherals.Mouse;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Computer computer = new Computer();


        System.out.println(computer.getGeneration());

        computer.setGeneration("Pentium 4");
        System.out.println(computer.getGeneration());

        Mouse mouse1 = new Mouse("USB","Mac");

        Peripheral mouse2 = new Mouse("Wireless","CICA",true);

        System.out.println(mouse2.getBrand());
        System.out.println(mouse2.getConnectionComputer());
        System.out.println(((Mouse) mouse2).isHasScrollWeel());
        System.out.println(mouse1.displayDetails());




    }
}
