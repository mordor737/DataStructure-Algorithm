package com.learn;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyHashSet {
	private static final int SIZE = 100;
	private List<List<Integer>> parentList;

	MyHashSet() {
		parentList = new ArrayList<>(SIZE);
		for (int i = 0; i < SIZE; i++) {
			parentList.add(null);
		}
	}

	public void add(int element) {
		int index = element % SIZE;
		List<Integer> childList = parentList.get(index);
		if (childList == null) {
			List<Integer> list = new LinkedList<>();
			list.add(element);
			parentList.set(index, list);
		} else {
			if (!childList.contains(element)) {
				childList.add(element);
				parentList.set(index, childList);
			}
		}

	}

	public void remove(int element) {
		int index = element % SIZE;
		List<Integer> childList = parentList.get(index);
		if (childList != null) {
			childList.remove(Integer.valueOf(element));
			parentList.set(index, childList);
		}
	}

	public boolean contains(int element) {
		int index = element % SIZE;
		List<Integer> childList = parentList.get(index);
		if (childList != null && childList.contains(element)) {
			return true;
		}
		return false;
	}
}
