package main.java.com.mkudriavtsev.patterns.creational.prototype;

public class HumanCloneRunner {
    public static void main(String[] args) {
        Human elonMusk = new Human("Elon Musk", 48, Sex.MALE);
        System.out.println(elonMusk);
        HumanFactory factory = new HumanFactory(elonMusk);
        Human elonMuskClone = factory.cloneHuman();
        System.out.println(elonMuskClone);
    }
}
