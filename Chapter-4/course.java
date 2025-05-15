package onlineExam;

import java.util.Vector;
import onlineExam.student;
import onlineExam.feedback;

public class course {
	public int _courseId;
	public String _courseName;
	public int _instructorId;
	public String _courseCode;
	public String _description;
	public list<student> _studentList;
	public instructor _manages;
	public Vector<student> _enrolled_in = new Vector<student>();
	public Vector<feedback> _unnamed_feedback_ = new Vector<feedback>();

	public void getExam() {
		throw new UnsupportedOperationException();
	}

	public void getEnrolledStudent() {
		throw new UnsupportedOperationException();
	}
}