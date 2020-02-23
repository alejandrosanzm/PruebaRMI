package client;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import server.Interface;

public class Main {

	public static void main(String[] args) {
		Interface calc = null;
		try {
			Registry registry = LocateRegistry.getRegistry("localhost", 5555);
			calc = (Interface) registry.lookup("Calculadora");
		} catch (Exception e) {
			System.out.println("!! Error");
		}

		// Realizando prueba
		try {
			System.out.println("abs(-3.7) = " + calc.abs(-3.7));
			System.out.println("2 + 2.3 = " + calc.sum(2, 2.3));
		} catch (RemoteException e) {
			System.out.println("!! Error en la prueba del servidor");
		}
	}
}
