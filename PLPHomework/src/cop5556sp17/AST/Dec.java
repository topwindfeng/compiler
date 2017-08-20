package cop5556sp17.AST;

import cop5556sp17.AST.Type.TypeName;
import cop5556sp17.Parser.SyntaxException;
import cop5556sp17.Scanner.Token;

public class Dec extends ASTNode {
	
	final Token ident;
	TypeName type;
	int slot;
	
	public void setslot(int slot)
	{
		this.slot=slot;
	}
	
	public int getslot()
	{
		return this.slot;
	}
	
	public Dec(Token firstToken, Token ident) throws SyntaxException {
		super(firstToken);
        this.type =Type.getTypeName(firstToken);
		this.ident = ident;
	}

	public Token getType() {
		return firstToken;
	}

	public Token getIdent() {
		return ident;
	}

	@Override
	public String toString() {
		return "Dec [ident=" + ident + ", firstToken=" + firstToken + "]";
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((ident == null) ? 0 : ident.hashCode());
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
		if (!(obj instanceof Dec)) {
			return false;
		}
		Dec other = (Dec) obj;
		if (ident == null) {
			if (other.ident != null) {
				return false;
			}
		} else if (!ident.equals(other.ident)) {
			return false;
		}
		return true;
	}

	@Override
	public Object visit(ASTVisitor v, Object arg) throws Exception {
		return v.visitDec(this,arg);
	}
	
	public void set(TypeName type)
	{
		this.type=type;
	}
	
	public TypeName get()
	{
		return this.type;
	}


}
