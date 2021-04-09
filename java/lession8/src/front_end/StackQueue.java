package front_end;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueue {

	static Stack<String> studentStacks = new Stack<String>();
	static Queue<String> studentQueues = new LinkedList<String>();
	/*
	 * public static void show(Stack st, String name) { st.push(new String(name));
	 * System.out.println("push(" + name + ")"); System.out.println("Stack:" +
	 * name); }
	 * 
	 * public static void showst(Stack st) { System.out.println("abs-->"); String
	 * name = (String) st.pop(); System.out.println(name);
	 * System.out.println("Stack:" + st); }
	 */

	public static void addToStack(String name) {

		studentStacks.push(name);
	}

	public static void addToQueue(String name) {

		studentQueues.add(name);
	}

	public static void main(String[] args) {
		String[] std = { "Nguyen Van Nam", "Nguyen Van Huyen", "Tran Van Nam", "Nguyen Van A" };

		for (int i = 0; i < std.length; i++) {
			addToQueue(std[i]);
			addToStack(std[i]);
			// addToQueue(std[i]);

		}
		System.out.println("\n\n---------------------------------------------");
		System.out.println("Hien thi sinh vien theo Stack");
	//	System.out.println(studentStacks);
		for (int i = 0; i < std.length; i++) {
			String name = studentStacks.pop();
			System.out.println(name);
		}

		System.out.println("\n\n---------------------------------------------");
		System.out.println("Hien thi sinh vien theo Queue");
		System.out.println(studentQueues);

	}
}
