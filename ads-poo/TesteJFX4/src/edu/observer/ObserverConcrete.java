package edu.observer;

public class ObserverConcrete implements Observer {
	@Override
	public void update(Object o) {
		System.out.println("Notifica��o recebida: "
					+ o.toString());
	}
}
