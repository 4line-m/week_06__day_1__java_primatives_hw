class Bus{
  private int number;
  private Person[] passengers;

  public Bus(int number){
    this.number = number;
    this.passengers = new Person[10];
  }

  public int getNumber(){
    return this.number;
  }

  public int passengerCount(){
    int count = 0;
    for(Person passenger : passengers){
      if(passenger != null){
        count++;
      }
    }
    return count;
  }

  public void addPassenger(Person passenger){
    if(isBusFull()){
      return;
    }
    int passengerCount = passengerCount(); //if you didn't add this and add o in belly below like belly[0] it is not dynamic
    passengers[passengerCount] = passenger;
  }

  public boolean isBusFull(){
    return passengerCount() == passengers.length;
  }

}
