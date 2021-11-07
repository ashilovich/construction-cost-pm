package preparation;

public class EmplAndSmeta <Employees,Smeta>{

    private  Employees field1;
    private  Smeta field2;



    public EmplAndSmeta(Employees field1, Smeta field2) {
        this.field1 = field1;
        this.field2 = field2;
    }

    public Employees getField1() {
        return field1;
    }


    public void setField1(Employees field1) {
        this.field1 = field1;
    }

    public Smeta getField2() {
        return field2;
    }

    public void setField2(Smeta field2) {
        this.field2 = field2;
    }

    @Override
    public String toString() {
        return "EmplAndSmeta{" +
                "field1=" + field1 +
                ", field2=" + field2 +
                '}';
    }


}
