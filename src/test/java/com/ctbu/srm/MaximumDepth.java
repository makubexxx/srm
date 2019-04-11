package com.ctbu.srm;

import java.util.List;

/**
 * @Author: Meiziyu
 * @Date: 2019/4/10 20:27
 * @Email 308348194@qq.com
 */
public class MaximumDepth {

    public int maxDepth(Node root) {

        if(root == null) {
            return 0;
        }
        int depth = 0;
        for(Node child : root.children) {
            depth = Math.max(depth, maxDepth(child));
        }
        return depth + 1;

    }

// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};

}


