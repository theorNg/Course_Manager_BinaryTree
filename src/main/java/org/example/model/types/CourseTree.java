package org.example.model.types;

import org.example.model.binaryTree.CommonTreeInterface;
import org.example.model.binaryTree.TreeNode;

import java.io.File;
import java.util.ArrayList;


public class CourseTree implements CommonTreeInterface<Course> {
    private TreeNode<Course> root;

    // Task for Vinh: Implement methods from here up to `deleteByCopying`
    @Override
    public void load(File file) {
        // TODO: Implement loading courses from a file
    }

    @Override
    public void save(File file) {
        // TODO: Implement saving courses to a file
    }

    @Override
    public void clear() {
        // TODO: Implement clearing the tree
        root = null;
    }

    @Override
    public boolean isEmpty() {
        // TODO: Implement checking if the tree is empty
        return root == null;
    }

    @Override
    public void insert(Course value) {
        // TODO: Implement inserting a course into the tree
        TreeNode<Course> newNode = new TreeNode<>(value);

        if (isEmpty()){
            root = newNode;
            return;
        }

        TreeNode<Course> current = root;
        TreeNode<Course> parent = null;

        while(current != null){
            parent = current;
            if(value.getCcode().equals(current.data.getCcode())){
                System.out.println("The course is already in the list.");
                return;
            }
            if(value.getCcode().compareTo(current.data.getCcode()) < 0){
                current = current.left;
            } else {
                current = current.right;
            }
        }

        if(value.getCcode().compareTo(parent.data.getCcode()) < 0){
            parent.left = newNode;
        } else{
            parent.right = newNode;
        }
    }

    @Override
    public void preOrder(TreeNode<Course> node) {
        // TODO: Implement pre-order traversal of the tree
        if(node == null){
            return;
        }
        display(node);
        preOrder(node.left);
        preOrder(node.right);
    }

    @Override
    public void inOrder(TreeNode<Course> node) {
        // TODO: Implement in-order traversal of the tree
        if(node == null) {
            return;
        }
        preOrder(node.left);
        display(node);
        preOrder(node.right);
    }

    @Override
    public void postOrder(TreeNode<Course> node) {
        // TODO: Implement post-order traversal of the tree
        if(node == null) {
            return;
        }
        preOrder(node.left);
        preOrder(node.right);
        display(node);
    }

    @Override
    public void breadth() {
        // TODO: Implement breadth-first traversal of the tree
        if(root == null){
            return;
        }

    }

    @Override
    public TreeNode<Course> get(Course data) {
        // TODO: Implement searching for a course in the tree
        return null;
    }

    @Override
    public TreeNode<Course> getParent(TreeNode<Course> node) {
        // TODO: Implement finding the parent of a given node
        return null;
    }

    @Override
    public void deleteByCopying(Course data) {
        // TODO: Implement deletion by copying
    }
    // End of Task for Vinh


    // Task for CEO: Implement methods from here to the end
    @Override
    public void deleteByMerging(Course data) {
        // TODO: Implement deletion by merging

    }

    @Override
    public void toInOrderArray(ArrayList<Course> array, TreeNode<Course> start) {
        // TODO: Convert the tree to an in-order array
    }

    @Override
    public void balance(ArrayList<Course> data, int start, int end) {
        //TODO: Balancing data using from array
    }

    @Override
    public void balance() {
        //TODO: Implementing balance tree
    }

    @Override
    public void display(TreeNode<Course> node) {
        // TODO: Implement displaying the tree structure
        System.out.println(node.data);
    }

    @Override
    public TreeNode<Course> searchByCode(String code){
        // TODO: Search with course code
        return null;
    }

    @Override
    public TreeNode<Course> searchByName(String name){
        //TODO: Search with name
        return null;
    }

}
