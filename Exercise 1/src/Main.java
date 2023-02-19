import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Session session = new Session();
        session.populateWithDummyData();
        session.calculateAverageQuizScores();
        session.printQuizScoresInAscendingOrder();
        session.printPartTimeStudents();
        session.printFullTimeStudentsExamScores();
    }
}
