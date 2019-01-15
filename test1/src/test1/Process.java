package test1;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;

public class Process {

	protected Shell shell;
	private Text text;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Process window = new Process();
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
		
		Label lblProcessProblem = new Label(shell, SWT.NONE);
		lblProcessProblem.setBounds(138, 32, 158, 50);
		lblProcessProblem.setText("PROCESS PROBLEM");
		
		Label lblDiagonisReport = new Label(shell, SWT.NONE);
		lblDiagonisReport.setBounds(66, 93, 121, 15);
		lblDiagonisReport.setText("DIAGONSIS REPORT");
		
		text = new Text(shell, SWT.BORDER);
		text.setBounds(220, 88, 76, 21);

	}

}
