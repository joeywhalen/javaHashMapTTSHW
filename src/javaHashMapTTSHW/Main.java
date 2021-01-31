package javaHashMapTTSHW;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Create Hash Map for auto vehicles where the model (3) is the Key, the make (Tesla) is the Value
		HashMap<String, String> Autos = new HashMap<String, String>();// create HashMap Object called Autos
		
		Autos.put("3", "Tesla");// add keys (model) and values (make)
		Autos.put("Y", "Tesla");
		Autos.put("S", "Tesla");
		Autos.put("X", "Tesla");
		Autos.put("e-tron", "Audi");
		Autos.put("I-Pace", "Jaguar");
		Autos.put("Leaf", "Nissan");
		Autos.put("Niro EV", "Kia");
		Autos.put("Bolt", "Chevrolet");
		Autos.put("Kona EV", "Hyundai");
		Autos.put("Ioniq EV", "Hyundai");

		Scanner userInput = new Scanner(System.in);
		System.out.println("What model are you looking for today?");// Finding out what auto the customer seeks
		String autoSeek = userInput.nextLine();
		
		if(Autos.containsKey(autoSeek)) {// determine if we have the auto the user seeks
			System.out.printf("Yes, we have the %s.  Our %s section is over here.\n", autoSeek, Autos.get(autoSeek));
		}	else {
			System.out.printf("I'm sorry, but we don't carry the %s.\n", autoSeek);
		
			userInput.close();
			System.exit(0);
		}
		
	}

}
