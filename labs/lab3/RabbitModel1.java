package lab3;

/**
 * A RabbitModel is used to simulate the growth
 * of a population of rabbits. 
 */
public class RabbitModel1
{
  int currentPop;
  
  /**
   * Constructs a new RabbitModel.
   */
  public RabbitModel1()
  {
	  currentPop = 0;
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
    // TODO
		switch (currentPop) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
			currentPop += 1;
			break;
		case 5:
			reset();
		}
	}
  
  /**
   * Sets or resets the state of the model to the 
   * initial conditions.
   */
  public void reset()
  {
    // TODO
	  currentPop = 0;
	  
  }
}