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
		Autos.put("Cybertruck", "Tesla");
		Autos.put("Semi", "Tesla");
		
		System.out.println(Autos);
	}

}
