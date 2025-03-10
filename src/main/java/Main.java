import com.workintech.cylinder.Circle;
import com.workintech.cylinder.Cylinder;
import com.workintech.developers.HRManager;
import com.workintech.developers.JuniorDeveloper;
import com.workintech.developers.MidDeveloper;
import com.workintech.developers.SeniorDeveloper;
import com.workintech.pool.Cuboid;
import com.workintech.pool.Rectangle;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(3.75);
        System.out.println("circle.radius= " + circle.getRadius());
        System.out.println("circle.area= " + circle.getArea());

        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println("cylinder.radius= " + cylinder.getRadius());
        System.out.println("cylinder.height= " + cylinder.getHeight());
        System.out.println("cylinder.area= " + cylinder.getArea());
        System.out.println("cylinder.volume= " + cylinder.getVolume());

        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("rectangle.width= " + rectangle.getWidth());
        System.out.println("rectangle.length= " + rectangle.getLength());
        System.out.println("rectangle.area= " + rectangle.getArea());

        Cuboid cuboid = new Cuboid(5, 10, 5);
        System.out.println("cuboid.width= " + cuboid.getWidth());
        System.out.println("cuboid.length= " + cuboid.getLength());
        System.out.println("cuboid.area= " + cuboid.getArea());
        System.out.println("cuboid.height= " + cuboid.getHeight());
        System.out.println("cuboid.volume= " + cuboid.getVolume());

        HRManager manager = new HRManager(1, "Alice", 10000, 2, 2, 2);

        JuniorDeveloper junior1 = new JuniorDeveloper(2, "Bob", 5000);
        JuniorDeveloper junior2 = new JuniorDeveloper(3, "Charlie", 5500);
        MidDeveloper mid1 = new MidDeveloper(4, "Dave", 7000);
        MidDeveloper mid2 = new MidDeveloper(5, "Eve", 7500);
        SeniorDeveloper senior1 = new SeniorDeveloper(6, "Frank", 10000);
        SeniorDeveloper senior2 = new SeniorDeveloper(7, "Grace", 10500);

        manager.addEmployee(junior1);
        manager.addEmployee(junior2);
        manager.addEmployee(mid1);
        manager.addEmployee(mid2);
        manager.addEmployee(senior1);
        manager.addEmployee(senior2);

        junior1.work();
        mid1.work();
        senior1.work();
        manager.work();
    }
}