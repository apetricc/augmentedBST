/**
 * Andrew Petriccione Csci 333 Fall 2015 Professor Whitley
 * Assignment: Binary Search Trees
 * The point of this assignment is to implement a binary search tree
 * and the sorting algorithm we discussed for it.
 */

/**
 * The Runner class creates a BinarySearchTree object and runs several tests on it
 * printing useful information to the console.
 */
import java.util.Arrays;
public class Runner {
    /**
     * bstSort is a function that is passed an integer array which it inserts
     * into a new BinarySearchTree object it creates & then fills with new BSTNodes
     * using the contents of the integer array as the keys for the BSTNodes
     * created.  Once the new BinarySearchTree is created and filled
     * bstSort does an in-order traversal of the tree printing the keys
     * of the nodes in the order of the traversal.
     *
     * @param arr The integer array to be passed to bstSort
     */
    public static void bstSort(int[] arr) {
        BinarySearchTree tree = new BinarySearchTree();
        for (int i = 0; i < arr.length; i++) {
            tree.insert(new BSTNode(arr[i]));
        }
        tree.inOrder();
        System.out.println();
    }

    /**
     * arrayPrinter is a function that prints the content of an integer array.
     *
     * @param arr the array to be printed
     * @return a String containing the contents of the array
     */
    public static String arrayPrinter(int[] arr) {
        String result = "";
        for (int i = 0; i < arr.length; i++) {
            result += "[" + arr[i] + "]";
        }
        return result;
    }

public static String selectPrinter(BinarySearchTree tree) {
    String result = "";
    for (int i = 1; i <= tree.getSize(); i++) {
        result += tree.select(i) + " ";
    }
    return result;
}

    public static void rankPrinter(int[] arr, BinarySearchTree tree) {
        String result = "";
        int[] newArr = arr.clone();
        //Arrays.sort(newArr);
        for (int i = 0; i < tree.getSize(); i++) {
            System.out.println("The node with key " + newArr[i] + " is rank: " + tree.rank(tree.search(newArr[i])));
        }
    }
    /**
     * in main we make a new tree, insert 20 nodes, print the size of the tree, I delete 4 nodes, print the size
     * of the tree again, perform at least 5 select queries, and 5 rank queries.
     */
    public static void main(String[] args) {
        int[] arr = {22,12,5,7,6,11,15,3,16,13,25,24,30,33,29,1,2,19,36,28};
        System.out.println("Here is the initial array: \n" + arrayPrinter(arr));

        BinarySearchTree newTree = new BinarySearchTree();
        for (int i = 0; i < arr.length; i++) {
            newTree.insert(new BSTNode(arr[i]));
        }
        System.out.print("The size of the tree should be 20, it returns: " + newTree.getSize() + "\n");
        System.out.println("Deleting node with key 25.");
        newTree.delete(newTree.search(25));

        System.out.println("Deleting node with key 36.");
        newTree.delete(newTree.search(36));
        System.out.println("Deleting node with key 12.");
        newTree.delete(newTree.search(12));
        System.out.println("Deleting node with key 15.");
        newTree.delete(newTree.search(15));
        System.out.println("The size of the tree should now be 16, it returns: " + newTree.getSize());
        System.out.println("\nHere is an in order traversal to easier see the proper ranks: "); newTree.inOrder();
        System.out.println("\n\nNode with key 7 should be rank 6,   has rank: " +newTree.rank(newTree.search(7)));
        System.out.println("Node with key 11 should be rank 7,  has rank: " +newTree.rank(newTree.search(11)));
        System.out.println("Node with key 13 should be rank 8,  has rank: " + newTree.rank(newTree.search(13)));
        System.out.println("Node with key 16 should be rank 9,  has rank: " +newTree.rank(newTree.search(16)));
        System.out.println("Node with key 19 should be rank 10, has rank: " + newTree.rank(newTree.search(19)));
        System.out.println();
        System.out.println("\nCalling select on order 1 it should return 1, it gives: " + newTree.select(1));
        System.out.println("Calling select on order 7 should give 11, it gives: " + newTree.select(7));
        System.out.println("Calling select on order 8 should give 13, it gives: " + newTree.select(8));
        System.out.println("Calling select on order 9 should give 16, it gives: " + newTree.select(9));
        System.out.println("Calling select on order 10 should give 19, it gives: " + newTree.select(10));

    }//main

}
