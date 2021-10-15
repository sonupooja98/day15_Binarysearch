package com.birnarysearchtree;


public class BST {
	int size = 0;

	public Node insert(Node node,int data) {
		
		if (node == null) {
			node = createNewNode(data);
		}
		
		if(data < node.data) {
			node.left = insert(node.left, data);
		}else if(data > node.data) {
			node.right = insert(node.right, data);
		}  
		
		return node;
	}

	private Node createNewNode(int data) {
		Node mynode = new Node(data);
		size += 1;
		return mynode;
	}

	public void printInorder(Node node) {
		if(node == null) {
			return;
		}
		printInorder(node.left);
		System.out.print(node.data + "->");
		printInorder(node.right);
		
		
	}
	
	public int size() {
		return size;
	}
	
	public boolean search(Node node , int data) {
		if(node == null) {
			return false;
		}
		
		boolean isPresent = false;
		while(node != null) {
			if(data < node.data) {
				node = node.left;
			}else if(data > node.data) {
				node = node.right;
			}else {
				isPresent = true;
				break;
			}
		}
		
		return isPresent;
	}
}