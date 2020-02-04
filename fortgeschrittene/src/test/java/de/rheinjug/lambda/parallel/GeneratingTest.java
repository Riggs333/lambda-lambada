package de.rheinjug.lambda.parallel;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class GeneratingTest {

  @Test
  void usingGenerate() {
    assertThat(Generating.usingGenerate())
            .containsExactly(2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21);
  }

  @RepeatedTest(100)
  void usingGenerateParallel() {
    assertThat(Generating.usingGenerateParallel())
            .containsExactly(2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21);
  }

  @Test
  void usingIterate() {
    assertThat(Generating.usingIterate())
            .containsExactly(2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21);
  }

  @RepeatedTest(100)
  void usingIterateParallel() {
    assertThat(Generating.usingIterateParallel())
            .containsExactly(2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21);
  }
}