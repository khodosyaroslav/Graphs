package dnu.fpm.pz;

import java.util.ArrayList;
import java.util.List;

public class Node {
    public Node(int data) {
        this.data = data;
        this.children = new ArrayList<>();
    }

    int data;
    List<Node> children;
}
