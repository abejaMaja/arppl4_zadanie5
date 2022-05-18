package pl.sda.arp4.zadanie5;

public class Student5 {
    protected String numerIdx;
    protected String name;
    protected String lastName;
    protected Sex sex ;

    public Student5(String numerIdx, String name, String lastName, Sex sex) {
        this.numerIdx = numerIdx;
        this.name = name;
        this.lastName = lastName;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student5{" +
                "numerIdx='" + numerIdx + '\'' +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", sex=" + sex +
                '}';
    }
}
