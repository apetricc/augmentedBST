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
    /**
public static String selectPrinter(BinarySearchTree tree) {
    String result = "";
    for (int i = 1; i <= tree.getSize(); i++) {
        result += tree.select(i) + " ";
    }
    return result;
}
     **/
    public static void rankPrinter(int[] arr, BinarySearchTree tree) {
        String result = "";
        int[] newArr = arr.clone();
        //Arrays.sort(newArr);
        for (int i = 0; i < tree.getSize(); i++) {
            System.out.println("The node with key " + newArr[i] + " is rank: " + tree.rank(tree.search(newArr[i])));
        }
    }
        /**
         for (int i = 0; i < tree.getSize(); i++) {
         //System.out.println("Rank of node with key: " + newArr[i] + " is: "+tree.rank(tree,tree.search(newArr[i])));
         result += "Rank of node with key " + newArr[i] + " is: " +tree.rank(tree,tree.search(newArr[i])) + " \n";
         }

         return result;
         //System.out.println(result);
         }
    /**
     * In main we are to test the BinarySearchTree class, and the bstSort function.
     */
    /**
     * 12 points: In main, test your binary search tree with these new queries.
     Create a BinarySearchTree and insert at least 20 nodes into it.
     Print the tree's total size (the data field from HW7), delete a handful of elements from the tree,
     then print the tree's size again. We want to make sure the tree stays correct even after using insert
     and delete several times.
     Perform at least 5 select queries, using order statistic in bounds for the tree -- so, don't try to query for
     order statistic 21 in a tree with 20 nodes. Print the input and result of each query.
     Perform at least 5 rank queries on node handles already attached to nodes in the tree. (You can first use
     search on an int "key" to obtain a handle to a node with that "key.") Print the input "key" and result of each.
     If you did the extra credit, perform at least 5 successful interval queries (overlapping an interval in the tree)
     and at least 5 unsuccessful interval queries (not overlapping an interval in the tree), and print the input
     bounds and the output of each query.
     * @param args
     */
    public static void main(String[] args) {
        int[] arr = {22,12,5,7,6,11,15,3,16,13,25,24,30,33,29,1,2,19,36,28};
        System.out.println("Here is the initial array: \n" + arrayPrinter(arr));

        BinarySearchTree newTree = new BinarySearchTree();
        for (int i = 0; i < arr.length; i++) {
            newTree.insert(new BSTNode(arr[i]));
        }
        System.out.println("Here is the more informative PRE-order traversal printout: ");
        newTree.preOrder();
        System.out.print("\nHere is inOrder traversal: ");
        newTree.inOrder();
        System.out.println("\nThe rank of node with key 1 is: " + newTree.rank(newTree.search(1)));
        System.out.println("\nThe rank of node with key 2 is: " + newTree.rank(newTree.search(2)));
        System.out.println("\nThe rank of node with key 3 is: "+newTree.rank(newTree.search(3)));
        System.out.println("\nThe rank of node with key 5 is: "+newTree.rank(newTree.search(5)));
        System.out.println("\nThe rank of node with key 6 is: "+newTree.rank(newTree.search(6)));
        System.out.println("\nThe rank of node with key 7 is: " + newTree.rank(newTree.search(7)));
        System.out.println("\nThe rank of node with key 11 is: " + newTree.rank(newTree.search(11)));
        System.out.println("\nThe rank of node with key 12 is: "+newTree.rank(newTree.search(12)));
        System.out.println("\nThe rank of node with key 13 is: "+newTree.rank(newTree.search(13)));
        //System.out.println("Print each node in order of rank: " + selectPrinter(newTree));
        System.out.println();
        System.out.print("The size of the tree should be 20, it returns: " + newTree.getSize() + "\n");
        System.out.println("Deleting node with key 25.");
        newTree.delete(newTree.search(25));
        System.out.println("Deleting node with key 36.");
        newTree.delete(newTree.search(36));
        System.out.println("Deleting node with key 12.");
        newTree.delete(newTree.search(12));

        System.out.println("\nDeleting node with key 15.");
        newTree.delete(newTree.search(15));

        System.out.println("The size of the tree should now be 16, it returns: " + newTree.getSize());
        System.out.println("Here is a pre order traversal now that things have moved around:");
        newTree.preOrder();
        //System.out.println("If I try calling select on order 1 it should return 1, it returns: " + newTree.select(1));
        //System.out.println("If I call select on order 7 it should return 11, in fact it returns: " + newTree.select(7));

        System.out.println("\nNode with key 2 has rank: " + newTree.rank(newTree.search(2)));
        System.out.println("\nCall select on order 2: " + newTree.select(2));
        System.out.println("\nCall select on order 1: " + newTree.select(1));
        System.out.println("Node with 11 has rank: " + newTree.rank(newTree.search(11)));

  /*
        System.out.println("\nNode with key 3 has rank: " +newTree.rank(newTree,newTree.search(3)));
        System.out.println("\nNode with key 5 has rank: " +newTree.rank(newTree,newTree.search(5)));
        System.out.println("\nNode with key 6 has rank: " +newTree.rank(newTree,newTree.search(6)));
        System.out.println("\nNode with key 7 has rank: " +newTree.rank(newTree,newTree.search(7)));
        System.out.println("\nNode with key 11 has rank: " +newTree.rank(newTree,newTree.search(11)));
        System.out.println("\nNode with key 12 has rank: " +newTree.rank(newTree,newTree.search(12)));
        //rankPrinter(arr,newTree);
*/

    }//main


}

/**
 *
 *
 *
 *
 *
 *
 *
 *
 *
        System.out.println("Here is the pre-order traversal: ");


 public static String rankPrinter(int[] arr, BinarySearchTree tree) {
 String result = "";
 int[] newArr = arr.clone();
 //Arrays.sort(newArr);
 for (int i = 0; i < tree.getSize(); i++) {
 System.out.println("The node with key " + newArr[i] + " is rank: " + tree.rank(tree, tree.search(newArr[i])));
 }
 /**
 for (int i = 0; i < tree.getSize(); i++) {
 //System.out.println("Rank of node with key: " + newArr[i] + " is: "+tree.rank(tree,tree.search(newArr[i])));
 result += "Rank of node with key " + newArr[i] + " is: " +tree.rank(tree,tree.search(newArr[i])) + " \n";
 }

return result;
        //System.out.println(result);
        }





 newTree.preOrder();
        System.out.println("\nHere is the in-order traversal: ");
        newTree.inOrder();
        System.out.println("\nHere is the post-order traversal: ");
        newTree.postOrder();
        System.out.println("\nThe size of the tree is: " + newTree.getSize());


        System.out.println("The minimum of newTree is: " + newTree.minimum()
                + "\nHere is the minimum with all its successors: ");
        BSTNode min = newTree.minimum();
        for (int i = 0; i < newTree.getSize(); i++) {
            System.out.print(min + " ");
            min = newTree.successor(min);
        }

        System.out.println("\nThe maximum of newTree is: " + newTree.maximum()
                + "\nHere is the maximum with all its predecessors: ");
        BSTNode max = newTree.maximum();
        for (int i = 0; i < newTree.getSize(); i++) {
            System.out.print(max + " ");
            max = newTree.predecessor(max);
        }

        System.out.print("\n\nSearching for 11.......found: ");
        System.out.println(newTree.search(11));
        System.out.print("Searching for 19.......found: ");
        System.out.println(newTree.search(19));
        System.out.print("Searching for 16.......found: ");
        System.out.println(newTree.search(16));
        System.out.print("Searching for 4........found: ");
        System.out.println(newTree.search(4));
        System.out.print("Searching for 20.......found: ");
        System.out.println(newTree.search(20));
        System.out.print("Searching for 0........found: ");
        System.out.println(newTree.search(0));
        System.out.print("Searching for 6........found: ");
        System.out.println(newTree.search(6));
        System.out.print("Searching for 40.......found: ");
        System.out.println(newTree.search(40));
        System.out.print("Searching for 50.......found: ");
        System.out.println(newTree.search(50));
        System.out.print("Searching for 60.......found: ");
        System.out.println(newTree.search(60));

        System.out.println("\nThe size of the tree is: " + newTree.getSize());
        System.out.println("Deleting node with key 9.");
        newTree.delete(newTree.search(9));
        System.out.println("Deleting node with key 3.");
        newTree.delete(newTree.search(3));
        System.out.println("Deleting node with key 22.");
        newTree.delete(newTree.search(22));
        System.out.println("Deleting node with key 7.");
        newTree.delete(newTree.search(7));
        System.out.println("Deleting node with key 28.");
        newTree.delete(newTree.search(28));
        System.out.println("Deleting node with key 20.");
        newTree.delete(newTree.search(20));
        System.out.println("After deleting 6 nodes the size of the tree is: " + newTree.getSize());
        System.out.println("Here is an in-order traversal of the tree after deleting several nodes.");
        newTree.inOrder();

        int[] arr2 = {13, 4, 5, 6, 11, 6, 12, 10};
        System.out.println("\n\nHere is the initial array: \n" + arrayPrinter(arr2));
        System.out.print("Here is the array after bstSort: \n");
        bstSort(arr2);

        int[] arr3 = {27, 44, 15, 16, 21, 26, 12, 55, 19, 22, 18, 32, 12, 13, 35};
        System.out.println("Here is the initial array: \n" + arrayPrinter(arr3));
        System.out.print("Here is the array after bstSort: \n");
        bstSort(arr2);

        int[] arr4 = {100, 55, 112, 99, 14, 150, 111, 44, 15, 77, 125, 32, 33};
        System.out.println("Here is the initial array: \n" + arrayPrinter(arr4));
        System.out.print("Here is the array after bstSort: \n");
        bstSort(arr4);

        int[] arr5 = {50, 40, 60, 70, 80, 22, 55, 75, 25};
        System.out.println("Here is the initial array: \n" + arrayPrinter(arr5));
        System.out.print("Here is the array after bstSort: \n");
        bstSort(arr5);

        int[] arr6 = {44, 14, 15, 16, 51, 66, 60, 10, 11, 33, 40, 50, 45};
        System.out.println("Here is the initial array: \n" + arrayPrinter(arr6));
        System.out.print("Here is the array after bstSort: \n");
        bstSort(arr6);


 //here's my rank printer using the sort call:
 public static String rankPrinter(int[] arr, BinarySearchTree tree) {
 String result = "";
 int[] newArr = arr.clone();
 Arrays.sort(newArr);
 for (int i = 0; i < tree.getSize(); i++) {
 result += "Rank of node with key " + newArr[i] + " is: "
 +tree.rank(tree,tree.search(newArr[i])) + " \n";

 }
 return result;
 }










 }//main


 }
**/


