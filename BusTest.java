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

  @Test
  public void canAddPassenger(){
    bus.addPassenger(passenger);
    assertEquals(1, bus.passengerCount());
  }

  @Test
  public void busIsFull(){
    for(int i = 0; i < 11; i++){
      bus.addPassenger(passenger);
    }
    assertEquals(true, bus.isBusFull());
  }

}
