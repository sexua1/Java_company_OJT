package com.ojt.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.ojt.vo.Tree;

public interface TreeMapper {
  @Select("select * from COMPANY")
  public List<Tree> getList();
}
