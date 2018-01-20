/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.panthera.datastructure;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class BinaryTree {

    static Node root;

    public BinaryTree() {
        root = null;
    }

    public BinaryTree(int key) {
        root = new Node(key);
    }

    public static void main(String[] args) {
        BinaryTree treeA = new BinaryTree();
        BinaryTree treeB = new BinaryTree();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Select Operation");
        System.out.println("1. Insert");
        System.out.println("2. Search");
        System.out.println("3. Delete");
        System.out.println("5. Exit");
        input:
        while (sc.hasNextLine()) {
            int operation = sc.nextInt();
            switch (operation) {
                case 1:
                    System.out.println("No of Element to Inserted : ");
                    Scanner insert = new Scanner(System.in);
                    int count = insert.nextInt();
                    for (int i = 0; i < count; i++) {
                        treeA.insert(sc.nextInt());
                    }
                    System.out.println("Size of tree is : " + treeA.size());
                    System.out.println("Root is :" + root.key);
                    System.out.println("Print InOrder Tree : ");
                    treeA.printInorder();
                    System.out.println("Print InPreOrder Tree : ");
                    treeA.printPreorder();
                    System.out.println("Print InPostOrder Tree : ");
                    treeA.printPostorder();
                    break;
                case 2:
                    System.out.println("Please Insert Element");
                    break;
                case 3:
                    System.out.println("Please Insert Element");
                    break;
                case 4:
                    System.out.println("Please Insert Element");
                    break;
                case 5:
                    System.out.println("Exit....");
                    break input;
                default:
                    System.out.println("Input Invalid");
                    break;
            }

        }
    }

    public void search(int key) {
        searchTree(root, key);
    }

    private void searchTree(Node node, int key) {
        if (node == null) {
            System.out.println("Tree is Empty");
        } else if (key < node.key) {
            System.out.println("");
        }

    }

    public void printInorder() {
        inorderRec(root);
    }

    private void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.leftNode);
            System.out.println(root.key);
            inorderRec(root.rightNode);
        }
    }

    public void printPostorder() {
        printPostorder(root);
    }

    private void printPostorder(Node root) {
        if (root != null) {
            System.out.println(root.key);
            printPostorder(root.leftNode);
            printPostorder(root.rightNode);
        }
    }

    public void printPreorder() {
        printPreorder(root);
    }

    private void printPreorder(Node root) {

        if (root != null) {
            printPreorder(root.leftNode);
            printPreorder(root.rightNode);
            System.out.println(root.key);
        }
    }

    public void insert(int key) {
        root = insert(root, key);
    }

    private Node insert(Node node, int key) {
        if (node == null) {
            node = new Node(key);

        } else if (key < node.key) {
            node.leftNode = insert(node.leftNode, key);

        } else if (key > node.key) {
            node.rightNode = insert(node.rightNode, key);
        }
        return node;
    }

    public int size() {
        return (size(root));
    }

    private int size(Node node) {
        if (node == null) {
            return 0;
        } else {
            return size(node.leftNode) + 1 + size(node.rightNode);
        }
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

}
