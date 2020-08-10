package _02_Creating_Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class Streams_Intro {

	public static void main(String[] args) {

		Integer[] x = { 34, 23, 12, 1, 83, 34 };
		Stream<Integer> str = Arrays.stream(x);

		ArrayList<String> list = new ArrayList<String>();
		list.add("KJDHSFKJF");
		list.add("dfasdf");
		list.add("f23rff");
		list.add("sdfadsf a");
		list.add("adsfdas fadfs");

		Stream<String> ss = list.stream();

		ss = ss.filter((s) -> {
			if (s.contains(" ")) {
				return false;
			} else {
				return true;
			}

		});

		ss.forEach((s) -> {
			System.out.println(s);

		});

		str = str.sorted();

		str = str.filter((i) -> {
			if (i % 2 == 1) {
				return false;
			} else {
				return true;
			}
		});

		str.forEach((i) -> {
			System.out.println(i);
		});

	}
}
