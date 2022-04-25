package com.ojt.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.ojt.vo.Tree;

public interface TreeMapper {
  @Select("select * from t_tree_info")
  public List<Tree> getList();
}
