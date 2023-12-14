public class Person {
	
  /** 
    Instance variables are defined first
    Instance variables should be defined as 'private', meaning their values
      can be accessed only from methods defined inside the class.  If the
      values need to be retrieved or set from outside the class we should
      define "getter" and "setter" methods.  More on that later
  */
  private String PlaneBrand; 		// "male" or "female"
  private int Altitude; 		// height in inches
  private int Storage; 		// weight in pounds
  private int Anger; 	// "brown", "black", etc
  private int Passengers; 		// An integer that represents health
  private int Gas; // An integer that represents energy
  private int PlaneLength;

  /* Methods are defined next */
  public void PlaneLength() {
      Storage = Storage + 2;
      Passengers = Passengers + 2;
      Gas = Gas + 10;
      Anger = Anger - 2;
  }
  
  public void Crash() {
    Passengers = Passengers - 10;
  }

  public void Luggage() {
    Storage = Storage - 1;
  }

  public void Hoursflying () {
    Gas = Gas - 130;
  }

  public void TakingOff() {
    Gas = Gas - 5;
    Altitude = Altitude + 33000;
    
  }

  public void BabyCrying() {
    Anger = Anger + 15;
    Passengers = Passengers - 5;
  }

}
