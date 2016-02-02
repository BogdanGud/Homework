package gojava.traversingtree.Test;

import gojava.traversingtree.Traverser;
import gojava.traversingtree.TreeNode;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class TraverserTest {
    TreeNode node10 = new TreeNode(null, null, 10);
    TreeNode node4 = new TreeNode(node10, null, 4);
    TreeNode node5 = new TreeNode(null, null, 5);
    TreeNode node1 = new TreeNode(node4, node5, 1);
    TreeNode node7 = new TreeNode(null, null, 7);
    TreeNode node8 = new TreeNode(null, null, 8);
    TreeNode node3 = new TreeNode(node7, node8, 3);
    TreeNode node2 = new TreeNode(node1, node3, 2);

    public static boolean equalsLists(List<Integer> list1, List<Integer> list2) {
        if (list1 == null || list2 == null) {
            return false;
        }
        if (list1.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i) != list2.get(i)) {
                return false;
            }
        }
        return true;
    }

    @org.junit.Test
    public void testPreOrderTravers() throws Exception {
        List<Integer> expectedKeys = new ArrayList<Integer>();
        List<Integer> actualKeys = Traverser.preorderTravers(node2);
        expectedKeys.add(2);
        expectedKeys.add(1);
        expectedKeys.add(4);
        expectedKeys.add(10);
        expectedKeys.add(5);
        expectedKeys.add(3);
        expectedKeys.add(7);
        expectedKeys.add(8);

        assertTrue(equalsLists(expectedKeys, actualKeys));
    }

    @org.junit.Test
    public void testSymmetricWalk() throws Exception {
        List<Integer> expectedKeys = new ArrayList<Integer>();
        List<Integer> actualKeys = Traverser.symmetricTravers(node2);
        expectedKeys.add(10);
        expectedKeys.add(4);
        expectedKeys.add(1);
        expectedKeys.add(5);
        expectedKeys.add(2);
        expectedKeys.add(7);
        expectedKeys.add(3);
        expectedKeys.add(8);

        assertTrue(equalsLists(expectedKeys, actualKeys));
    }

    @org.junit.Test
    public void testPostOrderWalk() throws Exception {
        List<Integer> expectedKeys = new ArrayList<Integer>();
        List<Integer> actualKeys = Traverser.postorderTravers(node2);
        expectedKeys.add(10);
        expectedKeys.add(4);
        expectedKeys.add(5);
        expectedKeys.add(1);
        expectedKeys.add(7);
        expectedKeys.add(8);
        expectedKeys.add(3);
        expectedKeys.add(2);

        assertTrue(equalsLists(expectedKeys, actualKeys));
    }
}