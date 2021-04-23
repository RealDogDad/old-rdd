public class BinarySearchTree {
    /* Class containing left
       and right child of current node
     * and key value*/
    class Node
    {
        int key;
        Node left, right;
 
        public Node(int item)
        {
            key = item;
            left = right = null;
        }
    }
 
    // Root Node of the tree
    Node root;
 
    // Constructor
    BinarySearchTree()
    {
         root = null;
    }
 
    // This method calls insertRec() with parameters Root and Key given a Key.
    void insert(int key)
    {
         root = insertRec(root, key);
    }
 
    /* A recursive function to
       insert a new key into the tree */
    Node insertRec(Node root, int key)
    {
 
        /* If the tree is empty,
           return a new node */
        if (root == null)
        {
            root = new Node(key);
            return root;
        }
 
        /* Otherwise, traverse down the tree */
        if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);
 
        /* return the (unchanged) node reference */
        return root;
    }
 
    // This method mainly calls InorderRec()
    void inorder()
    {
         inorderRec(root);
    }
 
    // A utility function to
    // do inorder traversal of BST
    void inorderRec(Node root)
    {
        if (root != null) {
            inorderRec(root.left);
            System.out.println(root.key);
            inorderRec(root.right);
        }
    }
     // Driver Code
    public static void main(String[] args){
        System.out.println("This is one implentation of a B.S.T. in Java.");
        BinarySearchTree tree = new BinarySearchTree();
        System.out.println("Let's create the following tree:");
        System.out.println("55");
        System.out.println(" /    \\ ");
        System.out.println(" 35     75");
        System.out.println("/   \\   /  \\ ");
        System.out.println("25    45    65    85");
        /* Create the following BST
              55
           /     \
          35      75
         /  \    /  \
       25   45  65   85*/
       
        tree.insert(55);
        tree.insert(35);
        tree.insert(25);
        tree.insert(45);
        tree.insert(75);
        tree.insert(65);
        tree.insert(85);
 
        // print inorder traversal of the BST
        tree.inorder();
    }
}