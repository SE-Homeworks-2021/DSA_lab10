import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Queue;

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

        ArrayList<Integer> list= new ArrayList<>();
        Deque<Integer> queue = new ArrayDeque<>();

        list.add(T[p]);     //root
        queue.add(p);       //root

        while ( queue.isEmpty() == false )
        {

            if (hasLeftChild( queue.getFirst() ))       // Check the queue
            {
                list.add(T[2 * queue.getFirst() + 1]);  //
                queue.add(2 * queue.getFirst() + 1);    // It has child. So, add its child to queue.
            }

            if (hasRightChild( queue.getFirst() ))      // Check the queue
            {
                list.add(T[2 * queue.getFirst() + 2]);
                queue.add(2 * queue.getFirst() + 2);
            }

            queue.removeFirst();        // The queue gets checked already then remove it.

        }

        for (int j : list) {                        // just print
            System.out.print(j + " ");
        }

        System.out.println();
    }
}




