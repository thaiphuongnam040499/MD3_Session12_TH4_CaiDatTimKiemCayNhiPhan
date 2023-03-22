public abstract class AbstractTree<E> implements Tree<E> {
    public abstract void inorder();

    @Override
    public void inorder(TreeNode<E> root){}
}
