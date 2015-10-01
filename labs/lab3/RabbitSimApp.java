package lab3;

import plotter.SimulationPlotter;

public class RabbitSimApp {

	public static void main(String[] args) {
		SimulationPlotter plot = new SimulationPlotter();
		RabbitModel mrBill = new RabbitModel();
		plot.simulate(mrBill);
	}

}