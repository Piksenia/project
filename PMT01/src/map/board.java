package map;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.swt.widgets.Composite;




public class board extends Composite {
	private DataBindingContext m_bindingContext;

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public board(Composite parent, int style) {
		super(parent, style);
		JLabel background = new JLabel(new ImageIcon("/images/board_colored_small.png"));
		background.setVisible(true);
		//setBackground(SWTResourceManager.getColor(255, 153, 204));
		

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}

}
