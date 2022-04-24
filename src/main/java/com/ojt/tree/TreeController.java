package com.ojt.tree;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ojt.mapper.TreeMapper;
import com.ojt.vo.Tree;

@Controller
public class TreeController {
  @Autowired
  private TreeMapper TreeMapper;

  @RequestMapping(value = "/tree", method = RequestMethod.GET)
  public String index(Model model) {
    List<Tree> tree = TreeMapper.getList();

    List<String> deptcd = new ArrayList<String>();
    List<String> deptname = new ArrayList<String>();
    List<String> parentdeptCd = new ArrayList<String>();
    List<String> depth = new ArrayList<String>();
    for (int i = 0; i < tree.size(); i++) {
      deptcd.add(tree.get(i).getDeptcd());
      deptname.add(tree.get(i).getDeptname());
      parentdeptCd.add(tree.get(i).getParentdeptCd());
      depth.add(tree.get(i).getDepth());
    }
    model.addAttribute("deptcd", deptcd);
    model.addAttribute("deptname", deptname);
    model.addAttribute("parentdeptCd", parentdeptCd);
    model.addAttribute("depth", depth);

    model.addAttribute("tree", tree);
    model.addAttribute("treeSize", tree.size());

    return "tree/index";
  }
}
