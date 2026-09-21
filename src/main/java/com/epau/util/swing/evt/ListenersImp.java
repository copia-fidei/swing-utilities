package com.epau.util.swing.evt;

import java.util.List;
import java.util.function.Consumer;

class ListenersImp<T> implements Listeners<T> {

	private final List<T> listeners = new NoDuplicateCopyOnWriteArrayList<>();

	@Override
	public synchronized void add(T listener) {
		listeners.add(listener);
	}

	@Override
	public synchronized void remove(T listener) {
		listeners.remove(listener);
	}

	@Override
	public synchronized void fire(Consumer<T> eventConsumer) {
		for (int i = listeners.size() - 1; i >= 0; i--) {
			eventConsumer.accept(listeners.get(i));
		}
	}

	@Override
	public void clear() {
		listeners.clear();
	}

}
