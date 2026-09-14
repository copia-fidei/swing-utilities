package com.epau.util.swing.text;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.util.function.Consumer;

/// Listens to every document event (insert, remove, change) with one method.
public record DocumentChangeListener(Consumer<DocumentEvent> consumer) implements DocumentListener {

	public DocumentChangeListener(Runnable runnable) {
		this(_ -> runnable.run());
	}

	@Override
	public void insertUpdate(DocumentEvent e) { consumer.accept(e); }

	@Override
	public void removeUpdate(DocumentEvent e) { consumer.accept(e); }

	@Override
	public void changedUpdate(DocumentEvent e) { consumer.accept(e); }
}
