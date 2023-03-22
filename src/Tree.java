public interface Tree<E> {
    public boolean insert(E e);
    public void inorder(TreeNode<E> root);
    public int getSize();
}
