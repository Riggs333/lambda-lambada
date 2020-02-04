package de.rheinjug.lambda.parallel;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import static java.lang.System.out;
import static java.util.Arrays.asList;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Stream.generate;
import static java.util.stream.Stream.iterate;

public class Generating {


  public static List<Integer> usingGenerate() {
    AtomicInteger counter = new AtomicInteger(1);
    return generate(() -> counter.getAndIncrement())
            .limit(20)
            .map(e -> e + 1)
            .collect(toList());
  }

  public static List<Integer> usingGenerateParallel() {
    AtomicInteger counter = new AtomicInteger(1);
    return generate(() -> counter.getAndIncrement())
            .parallel()
            .limit(20)
            .map(e -> e + 1)
            .collect(toList());
  }


  public static List<Integer> usingIterate() {
    return iterate(1, e -> e + 1)
            .limit(20)
            .map(e -> e + 1)
            .collect(toList());
  }

  public static  List<Integer> usingIterateParallel() {
    return iterate(1, e -> e + 1)
            .parallel()
            .limit(20)
            .map(e -> e + 1)
            .collect(toList());
  }



}
