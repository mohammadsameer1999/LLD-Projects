package org.example.withBuilder;

public class TestPizzaWithBuilder {
    public static void main(String[] args) {
        PizzaWithBuilder builder = new PizzaWithBuilder.Builder("Large")
                .cheese(true)
                .bacon(true)
                .pepperoni(false).builder();
        System.out.println(builder);
    }
}
