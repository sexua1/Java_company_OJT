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

    List<Integer> tree_id = new ArrayList<Integer>();
    List<Integer> parent_tree_id = new ArrayList<Integer>();
    List<String> tree_nm = new ArrayList<String>();
    for (int i = 0; i < tree.size(); i++) {
      tree_id.add(tree.get(i).getTree_id());
      parent_tree_id.add(tree.get(i).getParent_tree_id());
      tree_nm.add(tree.get(i).getTree_nm());
    }
    model.addAttribute("tree_id", tree_id);
    model.addAttribute("parent_tree_id", parent_tree_id);
    model.addAttribute("tree_nm", tree_nm);
    model.addAttribute("tree", tree);
    model.addAttribute("treeSize", tree.size());

    return "tree/index";
  }
}
