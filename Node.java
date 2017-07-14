///Trees: Is This a Binary Search Tree?
package test;
public class Node {
	Node left,right;
	int data;
	public Node(int data)
	{
		this.data=data;
	}
	public void insert(int value)
	{
		if(value<=data)
		{
			if(left==null)
			{
				left=new Node(value);
			}
			else
				left.insert(value);
			
		}
		else
			if(right==null)
			{
				right=new Node(value);
			}
			else
			{
				 right.insert(value);
	}
		}	
	public boolean contains (int value)
	{
		if(value == data)
		{
			return true;
		}
		else if(value <data)
		{
			if(left==null)
			{
				return false;
			}
			else
			{
				return left.contains(value);
			}
		}
		else
		{
			if(right==null)
			{
				return false;
			}
			else
			{
				return right.contains(value);
			}
		}
			
		
	}
public void printnode()
{
	if(left!=null)
	{
		left.printnode();
	}
	System.out.println(data);
	if(right!=null)
	{
		right.printnode();
	}
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node n =new Node(10);
		n.insert(15);
		n.insert(8);
		n.insert(5);
		n.printnode();
		boolean b= n.contains(8);
		System.out.println(b);
		
	}

}
