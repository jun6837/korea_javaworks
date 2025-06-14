package interface_impl;

public class MyMathImpl implements MyMath{

	@Override
	public int myAbs(int n) {
		// TODO Auto-generated method stub
		int value = (n < 0 ? -n : n);
		return value;
	}
	

}
