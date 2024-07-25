import java.util.Scanner;

public class QuestionService {

    Question[] questions = new Question[5];
    String[] selection = new String[5];

    public QuestionService() {
        questions[0] = new Question(1, "What is size of int?", "2", "6", "4", "8", "4");
        questions[1] = new Question(2, "What is size of double?", "2", "6", "4", "8", "8");
        questions[2] = new Question(3, "What is size of char?", "2", "6", "4", "8", "2");
        questions[3] = new Question(4, "What is size of long?", "2", "6", "4", "8", "8");
        questions[4] = new Question(5, "What is size of boolean?", "1", "2", "4", "8", "1");


    }

    public void playQuiz() {
        int i = 0;
        for (Question q : questions) {
            System.out.println("Question #: " + q.getId());
            System.out.println(q.getQuestion());
            System.out.println("1) " + q.getOpt1());
            System.out.println("2) " + q.getOpt2());
            System.out.println("3) " + q.getOpt3());
            System.out.println("4) " + q.getOpt4());
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter answer: ");
            selection[i] = sc.nextLine();
            i++;
        }

        for (String s : selection) {
            System.out.println(s);
        }

    }

    public void printScore() {
        int score = 0;
        for (int i = 0; i < questions.length; i++) {
            Question que = questions[i];
            String answer = que.getAnswer();
            String userAnswer = selection[i];
            if (answer.equals(userAnswer)) {
                score++;
            }
        }

        int percentage = getScorePercentage(score, questions.length);

        System.out.println("Your score is : " + score + " out of " + questions.length);
        System.out.println("Percentage is : " + percentage + "%");
    }

    private int getScorePercentage(int score, int totalQuestions) {
        return (score * 100/ totalQuestions);
    }
}