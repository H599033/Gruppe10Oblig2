package no.hvl.dat110.iotsystem;

import no.hvl.dat110.broker.ClientSession;
import no.hvl.dat110.client.Client;
import no.hvl.dat110.common.TODO;
import no.hvl.dat110.messagetransport.Connection;

public class TemperatureDevice {

	private static final int COUNT = 10;
	private Connection connection;
	public static void main(String[] args) {

		// simulated / virtual temperature sensor
		TemperatureSensor sn = new TemperatureSensor();


		Client client = new Client("sensor",Common.BROKERHOST,Common.BROKERPORT);
		client.connect();
		for (int i =0;i<COUNT;i++){
			String temp = Integer.toString(sn.read());
			client.publish("Temperatur",temp);
			try{
				Thread.sleep(2000);
			}catch (Exception e){

			}

		}
		client.disconnect();
		// create a client object and use it to

		// - connect to the broker - user "sensor" as the user name
		// - publish the temperature(s)
		// - disconnect from the broker



		System.out.println("Temperature device stopping ... ");

	}
}
