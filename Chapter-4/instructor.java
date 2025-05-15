package onlineExam;

import java.util.Vector;
import onlineExam.exam;

public class instructor extends user {
	private int _instructorId;
	public admin _assigns;
	public Vector<exam> _creates = new Vector<exam>();
	public course _manages;

	public exam createExam() {
		throw new UnsupportedOperationException();
	}

	public void manageExam() {
		throw new UnsupportedOperationException();
	}

	public void importExam(File aData) {
		throw new UnsupportedOperationException();
	}

	public void editExam(int aExamId) {
		throw new UnsupportedOperationException();
	}

	public void deleteExam(int aExamId) {
		throw new UnsupportedOperationException();
	}

	public void viewExamReport() {
		throw new UnsupportedOperationException();
	}

	public void viewFeedback() {
		throw new UnsupportedOperationException();
	}
}