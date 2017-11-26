package buttontest;

public class SimpleButton implements ButtonClick {
    @Override
    public void Click() {
        System.out.println("SimpleButton was clicked");
    }
}
