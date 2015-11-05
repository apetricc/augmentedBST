/**
 * Andrew Petriccione 
 * Csci 333 Fall 2015 
 * Professor Whitley 
 * Homework 8: Augmented Binary Search Trees 
 * The point of this assignment is to implement a binary
 * search tree and the sorting algorithm we discussed for it, and then augment
 * the Binary Search Tree to include rank and select functions
 */
/**
 * The BSTNode class represents one node of a binary search tree. It has data
 * fields for the parent, left child, right child, key, and a field size for the
 * number of nodes in the subtree.
 */
//package augmentedbst;

public class BSTNode {

    BSTNode p, left, right;
    private int key;
    private int size;

    /**
     * The BSTNode constructor creates and empty node of a binary search tree
     * with all handles set to null.
     *
     * @param key The key for the node being created.
     */
    public BSTNode(int key) {
        this.key = key;
        p = null;
        left = null;
        right = null;
        size = 0;
    }

    /**
     * getP gets the parent of the node it is called on.
     *
     * @return the parent node.
     */
    public BSTNode getP() {
        return p;
    }

    /**
     * setP sets the parent node of the node it is passed.
     *
     * @param p The node to set the parent of.
     */
    public void setP(BSTNode p) {
        this.p = p;
    }

    /**
     * getLeft gets the left child node of the node it is called on.
     *
     * @return the left child node.
     */
    public BSTNode getLeft() {
        return left;
    }

    /**
     * setLeft sets the left child node of the node it is passed.
     *
     * @param left the node to set the left child of.
     */
    public void setLeft(BSTNode left) {
        this.left = left;
    }

    /**
     * getRight gets the right child of the node it is called on
     *
     * @return the right child node of the node that is having getRight
     */
    public BSTNode getRight() {
        return right;
    }

    /**
     * setRight sets the right child of the node it is called on
     *
     * @param right the node that is being set to be the right child
     */
    public void setRight(BSTNode right) {
        this.right = right;
    }

    /**
     * getKey returns the key of the selected node
     *
     * @return the key
     */
    public int getKey() {
        return key;
    }

    /**
     * getSize returns the number of nodes in the subtree
     *
     * @return the number of nodes in the subtree
     */
    public int getSize() {
        return size;
    }

    /**
     * setSize sets the size of a node's subtree
     *
     * @param size the size to set the subtree to
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * toString returns a String with the node's key in it.
     *
     * @return the String that can be printed.
     */
    @Override
    public String toString() {
        return "" + key;
    }
}
