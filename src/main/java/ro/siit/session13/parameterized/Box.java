package ro.siit.session13.parameterized;

import ro.siit.session13.MyType;

public class Box<C> {
    private C contents;

    public C getContents() {
        return contents;
    }

    public void putContents(C contents) {
        this.contents = contents;
    }

    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.putContents("Ion");
        System.out.println(stringBox.getContents());

        Box<MyType> myTypeBox = new Box<>();
        // myTypeBox.putContents("Ion");
        myTypeBox.putContents(new MyType());
        MyType contents = myTypeBox.getContents();
    }
}
