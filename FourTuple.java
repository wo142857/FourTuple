class TwoTuple<A, B> {
	public final A first;    
	// final 声明可以保护public元素，阻止实例对象对其的的访问，编译错误。
	public final B second;
	public TwoTuple(A a, B b) {
		first = a, second = b;
	}
	public String toString() {
		return "(" + first + ", " + second + ")";
	}
}

public class FourTuple<A, B, C, D> extends TwoTuple {
	public final C third;
	public final D fourth;
	public FourTuple(A a, B b, C c, D d) {
		super(a, b);
		third = c, fourth = d;
	}
	public String toString() {
		StringBuilder sb = new StringBuilder(super.toString());
		return sb.delete(sb.length - 2, sb.length -1).toString() + 
			", " + third + ", " + fourth + ")";
	}
}
