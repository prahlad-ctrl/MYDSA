import dsalib.tree.BST;

public class maintestbst {
    public static void main(String[] args) {
        System.out.println("=== BINARY SEARCH TREE DEMO ===");
        BST bst = new BST();

        bst.insert(50);
        bst.insert(30);
        bst.insert(70);
        bst.insert(20);
        bst.insert(40);
        bst.insert(60);
        bst.insert(80);

        System.out.print("Inorder: ");
        bst.inorder();

        System.out.print("Preorder: ");
        bst.preorder();

        System.out.print("Postorder: ");
        bst.postorder();

        System.out.println("Search 40: " + bst.search(40));
        System.out.println("Search 90: " + bst.search(90));

        bst.delete(20);
        System.out.print("Inorder after deleting 20: ");
        bst.inorder();

        bst.delete(30);
        System.out.print("Inorder after deleting 30: ");
        bst.inorder();

        bst.delete(50);
        System.out.print("Inorder after deleting 50: ");
        bst.inorder();
    }
}
