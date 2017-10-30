import org.junit.*;
import static org.junit.Assert.assertEquals;

public class BusStopTest{

  BusStop busStop;
  Bus bus;
  Person passenger;

  @Before
  public void before(){
    this.busStop = new BusStop("Waverley Station");
    this.bus = new Bus(22);
    this.passenger = new Person();
  }

  @Test
  public void hasName(){
    String name = busStop.getName();
    assertEquals("Waverley Station", name);
  }

  @Test
  public void QueueStartsEmpty(){
    assertEquals(0, busStop.passengersQueueCount());
  }
  // 
  // @Test
  // public void canAddPassengersToQueue(){
  //   busStop.addPassengerToQueue(passenger);
  //   assertEquals(1, busStop.passengersQueueCount());
  // }

}
