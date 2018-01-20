/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.panthera.datastructure;

/**
 *
 * @author Administrator
 */
public class Node {

    int key;
    Node rightNode, leftNode;

    public Node(int key) {
        this.key = key;
        this.rightNode = null;
        this.leftNode = null;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public Node getRightNode() {
        return rightNode;
    }

    public void setRightNode(Node rightNode) {
        this.rightNode = rightNode;
    }

    public Node getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(Node leftNode) {
        this.leftNode = leftNode;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + this.key;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Node other = (Node) obj;
        if (this.key != other.key) {
            return false;
        }
        return true;
    }

}
