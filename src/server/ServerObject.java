package server;

public class ServerObject implements Interface {

	@Override
	public double sum(double a, double b) {
		return a + b;
	}

	@Override
	public double subs(double a, double b) {
		return a - b;
	}

	@Override
	public double multiply(double a, double b) {
		return a * b;
	}

	@Override
	public double divide(double a, double b) {
		return a / b;
	}

	@Override
	public double abs(double a) {
		return (a < 0) ? (a * -1) : a;
	}
}
