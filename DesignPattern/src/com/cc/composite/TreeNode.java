package com.cc.composite;

import java.util.Enumeration;
import java.util.Vector;

public class TreeNode {

	private String name;
	private TreeNode parent;
	private Vector<TreeNode> children = new Vector<TreeNode>();

	public TreeNode(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public TreeNode getParent() {
		return parent;
	}

	public void setParent(TreeNode parent) {
		this.parent = parent;
	}
	
	//�����ӽڵ�
	public void add(TreeNode treeNode){
		children.add(treeNode);
	}
	
	//ɾ���ӽڵ�
	public void remove(TreeNode treeNode){
		children.remove(treeNode);
	}
	
	//��ȡ�ӽڵ�
	public Enumeration<TreeNode> getChildren(){
		return children.elements();
	}
}