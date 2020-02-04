package de.rheinjug.lambda;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.fail;

public class ScopeTest {

  @Test
  void test_anonymousClass() {
    Scope scope = new Scope();
    assertThat(scope.anonymousClass()).isEqualTo("Anonyme Klasse");
  }


  @Test
  @Disabled("TODO")
  void test_lambdaExpression() {
    Scope scope = new Scope();
    // Was gehört hier rein?
    fail("Hier feht eine Assertion");
  }


}
