package com.streaminapp.corejava.trees;

public class Node implements Comparable {

	int key;
	Node left;
	Node right;
	
	Node(int key){
		this.key=key;
	}

	public int compareTo(Object arg0) {
		return this.key-((Node)arg0).key;
	}
}
