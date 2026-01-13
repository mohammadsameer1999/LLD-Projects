package org.example.withBuilder;

 class PizzaWithBuilder {
     private String size;

     private boolean cheese;

     private boolean pepperoni;

     private boolean bacon;

     @Override
     public String toString() {
         return "PizzaWithBuilder{" +
                 "size='" + size + '\'' +
                 ", cheese=" + cheese +
                 ", pepperoni=" + pepperoni +
                 ", bacon=" + bacon +
                 '}';
     }

     public PizzaWithBuilder(Builder builder) {
         this.size = builder.size;
         this.cheese = builder.cheese;
         this.pepperoni =builder. pepperoni;
         this.bacon =builder. bacon;
     }


     public static class Builder {
         private String size;

         private boolean cheese;

         private boolean pepperoni;

         private boolean bacon;

         Builder(String size) {
             this.size = size;
         }

         public Builder cheese (boolean value) {
             this.cheese = value;
             return this;
         }

         public Builder pepperoni(boolean value) {
             this.pepperoni = value;
             return  this;
         }

         public Builder bacon(boolean value) {
             this.bacon = value;
             return this;
         }
         public PizzaWithBuilder builder() {
             return new PizzaWithBuilder(this);
         }
     }
 }