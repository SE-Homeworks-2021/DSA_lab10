import java.util.ArrayList;

public class Tree2 extends Tree{
    //Tree traversal algorithms
    //1. Preorder
    public void preOrderTraversal(int p) {
        //recursive approach: current parent node + all left child nodes + all right child nodes
        System.out.print(T[p] + " ");
        if(hasLeftChild(p)) {
            preOrderTraversal(2*p+1);
        }
        if(hasRightChild(p)) {
            preOrderTraversal(2*p+2);
        }
    }

    //2. Inorder
    public void inOrderTraversal(int p) {
        //recursive approach: left child node + parent node + right child node
        if (hasLeftChild(p))
        {
            inOrderTraversal(2*p+1);
        }

        System.out.print(T[p] + " ");

        if (hasRightChild(p))
        {
            inOrderTraversal(2*p+2);
        }





    }

    //3. Postorder
    public void postOrderTraversal(int p) {
        //recursive approach: all left child nodes + all right child nodes + current parent node

        if (hasLeftChild(p))
        {
            postOrderTraversal(2*p+1);

        }

        if (hasRightChild(p))
        {
            postOrderTraversal(2*p+2);
        }

        System.out.print(T[p] + " ");




    }

    //4. Breadth-first
    public void breadthFirstTraversal(int p) {

        ArrayList<Integer> list=new ArrayList<Integer>();
        ArrayList<Integer> left=new ArrayList<Integer>();
        ArrayList<Integer> right=new ArrayList<Integer>();

        list.add(T[p]);
        int i = 0;

        int l = i;
        int r = i;

        for (; l < getsize()*2 || r < getsize()*2 ; i = i+1, l=left.get(left.size() - 1), r=right.get(right.size() - 1))
        {
            if (hasLeftChild(i))
            {
                list.add(T[2 * i + 1]);
                left.add(2 * i + 1);
            }

            if (hasRightChild(i))
            {
                list.add(T[2 * i + 2]);
                right.add(2 * i + 2);
            }

            System.out.println(list);
        }

        for (int j : list) {                        // just print
            System.out.print(j + " ");
        }

//        System.out.println();
//        System.out.println(left);
//        System.out.println(right);
//
//        System.out.println();
    }
}




