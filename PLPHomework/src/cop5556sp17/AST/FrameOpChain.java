package cop5556sp17.AST;

import cop5556sp17.Scanner.Kind;
import cop5556sp17.Scanner.Token;

public class FrameOpChain extends ChainElem {

	final Tuple tuple;
	Kind kind;

	public FrameOpChain(Token firstToken, Tuple arg) {
		super(firstToken);
		this.tuple = arg;
	}

	public Tuple getArg() {
		return tuple;
	}

	@Override
	public String toString() {
		return "FrameOpChain [tuple=" + tuple + "]";
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((tuple == null) ? 0 : tuple.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!super.equals(obj)) {
			return false;
		}
		if (!(obj instanceof FrameOpChain)) {
			return false;
		}
		FrameOpChain other = (FrameOpChain) obj;
		if (tuple == null) {
			if (other.tuple != null) {
				return false;
			}
		} else if (!tuple.equals(other.tuple)) {
			return false;
		}
		return true;
	}

	@Override
	public Object visit(ASTVisitor v, Object arg) throws Exception {
		return v.visitFrameOpChain(this, arg);
	}

	public void setkind(Kind kind)
	{
		this.kind=kind;
	}
	
	public Kind getkind()
	{
		return this.kind;
	}

}
