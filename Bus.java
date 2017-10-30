class Bus{
  private Person[] passengers;

  public Bus(){
    this.passengers = new Person[10];
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

}
