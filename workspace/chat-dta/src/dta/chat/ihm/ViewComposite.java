package dta.chat.ihm;

import java.util.ArrayList;
import java.util.List;

public abstract class ViewComposite {

	protected List<ViewComposite> children = new ArrayList<ViewComposite>();

	public void print() {
		children.forEach(ViewComposite::print);
		// children.forEach(child -> child.print());

	}

}
