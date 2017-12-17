import java.io.*;

public class Tree
{
    TreeNode root;

    public Tree()
    {
    }

    public void Insert(int val)
    {
        this.root = Insert(this.root, val);
    }

    private TreeNode Insert(TreeNode t, int val)
    {
        if(t == null)
        {
            t = new TreeNode(val);
            return t;
        }
        else if(val <= t.val)
        {
            t.left = Insert(t.left, val);
        }
        else
        {
            t.right = Insert(t.right, val);
        }
        return t;
    }

    public void InOrder()
    {
        InOrder(this.root);
    }

    private void InOrder(TreeNode t)
    {
        if(t == null)
            return;
        InOrder(t.left);
        System.out.println(t.val);
        InOrder(t.right);
    }

    public void PreOrder()
    {
        PreOrder(this.root);
    }

    private void PreOrder(TreeNode t)
    {
        if(t == null)
            return;
        System.out.println(t.val);
        PreOrder(t.left);
        PreOrder(t.right);
    }


    public static  void main(String args[])
    {
        Tree t = new Tree(); 
        t.Insert(5);
        t.Insert(10);
        t.Insert(50);
        t.Insert(25);
        t.Insert(90);
        t.Insert(15);
        t.InOrder();
    }

    private class TreeNode{
        TreeNode left;
        TreeNode right;
        int val;
    
    
        public TreeNode(int val)
        {
            this.val = val;
        }
    } 
}


