package main.java.com.mkudriavtsev.patterns.behavioral.visitor;

public class InsuranceRunner {
    public static void main(String[] args) {
        SuccessfulInsuranceAgent successfulInsuranceAgent = new SuccessfulInsuranceAgent();
        BadInsuranceAgent badInsuranceAgent = new BadInsuranceAgent();
        Bank bank = new Bank();
        Factory factory = new Factory();
        System.out.println("Bad Insurance Agent Job");
        bank.offer(badInsuranceAgent);
        factory.offer(badInsuranceAgent);

        System.out.println("\n--------------------------------\n");
        bank.offer(successfulInsuranceAgent);
        factory.offer(successfulInsuranceAgent);

    }
}
