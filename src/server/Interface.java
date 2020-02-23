package server;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Interface extends Remote {

	public double sum(double a, double b) throws RemoteException;

	public double subs(double a, double b) throws RemoteException;

	public double multiply(double a, double b) throws RemoteException;

	public double divide(double a, double b) throws RemoteException;

	public double abs(double a) throws RemoteException;
}
