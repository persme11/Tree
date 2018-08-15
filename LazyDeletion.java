public class NodeLazy<Q extends Comparable<? super Q>> {

	public Q data;
	public NodeLazy<Q> left;
	public NodeLazy<Q> right;
	public boolean deleted = false;

	public NodeLazy(Q data, NodeLazy<Q> left, NodeLazy<Q> right){

		this.data = data;
		this.left = left;
		this.right = right;

	}

	public NodeLazy<Q> findMin(NodeLazy<Q> node){

		if(node == null){
			return null;
		}

		NodeLazy<Q> min = findMin(node.left);

		if(min != null){
			return min;
		}

		if(!node.deleted){
			return node; 
		} else {

			return findMin(node.right);

		}

	}

}