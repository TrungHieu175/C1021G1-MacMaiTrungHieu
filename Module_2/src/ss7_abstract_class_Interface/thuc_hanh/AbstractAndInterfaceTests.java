package ss7_abstract_class_Interface.thuc_hanh;
import ss7_abstract_class_Interface.thuc_hanh.animal.Animal;
import ss7_abstract_class_Interface.thuc_hanh.animal.Tiger;
import ss7_abstract_class_Interface.thuc_hanh.animal.Chicken;
public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals){
            System.out.println(animal.makesomenoise());
        }
    }
}
