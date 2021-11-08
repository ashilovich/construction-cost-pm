package preparation;


import java.util.ArrayList;
import java.util.List;

public class SmetaApp {
    public static void main(String[] args) {

        Employees empl1 = new Employees("E11", "Floor arrangement", 20.00);
        Employees empl2 = new Employees("E11", "Floor arrangement", 20.00);

        Smeta sm1 = new Smeta("№10", "Floor", "E11", "Underfloor preparation", 100.00);
        Smeta sm2 = new Smeta("№20", "Roof", "E12", "Roofing device", 200.00);
        Smeta sm3 = new Smeta("№30", "Finishing coatings", "E15", "Painting the walls", 300.00);

        List<Employees> tabl1 = new ArrayList<>();


        tabl1.add(0, empl1);

        //System.out.println(tabl1);

        //System.out.println(empl1.toString());
        EmplAndSmeta emplAndSmeta = new EmplAndSmeta(empl1, sm1);
        EmplAndSmeta emplAndSmeta1 = new EmplAndSmeta(empl1, sm2);

        System.out.println(emplAndSmeta.toString());
        System.out.println("************************");
        double var = empl1.getСostPerHour();
        System.out.println(var);
        System.out.println("************************");
        Class<?> var1 = emplAndSmeta.getField1().getClass();
        System.out.println(var1);
        System.out.println("************************");

        MethodsFarm salFarm = new MethodsFarm();
        salFarm.costSalary(empl1, sm1);
        System.out.println(salFarm.getFactSalary());
        System.out.println("************************");
        List<Smeta> allSmeta = new ArrayList<>();
        allSmeta.getClass();
        System.out.println(allSmeta);
        System.out.println("************************");
        int a = 2;
        for (int i = 0; i < a; i++) {
            System.out.println("10");
        }
        System.out.println("************************");
        int b = Employees.getNumb();
        System.out.println(b);


    }

}
