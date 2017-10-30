class BusStop {
  private String name;
  private Person[] passengersQueue;

  public BusStop(String name){
    this.name = name;
    this.passengersQueue = new Person[5];
    //passed 5 but maybe 'capacity' would be best?
  }

  public String getName(){
    return this.name;
  }

  public int passengersQueueCount(){
    int count = 0;
    for(Person passenger : passengersQueue){
      if(passenger != null){
        count++;
      }
    }
    return count;
  }

 //  public void addPassengerToQueue(Person passenger){
 //   int passengersQueueCount = passengersQueueCount();
 //   passengersQueue[passengersQueueCount] =  passenger;
 // }

}
