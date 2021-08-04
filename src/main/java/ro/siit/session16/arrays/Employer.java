package ro.siit.session16.arrays;

public class Employer implements Person{
    private String cnp;

    public Employer(String cnp) {
        this.cnp = cnp;
    }

    @Override
    public String getCNP() {
        return this.cnp;
    }

    @Override
    public String toString() {
        return "Employer{" +
                "cnp='" + cnp + '\'' +
                '}';
    }
}
