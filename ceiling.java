import java.util.*;

public class ceiling {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int n = reader.nextInt();
        int k = reader.nextInt();
        Node[] roots = new Node[n];
        int numShapes = 0;

        for (int i = 0; i < n; i++) {
            roots[i] = new Node(reader.nextInt());
            boolean isUnique = true;

            for (int j = 1; j < k; j++) {
                roots[i].insert(roots[i], reader.nextInt());
            }

            for (int j = 0; j < i; j++) {
                if (check(roots[i], roots[j])) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                numShapes++;
            }
        }
        System.out.println(numShapes);
    }

    public static boolean check(Node tree1, Node tree2) {
        if (tree1 == null && tree2 == null) {
            return true;
        } else if ((tree1 == null && tree2 != null) || (tree1 != null && tree2 == null)) {
            return false;
        } else {
            return check(tree1.left, tree2.left) && check(tree1.right, tree2.right);
        }
    }
}

class Node {
    int val;
    Node left;
    Node right;

    public Node(int val) {
        this.val = val;
        left = right = null;
    }

    public Node insert(Node root, int val) {
        if (root == null) {
            return new Node(val);
        }

        if (val > root.val) {
            root.right = insert(root.right, val);
        }

        if (val < root.val) {
            root.left = insert(root.left, val);
        }
        return root;
    }

    public void pre(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.val + " ");
        pre(root.left);
        pre(root.right);
    }
}
