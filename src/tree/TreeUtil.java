package tree;

import java.util.ArrayList;
import java.util.Queue;

import trees.node.TreeNode;

public class TreeUtil {

	public static ArrayList<TreeNode> treeToBFSQueue(TreeNode root) {
		ArrayList<TreeNode> queue = new ArrayList<TreeNode>();
		queue.add(root);
		
		int index = 0;
		do {
			TreeNode current = queue.get(index);
			
			if(current == null) {
				index++;
				continue;
			}
			
			queue.add(current.getLeft());
			queue.add(current.getRight());
		} while(index < queue.size());
		
		return queue;
	}
	
	public static void treeToArray(TreeNode node, int index) {
    	if(node == null)
    		return;
 
    	nodeArray[index] = node; // pass in array
    	
    	treeToArray(node.left, 2*index+1);
    	treeToArray(node.right, 2*index+2);
    }
	
	private boolean isSymmetric(ArrayList<TreeNode> list, int level) {
		int subListStart = (int)Math.pow(2, level)-1;
		int subListEnd = (int)Math.pow(2, level+1)-1;
		ArrayList<TreeNode> subList;
		
		try {
			subList = new ArrayList<>(list.subList(subListStart, subListEnd));
		} catch (IndexOutOfBoundsException e) {
			return true;
		}
		
		return isSymmetric(subList) && isSymmetric(list, level+1);
	}
	
    private boolean isSymmetric(ArrayList<TreeNode> list) {
    	list.stream().forEach((node) -> System.out.print(node.val));
        System.out.println(String.format(" size: %d", list.size()));
    	int begin = 0;
    	int end = list.size() - 1;

    	while(begin < end) {
    		if(list.get(begin) == null && list.get(end) == null) {
    			
    		}
    		else if(list.get(begin) == null && list.get(end) != null) {
    			return false;
    		}
    		else if(list.get(begin) != null && list.get(end) == null) {
    			return false;
    		}
    		else {
    			if(list.get(begin).val != list.get(end).val)
    				return false;
    		}
    		
    		begin++;
    		end--;
    	}
    	
    	return true;
    }
}
