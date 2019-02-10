package org.pursuit;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

  public static void main(String[] args) {
//    TreeNode parent = new TreeNode('A');
//    System.out.println("oarent");
//
//    System.out.println(parent);
//    System.out.println(parent.letter);
//    System.out.println(parent.children);
//    parent.children.add(new TreeNode('b'));
//    parent.children.add(new TreeNode('C'));
//    parent.children.add(new TreeNode('D'));
//
//    for (TreeNode childNode : parent.children) {
//      System.out.println("CHILD NODE");
//      System.out.println(childNode);
//      System.out.println(childNode.letter);
//      System.out.println(childNode.children);
//    }
//
//    TreeNode bNode = parent.children.get(0);
//    bNode.children.add(new TreeNode('E'));
//    bNode.children.add(new TreeNode('F'));
//    bNode.children.add(new TreeNode('G'));
//    printTreeRescursice(parent);
//    for (TreeNode bChildNode : parent.children) {
//      System.out.println("CHILD NODE");
//      System.out.println(bChildNode);
//      System.out.println(bChildNode.letter);
//      System.out.println(bChildNode.children);
//    }

//
    MyTree myTree = new MyTree();
    myTree.insert(50);
    myTree.insert(50);
    myTree.insert(43);
    myTree.insert(31);
    myTree.insert(67);
    myTree.insert(74);
    System.out.println(myTree.root);
    System.out.println(myTree.root.data);
    System.out.println(myTree.root.left);
    System.out.println(myTree.root.left.data);
    System.out.println(myTree.root.left.left);
    System.out.println(myTree.root.left.left.data);
    System.out.println(myTree.root.right);
    System.out.println(myTree.root.right.data);
    System.out.println(myTree.root.right.right);
    System.out.println(myTree.root.right.right.data);

//    BFS(myTree.root);
    inOrderDFS(myTree.root);
  }

  private static void BFS(TreeNode root) {
    Queue<TreeNode> treeNodes = new LinkedList<>();
    treeNodes.add(root);
    while (!treeNodes.isEmpty()) {
      TreeNode current = treeNodes.remove();
      if (current.left != null) {
        treeNodes.add(current.left);
      }
      if (current.right != null) {
        treeNodes.add(current.right);
      }
      System.out.println(current.data);
    }
  }

  public static void inOrderDFS(TreeNode root) {
    if (root != null) {
      if (root.left != null) {
        inOrderDFS(root.left);
      }
    }
    System.out.println(root.data);
    if (root.right != null) {
      inOrderDFS(root.right);
    }

  }

}





