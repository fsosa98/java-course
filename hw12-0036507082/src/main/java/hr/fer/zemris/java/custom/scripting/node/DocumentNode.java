package hr.fer.zemris.java.custom.scripting.node;

/**
 * Class DocumentNode defines data structure.
 * 
 * @author Filip
 */
public class DocumentNode extends Node {

	@Override
	public void accept(INodeVisitor visitor) {
		visitor.visitDocumentNode(this);
	}

}
