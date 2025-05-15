package onlineExam;

import java.util.Vector;
import onlineExam.Question;
import onlineExam.Result;

public class exam {
	public int _examId;
	public int _courseId;
	public Date _examDate;
	public srting _title;
	public int _durationMinutes;
	public DateTime _scheduleStartTime;
	public DateTime _scheduleEndTime;
	public List<Question> _questionList;
	public instructor _unnamed_instructor_14;
	public student _unnamed_student_15;
	public Vector<Question> _contains = new Vector<Question>();
	public Vector<Result> _unnamed_Result_ = new Vector<Result>();

	public void addQuestion(Question aQuestion) {
		throw new UnsupportedOperationException();
	}

	public QuestionList getQuestion() {
		throw new UnsupportedOperationException();
	}

	public void publish() {
		throw new UnsupportedOperationException();
	}

	public boolean startExamSession() {
		throw new UnsupportedOperationException();
	}
}