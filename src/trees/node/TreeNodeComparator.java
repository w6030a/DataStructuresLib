package trees.node;

public class TreeNodeComparator {

	public boolean isLess(Node node, Node node2) {
		return node.getKey() < node2.getKey();
	}
}
