package com.bridgelabz.binarysearchtree;

public class BinarySearchTreeService <T extends Comparable<T>>
{
	BinaryNode<T> root;

	public void insert(T data) 
	{
		BinaryNode<T> newNode = new BinaryNode<>();
		newNode.data = data;
		newNode.left = null;
		newNode.right =null;
		BinaryNode<T> traverse = root;
		while(true)
		{			
			if(traverse == null)
			{
				root = newNode;
				break;
			}
			else if(traverse.data.compareTo(newNode.data) < 0)
			{
				if(traverse.right == null)
				{					
					traverse.right = newNode ;
					break;
				}
				traverse = traverse.right;
			}
			else
			{
				if(traverse.left == null)
				{					
					traverse.left = newNode ;
					break;
				}
				traverse = traverse.left;
			}
		}

	}

	// calculate the size of binary tree
	public int size()
	{
		return size(root);
	}

	private int size(BinaryNode<T> traverse)
	{
		if (traverse == null)
			return 0;
		else
			return(size(traverse.left) + 1 + size(traverse.right));
	}

	//method to search data in binary search tree
	public void search(T data) 
	{
		BinaryNode<T> traverse = root;
		while(true)
		{	
			
			if(traverse == null)
			{
				System.out.println(data+ " is not present in tree");
				break;
			}
			else if(traverse.data == data  )
			{
				System.out.println(data+ " is present in tree");
				break;
			}
			else if(traverse.data.compareTo(data) < 0 )
			{					

				traverse = traverse.right;
			}
			else
			{

				traverse = traverse.left;
			}
		}

	}
}

