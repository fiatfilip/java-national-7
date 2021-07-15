package ro.siit.session9.finalUsage;

public final class Dacia extends Car{

    public Dacia(String chassisNumber) {
        super(chassisNumber, "dacia");
    }

    public Dacia(String chassisNumber, int cmc){
        this(chassisNumber);
    }

//    @Override
//    public String getChassisNumber() {
//        System.out.println("Din copil");
//        return super.getChassisNumber();
//    }

    public static void main(String[] args) {
        Dacia dacia = new Dacia("logan123");
        System.out.println(dacia.getChassisNumber());
        Dacia dacia2 = new Dacia("ssssss", 1234);
        System.out.println(dacia2.getChassisNumber());
    }
}
