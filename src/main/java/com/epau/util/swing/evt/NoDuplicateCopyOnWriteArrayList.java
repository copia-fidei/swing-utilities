package com.epau.util.swing.evt;

import java.util.concurrent.CopyOnWriteArrayList;

// ensures no duplicates
class NoDuplicateCopyOnWriteArrayList<T> extends CopyOnWriteArrayList<T> {

	public boolean add(T e) {
		return addIfAbsent(e);
	}
}
