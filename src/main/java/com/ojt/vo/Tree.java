package com.ojt.vo;

public class Tree {
  int tree_id;
  int parent_tree_id;
  String tree_nm;

  public int getTree_id() {
    return tree_id;
  }

  public void setTree_id(int tree_id) {
    this.tree_id = tree_id;
  }

  public int getParent_tree_id() {
    return parent_tree_id;
  }

  public void setParent_tree_id(int parent_tree_id) {
    this.parent_tree_id = parent_tree_id;
  }

  public String getTree_nm() {
    return tree_nm;
  }

  public void setTree_nm(String tree_nm) {
    this.tree_nm = tree_nm;
  }

  @Override
  public String toString() {
    return "Tree [tree_id=" + tree_id + ", parent_tree_id=" + parent_tree_id + ", tree_nm=" + tree_nm + "]";
  }

}
