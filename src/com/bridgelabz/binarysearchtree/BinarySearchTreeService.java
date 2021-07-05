package com.bridgelabz.binarysearchtree;

public class BinarySearchTreeService
{
	BinaryNode root;

	public void insert(int data) 
	{
		BinaryNode newNode = new BinaryNode();
		newNode.data = data;
		newNode.left = null;
		newNode.right =null;
		BinaryNode traverse = root;
		while(true)
		{			
			if(traverse == null)
			{
				root = newNode;
				break;
			}
			else if(traverse.data < newNode.data)
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

	private int size(BinaryNode traverse)
	{
		if (traverse == null)
			return 0;
		else
			return(size(traverse.left) + 1 + size(traverse.right));
	}

	//method to search data in binary search tree
	public void search(int data) 
	{
		BinaryNode traverse = root;
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
			else if(traverse.data < data)
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

