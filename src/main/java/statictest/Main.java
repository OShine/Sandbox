package statictest;

public class Main {

    public static void main (String args[]){

        System.out.println("Изначальное значение переменной в родителе: " + ParentClass.number);

        ParentClass firstObject = new ParentClass();
        ParentClass secondObject = new ParentClass();
        ParentClass thirdObject = new ParentClass();
        ParentClass fourthObject = new ParentClass();
        ParentClass fifthObject = new ParentClass();

        System.out.println("Изменили значение переменной в первом объекте");
        firstObject.setStaticNumber(10);
        System.out.println("Значение переменной в первом объекте: " + firstObject.getStaticNumber());
        System.out.println("Значение переменной во втором объекте: " + secondObject.getStaticNumber());
        System.out.println("Значение переменной в третьем объекте: " + thirdObject.getStaticNumber());
        System.out.println("Значение переменной в четвером объекте: " + fourthObject.getStaticNumber());
        System.out.println("Значение переменной в пятом объекте: " + fifthObject.getStaticNumber());

        System.out.println("Изменили значение переменной во втором объекте");
        secondObject.setStaticNumber(20);
        System.out.println("Значение переменной в первом объекте: " + firstObject.getStaticNumber());
        System.out.println("Значение переменной во втором объекте: " + secondObject.getStaticNumber());
        System.out.println("Значение переменной в третьем объекте: " + thirdObject.getStaticNumber());
        System.out.println("Значение переменной в четвером объекте: " + fourthObject.getStaticNumber());
        System.out.println("Значение переменной в пятом объекте: " + fifthObject.getStaticNumber());

        System.out.println("Изменили значение переменной в третьем объекте");
        thirdObject.setStaticNumber(30);
        System.out.println("Значение переменной в первом объекте: " + firstObject.getStaticNumber());
        System.out.println("Значение переменной во втором объекте: " + secondObject.getStaticNumber());
        System.out.println("Значение переменной в третьем объекте: " + thirdObject.getStaticNumber());
        System.out.println("Значение переменной в четвером объекте: " + fourthObject.getStaticNumber());
        System.out.println("Значение переменной в пятом объекте: " + fifthObject.getStaticNumber());

        System.out.println("Изменили значение переменной в четвером объекте");
        fourthObject.setStaticNumber(40);
        System.out.println("Значение переменной в первом объекте: " + firstObject.getStaticNumber());
        System.out.println("Значение переменной во втором объекте: " + secondObject.getStaticNumber());
        System.out.println("Значение переменной в третьем объекте: " + thirdObject.getStaticNumber());
        System.out.println("Значение переменной в четвером объекте: " + fourthObject.getStaticNumber());
        System.out.println("Значение переменной в пятом объекте: " + fifthObject.getStaticNumber());

        System.out.println("Изменили значение переменной в пятом объекте");
        fourthObject.setStaticNumber(50);
        System.out.println("Значение переменной в первом объекте: " + firstObject.getStaticNumber());
        System.out.println("Значение переменной во втором объекте: " + secondObject.getStaticNumber());
        System.out.println("Значение переменной в третьем объекте: " + thirdObject.getStaticNumber());
        System.out.println("Значение переменной в четвером объекте: " + fourthObject.getStaticNumber());
        System.out.println("Значение переменной в пятом объекте: " + fifthObject.getStaticNumber());

    }
}
