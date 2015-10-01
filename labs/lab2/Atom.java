package lab2;
/**
 * Model of an atom for use in quality control simulations.
 */
public class Atom {
	/**
	 * number of protons in this atom.
	 */
	private int protons;
	/**
	 * number of neutrons in this atom.
	 */
	private int neutrons;
	/**
	 * number of electrons in this atom.
	 */
	private int electrons;
	/**
	   * Constructs an atom with the given parameters.
	   * @param givenProtons
	   * 	Number of protons for this atom.
	   * @param givenNeutrons
	   * 	Number of neutrons for this atom.
	   * @param givenElectrons
	   * 	Number of electrons for this atom.
	   */
	public Atom(int givenProtons, int givenNeutrons, int givenElectrons) {
		protons = givenProtons;
		neutrons = givenNeutrons;
		electrons = givenElectrons;
	}
	
	/**
	 * Returns the total number of protons plus neutrons.
	 * @return
	 * 		Total number of protons plus neutrons.
	 */
	public int getAtomicMass(){
		return protons + neutrons;
	}
	
	/**
	 * Returns the difference between the number of protons and electrons.
	 * @return
	 * 		Difference between the number of protons and electrons.
	 */
	public int getAtomicCharge() {
		return protons - electrons;
	}
	
	/**
	 * Decreases the number of protons by 2 and the number of neutrons by 2.
	 */
	public void decay() {
		protons -= 2;
		neutrons -= 2;
	}
	
}
