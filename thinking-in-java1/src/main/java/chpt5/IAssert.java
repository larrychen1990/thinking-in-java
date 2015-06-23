package chpt5;

public interface IAssert {
	void idTrue(boolean exp);

	void idTrue(boolean exp, String msg);

	void idFalse(boolean exp);

	void idFalse(boolean exp, String msg);
}
