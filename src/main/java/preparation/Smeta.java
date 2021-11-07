package preparation;

import java.util.Objects;

public class Smeta {

    private String nomerSmeta;

    private String nameSmeta;

    private String codePricing;

    private String namePricing;

    private double laborHours;

    public String getNomerSmeta() {
        return nomerSmeta;
    }

    public void setNomerSmeta(String nomerSmeta) {
        this.nomerSmeta = nomerSmeta;
    }

    public String getNameSmeta() {
        return nameSmeta;
    }

    public void setNameSmeta(String nameSmeta) {
        this.nameSmeta = nameSmeta;
    }

    public String getCodePricing() {
        return codePricing;
    }

    public void setCodePricing(String codePricing) {
        this.codePricing = codePricing;
    }

    public String getNamePricing() {
        return namePricing;
    }

    public void setNamePricing(String namePricing) {
        this.namePricing = namePricing;
    }

    public double getLaborHours() {
        return laborHours;
    }

    public void setLaborHours(double laborHours) {
        this.laborHours = laborHours;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Smeta smeta = (Smeta) o;
        return codePricing.equals(smeta.codePricing);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codePricing);
    }

    @Override
    public String toString() {
        return "Smeta{" +
                "nomerSmeta='" + nomerSmeta + '\'' +
                ", nameSmeta='" + nameSmeta + '\'' +
                ", codePricing='" + codePricing + '\'' +
                ", namePricing='" + namePricing + '\'' +
                ", laborHours=" + laborHours +
                '}';
    }

    public Smeta(String nomerSmeta, String nameSmeta, String codePricing, String namePricing, double laborHours) {
        this.nomerSmeta = nomerSmeta;
        this.nameSmeta = nameSmeta;
        this.codePricing = codePricing;
        this.namePricing = namePricing;
        this.laborHours = laborHours;
    }

}
