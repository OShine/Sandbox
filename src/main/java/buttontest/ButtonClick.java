package buttontest;

public interface ButtonClick {

    default void Click(RadioButton button) {
        System.out.println("RadioButton was clicked");
    }

    default void Click(SimpleButton button) {
        System.out.println("SimpleButton was clicked");
    }

    default void Click(DropDownButton button) {
        System.out.println("DropDownButton was clicked");
    }

    default void Click(CheckboxButton button) {
        System.out.println("CheckboxButton was clicked");
    }
}

