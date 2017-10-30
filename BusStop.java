class BusStop {
  private String name;
  private Person[] passengersQueue;

  public BusStop(String name){
    this.name = name;
    this.passengersQueue = new Person[5];
  }

  public String getName(){
    return this.name;
  }
}
