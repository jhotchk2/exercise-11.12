import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class Exercise11_12Test {

  @SuppressWarnings("static-access")
  @Test
  void testSum() {
    Exercise11_12 test = new Exercise11_12();
    var list = new ArrayList<Double>();
    list.add(1.0);
    list.add(1.0);
    list.add(1.0);
    list.add(1.0);
    list.add(1.0);
    assertEquals(5, test.sum(list));
  }

}
