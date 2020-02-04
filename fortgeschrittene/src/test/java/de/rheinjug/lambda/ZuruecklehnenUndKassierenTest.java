package de.rheinjug.lambda;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Random;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

class ZuruecklehnenUndKassierenTest {

  @Test
  void test_lotto(){
    ZuruecklehnenUndKassieren lotto = new ZuruecklehnenUndKassieren();

    Random r = Mockito.mock(Random.class);
    when(r.nextInt(49)).thenReturn(0,1,2,3,0,2,5,6,7,8);

    // 6 unterschiedliche Zahlen werden gezogen: 1,2,3,4,6,7,8
    lotto.ziehen(r);

    Printer printer = mock(Printer.class);
    when(printer.print(any())).thenReturn(1);

    lotto.print(printer);
    verify(printer, times(6)).print(any());

  }



}