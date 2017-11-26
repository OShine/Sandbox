package statictest;

public class ParentClass {

    public static int number = 0;

    public int setStaticNumber(int number) {
        this.number = number;
        return number;
    }

    public int getStaticNumber() {
        return number;
    }

    public void toDoSmthing() {
        System.out.println("Метод который делает что-то");
    }
}
