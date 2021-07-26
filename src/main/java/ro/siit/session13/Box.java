package ro.siit.session13;

public class Box {
    private Object contents ;
    public void putContents(Object contents){
        this.contents = contents;
    }

    public Object getContents(){
        return contents;
    }

    public static void main(String[] args) {
        Box b1 = new Box();
        b1.putContents("Ion");
        String nume = (String)b1.getContents();
        System.out.println(nume);

        Box b2 = new Box();
        b2.putContents(new MyType());
        System.out.println((String)b2.getContents());
    }
}
