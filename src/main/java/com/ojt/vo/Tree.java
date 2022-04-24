package com.ojt.vo;

public class Tree {
  String deptcd;
  String deptname;
  String parentdeptCd;
  String depth;

  public String getDeptcd() {
    return deptcd;
  }

  public void setDeptcd(String deptcd) {
    this.deptcd = deptcd;
  }

  public String getDeptname() {
    return deptname;
  }

  public void setDeptname(String deptname) {
    this.deptname = deptname;
  }

  public String getParentdeptCd() {
    return parentdeptCd;
  }

  public void setParentdeptCd(String parentdeptCd) {
    this.parentdeptCd = parentdeptCd;
  }

  public String getDepth() {
    return depth;
  }

  public void setDepth(String depth) {
    this.depth = depth;
  }

  @Override
  public String toString() {
    return "Tree [deptcd=" + deptcd + ", deptname=" + deptname + ", parentdeptCd=" + parentdeptCd + ", depth=" + depth
        + "]";
  }

}
