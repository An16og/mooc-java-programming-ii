public class Hideout <T>{
    T hidden;

    public Hideout(){
    }

    public void putIntoHideout(T toHide){
        hidden=toHide;
    }
    public T takeFromHideout() {
		if (this.hidden == null) {
			return null;
		}
		T taken = this.hidden;
		this.hidden = null;
		return taken;
	}
    public boolean isInHideout(){
        if(hidden==null){ return false;}
        return true;
    }
}
