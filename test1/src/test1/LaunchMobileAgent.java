package test1;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class LaunchMobileAgent {

	protected Shell shell;
	private Text text;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			LaunchMobileAgent window = new LaunchMobileAgent();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(450, 300);
		shell.setText("SWT Application");
		
		Label lblCapacity = new Label(shell, SWT.NONE);
		lblCapacity.setBounds(156, 47, 55, 15);
		lblCapacity.setText("CAPACITY");
		
		text = new Text(shell, SWT.BORDER);
		text.setBounds(141, 83, 76, 21);
		
		Button btnEnter = new Button(shell, SWT.NONE);
		btnEnter.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				int a =Integer.parseInt(text.getText());
				if(a>100)
				{
					shell.setVisible(false);
					(new Process()).open();
				}
				//shell.setVisible(false);
				//shell.dispose();
				else
				{
					shell.setVisible(false);
					(new TransportSolution()).open();
				}
			}
		});
		btnEnter.setBounds(136, 126, 75, 25);
		btnEnter.setText("enter");

	}

}
