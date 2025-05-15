package onlineExam;

public class Question {
	public int _questionId;
	public int _examId;
	public String _questionText;
	public String _option;
	public String _correctAnswer;
	public float _marks;
	public exam _contains;
	public student_Ansswer _answer;

	public void display() {
		throw new UnsupportedOperationException();
	}

	public boolean validateAnswer(studentAnswer aAnswer) {
		throw new UnsupportedOperationException();
	}
}