package chpt16.doubledispatch;

import chpt16.trash.Paper;

public class DDPaper extends Paper implements TypedBinMember {
	public DDPaper(double wt) {
		super(wt);
	}

	public boolean addToBin(TypedBin[] tb) {
		for (int i = 0; i < tb.length; i++)
			if (tb[i].add(this))
				return true;
		return false;
	}
} // /:~