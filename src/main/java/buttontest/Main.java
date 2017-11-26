package buttontest;

public class Main {

    public static void main (String args[]){

        SimpleButton simpleButton = new SimpleButton();
        DropDownButton dropDownButton = new DropDownButton();
        CheckboxButton checkboxButton = new CheckboxButton();
        RadioButton radioButton = new RadioButton();

        simpleButton.Click(simpleButton);
        dropDownButton.Click(dropDownButton);
        checkboxButton.Click(checkboxButton);
        radioButton.Click(radioButton);

    }
}
