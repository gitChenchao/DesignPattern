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
	
	//添加子节点
	public void add(TreeNode treeNode){
		children.add(treeNode);
	}
	
	//删除子节点
	public void remove(TreeNode treeNode){
		children.remove(treeNode);
	}
	
	//获取子节点
	public Enumeration<TreeNode> getChildren(){
		return children.elements();
	}
}
