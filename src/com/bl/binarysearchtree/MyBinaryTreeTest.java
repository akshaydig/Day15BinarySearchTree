package com.bl.binarysearchtree;

public class MyBinaryTreeTest {
	public static void main(String[] args) {
		MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<>();
		myBinaryTree.add(56);
		myBinaryTree.add(30);
		myBinaryTree.add(70);
		myBinaryTree.add(22);
		myBinaryTree.add(40);
		myBinaryTree.add(60);
		myBinaryTree.add(95);
		myBinaryTree.add(11);
		myBinaryTree.add(3);
		myBinaryTree.add(16);
		myBinaryTree.add(65);
		myBinaryTree.add(63);
		myBinaryTree.add(67);
		boolean keyFound = myBinaryTree.search(63);
		System.out.println("The node with key 63 is present : " + keyFound);
		int size = myBinaryTree.getSize();
		System.out.println("Size is :" + size);
	}
}