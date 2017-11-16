package ru.job4j.max;
public class MaxNew {
	public int maxNew(int first, int second, int third) {
		first= max(first, second);
		first= max(first, third);
		return first;
	}
	public int max (int first, int second) {
		return first>second ? first:second;
	}
}