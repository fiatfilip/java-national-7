package ro.siit.session10.anonymous;

public class Main {
    public static void main(String[] args) {
        Component c1 = new Component();
        c1.addLister(new Listener() {
            @Override
            public void onEvent() {
                System.out.println("Event on c1");
            }
        });

        Component c2 = new Component();
        c2.addLister(new Listener() {
            @Override
            public void onEvent() {
                System.out.println("Event on c2");
            }
        });

        c1.trigger();
        c2.trigger();
    }
}
