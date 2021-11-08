package preparation;

public class MethodsFarm {

    @Override
    public String toString() {
        return "MethodsFarm{" +
                "factSalary=" + factSalary +
                '}';
    }

    public double getFactSalary() {
        return factSalary;
    }

    double factSalary;

    public double costSalary (Employees e, Smeta sm){
       double a = e.getСostPerHour();
       double b = sm.getLaborHours();
        factSalary = a*b;
       return factSalary;
    }
}
