package com.epau.util.swing.text;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public abstract class AbstractDocumentListener implements DocumentListener {

	@Override
	public void insertUpdate(DocumentEvent e) {
		update(e);
	}

	@Override
	public void removeUpdate(DocumentEvent e) {
		update(e);
	}


	@Override
	public void changedUpdate(DocumentEvent e) {
		update(e);
	}

	protected abstract void update(DocumentEvent e);
}
