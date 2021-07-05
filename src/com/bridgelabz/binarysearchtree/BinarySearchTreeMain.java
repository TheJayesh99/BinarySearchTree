package com.bridgelabz.binarysearchtree;

public class BinarySearchTreeMain
{
	public static void main(String[] args)
	{
		//uc1 - create binary search tree
		BinarySearchTreeService BST1 = new BinarySearchTreeService();
		BST1.insert(56);
		BST1.insert(30);
		BST1.insert(70);
		System.out.println("The number of nodes are "+BST1.size());

		//uc2 - create a binary tree as shown in figure
		BinarySearchTreeService BST2 = new BinarySearchTreeService();
		BST2.insert(56);
		BST2.insert(30);
		BST2.insert(22);
		BST2.insert(11);
		BST2.insert(3);
		BST2.insert(16);
		BST2.insert(40);
		BST2.insert(70);
		BST2.insert(95);
		BST2.insert(60);
		BST2.insert(65);
		BST2.insert(63);
		BST2.insert(67);		
		System.out.println("The number of nodes are "+BST2.size());
		
		//uc3 - to search data 63 present in binary search tree or not
		BST2.search(63);
	}
}
