package preparation;

import java.security.PrivateKey;
import java.util.Objects;

public class Employees {

    private String codeProfession;

    private String profession;

    private double сostPerHour;

    private static int numb;



    public static int getNumb() {
        return numb;
    }

    public Employees(String codeProfession, String profession, double сostPerHour) {
        this.codeProfession = codeProfession;
        this.profession = profession;
        this.сostPerHour = сostPerHour;
        numb++;
    }



    public String getCodeProfession() {
        return codeProfession;
    }

    public String getProfession() {
        return profession;
    }

    public double getСostPerHour() {
        return сostPerHour;
    }

    public void setCodeProfession(String codeProfession) {
        this.codeProfession = codeProfession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public void setСostPerHour(double сostPerHour) {
        this.сostPerHour = сostPerHour;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employees employees = (Employees) o;
        return codeProfession.equals(employees.codeProfession);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codeProfession);
    }

    @Override
    public String toString() {
        return "Employees{" +
                "codeProfession='" + codeProfession + '\'' +
                ", profession='" + profession + '\'' +
                ", сostPerHour=" + сostPerHour +
                '}';
    }


}
