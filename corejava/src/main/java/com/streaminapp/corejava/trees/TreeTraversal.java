package com.streaminapp.corejava.trees;

import java.util.PriorityQueue;

public class TreeTraversal {

	Node root;
	TreeTraversal(Node root){
		this.root=root;
	}
	
	public static void main(String[] args) {
		Node root=new Node(5);
		root.right=new Node(8);
		root.right.left=new Node(7);
		root.right.left.left=new Node(6);
		root.right.right=new Node(9);
		root.right.right.right=new Node(10);
		root.left=new Node(4);
		root.left.left=new Node(2);
		root.left.left.right=new Node(3);
		root.left.left.left=new Node(1);
		
		System.out.println("Pre order traversal");
		preOrder(root);
		System.out.println();
		System.out.println("In order traversal");
		inOrder(root);
		System.out.println();
		System.out.println("Post order traversal");
		postOrder(root);
		System.out.println();
		System.out.println("Breadth first traversal");
		levelTraversal(root);
	}
	
	static void inOrder(Node tree) {
		if(null== tree) {
			return;
		}
		inOrder(tree.left);
		System.out.print(tree.key+" ");
		inOrder(tree.right);
		
	}
	
	static void preOrder(Node tree) {
		if(null==tree) {
			return;
		}
		System.out.print(tree.key+" ");
		preOrder(tree.left);
		preOrder(tree.right);
	}
	
	static void postOrder(Node tree) {
		if(null==tree) {
			return;
		}
		postOrder(tree.left);
		postOrder(tree.right);
		System.out.print(tree.key+" ");
	}
	
	static void levelTraversal(Node tree) {
		//Note comparable interface needs to be implemented by Node.class
		if(tree==null)
			return;
		PriorityQueue<Node> q=new PriorityQueue<Node>();
		q.add(tree);
		while(!q.isEmpty()) {
			Node temp=q.poll();
			System.out.print(temp.key+" ");
			if(temp.left!=null) {
				q.add(temp.left); 
			}
			if(temp.right!=null) {
				q.add(temp.right);
			}
		}
		System.out.println();
	}
	
	
	//pending
	void add(Node node) {
		if(root==null) {
			root=node;
			return;
		}
		Node temp=root;
		while(null!=temp && node.key>temp.key) {
			temp=temp.right;
		}
	}
}
