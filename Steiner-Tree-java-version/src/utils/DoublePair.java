package utils;

public class DoublePair {
	public Pair first;
	public long second;
	
	public DoublePair(long fv1, long fv2, long second) {
		this.first = new Pair(fv1, fv2);
		this.second = second;
	}
}
