import org.junit.*;
import static org.junit.Assert.assertEquals;

public class BusTest{

  Bus bus;
  Person passenger;

  @Before
  public void before(){
    this.bus = new Bus();
    this.passenger = new Person();
  }

  @Test
  public void busStartsEmpty(){
    assertEquals(0, bus.passengerCount());
  }

}
