package ro.siit.session10.anonymous;

public class Component {
    private Listener listener;
    public void addLister(Listener listener){
        this.listener = listener;
    }

    public void trigger(){
        this.listener.onEvent();
    }
}
