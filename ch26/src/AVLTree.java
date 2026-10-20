public class AVLTree<E> extends BST<E>  {
    public AVLTree() {

    }

    public AVLTree(java.util.Comparator<E> c) {
        super(c);
    }

    public AVLTree(E[] objects) {
        super(objects);
    }

    @Override
    protected AVLTreeNode<E> createNewNode(E e) {
        return new AVLTreeNode<E>(e);
    }

    @Override
    public boolean insert(E e) {
        boolean successful = super.insert(e);
        if (!successful)
            return false;
        else {
            balancePath(e);
        }

        return true;
    }

    private void updateHeight(AVLTreeNode<E> node) {
        if (node.left == null && node.right == null)
            node.height = 0;
        else if (node.left == null)
            node.height = 1 + ((AVLTreeNode<E>)(node.right)).height;
        else if (node.right == null)
            node.height = 1 + ((AVLTreeNode<E>)(node.left)).height;
        else
            node.height = 1 +
                Math.max(((AVLTreeNode<E>)(node.right)).height,
                ((AVLTreeNode<E>)(node.left)).height);
    }
}
