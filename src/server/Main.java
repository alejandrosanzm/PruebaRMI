package server;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Main {

	public static void main(String[] args) {
		Registry reg = null;
		try {
			reg = LocateRegistry.createRegistry(5555);
		} catch (RemoteException e) {
			System.out.println("!! Error");
		}

		ServerObject serverObject = new ServerObject();
		try {
			reg.rebind("Calculadora", (Interface) UnicastRemoteObject.exportObject(serverObject, 0));
			System.out.println("Servidor iniciado");
		} catch (Exception e) {
			System.out.println("!! Error");
		}
	}
}
