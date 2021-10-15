package com.birnarysearchtree;

class Node {
	int data;
	Node left;
	Node right;

	public Node(int data) {
		this.data = data;
		Node left = null;
		Node right = null;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + ", left=" + left + ", right=" + right + "]";
	}

}
