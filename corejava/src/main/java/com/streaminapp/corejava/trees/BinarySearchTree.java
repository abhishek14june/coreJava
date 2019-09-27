package com.streaminapp.corejava.trees;

public class BinarySearchTree {

	
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
		
		BinarySearchTree bst=new BinarySearchTree();
		bst.find(1, root);
		bst.find(11, root);
	}
	void find(int searchKey,Node tree) {
		if(tree==null) {
			return ;
		}
		if(searchKey==tree.key) {
			System.out.println("element found");
		}
		else {
			if(searchKey<tree.key) {
				if(tree.left!=null) {
					find(searchKey,tree.left);
				}
				else {
					System.out.println("Element not found but closest match is "+tree.key);
				}
			}
			else {
				if(tree.right!=null) {
					find(searchKey,tree.right);
				}
				else {
					System.out.println("Element not found but closest match is "+tree.key);
				}
			}
		}
		
		
		
	}
}
