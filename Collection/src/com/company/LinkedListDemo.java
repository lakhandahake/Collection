package com.company;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
	public static void main(String[] args) {
		List<String> list=new LinkedList<String>();
		list.add("Vishal");
		list.add("lakhan");
		
		for(String s: list) {
			System.out.println(s);
		}

	}
}
