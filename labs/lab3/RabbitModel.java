package lab3;

/**
 * A RabbitModel is used to simulate the growth
 * of a population of rabbits. 
 */
public class RabbitModel
{
  int currentPop;
  int lastPop;
  int lasterPop;
  
  /**
   * Constructs a new RabbitModel.
   */
  public RabbitModel()
  {
	  currentPop = 0;
	  lastPop = 1;
	  lasterPop = 0;
  }  
 
  /**
   * Returns the current number of rabbits.
   * @return
   *   current rabbit population
   */
  public int getPopulation()
  {
    // TODO - returns a dummy value so code will compile
    return currentPop;
  }
  
  /**
   * Updates the population to simulate the
   * passing of one year.
   */
  public void simulateYear()
  {
	  currentPop = lastPop + lasterPop;
	  lasterPop = lastPop;
	  lastPop = currentPop;
	  System.out.println(currentPop);
  }
  
  /**
   * Sets or resets the state of the model to the 
   * initial conditions.
   */
  public void reset()
  {
    // TODO
	  currentPop = 0;
	  lastPop = 1;
	  lasterPop = 0;
  }
}