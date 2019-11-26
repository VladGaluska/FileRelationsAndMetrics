class Attribute {
	private long ID,declaredType;
	private FamixClass Type;
	private String modifiers;
	private FamixClass Container;
	private Method ContainerMethod;
	private long containerID;
	private boolean localVariable=false;
	public Attribute(long ID,boolean localVariable) {
		this.ID=ID;
		this.localVariable=localVariable;
	}
	public boolean isLocalVariable(){
	    return localVariable;
    }
	public void setContainerMethod(Method m){
	    ContainerMethod=m;
    }
    public Method getContainerMethod(){
	    return ContainerMethod;
    }
	public long getContainerID(){
		return containerID;
	}
	public void setContainerID(long ID){
		containerID=ID;
	}
	public void setContainer(FamixClass c){
		Container=c;
	}
	public long getContainer(){
		return containerID;
	}
	public long getID() {
		return ID;
	}
	public long getTypeID() {
		return declaredType;
	}
	public int hashCode() {
		return (int) (ID ^ (ID >>>32));
	}
	public void setType(long ID) {
		declaredType=ID;
	}
	public void setModifiers(String modifiers) {
		this.modifiers=modifiers;
	}
	public void setClass(FamixClass c) {
		Type=c;
	}
	public FamixClass getType() {
		return Type;
	}
	public boolean isProtected() {
		return modifiers.contains("protected");
	}
	public boolean isPublic(){ return modifiers.contains("public");}
	public boolean equals(Object o) {
		if(o instanceof Attribute) {
			Attribute a=(Attribute )o;
			if(a.getID()==ID) return true;
		}
		return false;
	}
	public String getModifiers(){
		return modifiers;
	}
	public String toString() {
		String st=""+ID;
		return st;
	}
}
