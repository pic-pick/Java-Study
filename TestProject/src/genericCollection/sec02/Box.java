package genericCollection.sec02;

public class Box<T> {

	private T tobj;
	public void set(T tobj) {
		this.tobj = tobj;
	}
	
	public T get() {
		return this.tobj;
	}
}
