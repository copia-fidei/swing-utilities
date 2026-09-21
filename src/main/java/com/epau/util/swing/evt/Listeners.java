package com.epau.util.swing.evt;

import java.util.function.Consumer;


/// Generic listeners list.
public interface Listeners<T> {

	void add(T listener);

	@SuppressWarnings("unchecked")
	default void add(T... listeners) {
		for (T listener : listeners) {
			add(listener);
		}
	}

	void remove(T listener);

	/**
	 * Notifies every listener.
	 * Example: If the listener is of type ActionListener, call this method like this:
	 * listeners.fire(listener -> listener.actionPerformed(evt));
	 *
	 * @param eventConsumer		the invoked listener method
	 */
	void fire(Consumer<T> eventConsumer);

	void clear();

	/// Creates a Listeners instance
	static <U> Listeners<U> of() {
		return new ListenersImp<>();
	}
}

