package main.java.com.mkudriavtsev.patterns.behavioral.iterator;

public class SuperMarketRunner {
    public static void main(String[] args) {
        String [] goods = {"Potato", "Tomato", "Cucumber", "Onion"};
        SuperMarket superMarket = new SuperMarket("VegiMarket", goods);
        Iterator iterator = superMarket.getIterator();
        System.out.println("Supermarket " + superMarket.getName());
        System.out.println("Goods: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }

}
