import java.util.ArrayList;

class Student {
    protected String name;
    protected ArrayList<Integer> quizScores;

    public Student(String name) {
        this.name = name;
        quizScores = new ArrayList<>();
    }

    public void addQuizScore(int score) {
        quizScores.add(score);
    }

    public double averageQuizScore() {
        int sum = 0;
        for (int score : quizScores) {
            sum += score;
        }
        return (double) sum / quizScores.size();
    }

    public Object getName() {
        return null;
    }

    public ArrayList<Integer> getQuizScores() {
        return null;
    }
}

