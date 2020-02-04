package de.rheinjug.lambda;

import java.util.function.Supplier;

public class Scope {

  public String v = "Klasse";

  public String anonymousClass() {
    Supplier<String> supplier = new Supplier<>() {

      private String v = "Anonyme Klasse";

      @Override
      public String get() {
        return this.v;
      }
    };
    return supplier.get();
  }

  public String lambdaExpression() {
    Supplier<String> supplier = () -> {
      String v = "Lambda";
      return this.v;
    };
    return supplier.get();
  }


}
