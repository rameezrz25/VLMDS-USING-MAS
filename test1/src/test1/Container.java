package test1;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;

import java.io.IOException;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class Container {

	protected Shell shell;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Container window = new Container();
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
		
		Button btnCreateAgent = new Button(shell, SWT.NONE);
		btnCreateAgent.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				try {
					Runtime.getRuntime().exec("cmd /c start cmd.exe /K \"cd C:\\jade&&java -cp lib\\jade.jar jade.Boot -gui\"");
					Thread.sleep(5000);
					Runtime.getRuntime().exec("cmd /c start cmd.exe /K \"cd C:\\jade&&java -cp lib\\jade.jar jade.Boot -container -host rameezrz25\"");
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		         
}
		});
		btnCreateAgent.setBounds(119, 107, 165, 25);
		btnCreateAgent.setText("CREATE CONTAINER");

	}
}
