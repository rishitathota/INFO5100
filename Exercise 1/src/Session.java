import java.util.ArrayList;
import java.util.Collections;

class Session {
    ArrayList<Student> students = new ArrayList<>();

    public void populateWithDummyData() {
        students.add(new PartTimeStudent("Part Time Student 1"));
        students.add(new PartTimeStudent("Part Time Student 2"));
        students.add(new PartTimeStudent("Part Time Student 3"));
        students.add(new PartTimeStudent("Part Time Student 4"));
        students.add(new PartTimeStudent("Part Time Student 5"));
        students.add(new PartTimeStudent("Part Time Student 6"));
        students.add(new PartTimeStudent("Part Time Student 7"));
        students.add(new PartTimeStudent("Part Time Student 8"));
        students.add(new PartTimeStudent("Part Time Student 9"));
        students.add(new PartTimeStudent("Part Time Student 10"));
        students.add(new FullTimeStudent("Full Time Student 1", 80, 90));
        students.add(new FullTimeStudent("Full Time Student 2", 85, 95));
        students.add(new FullTimeStudent("Full Time Student 3", 90, 100));
        students.add(new FullTimeStudent("Full Time Student 4", 95, 80));
        students.add(new FullTimeStudent("Full Time Student 5", 70, 90));
        students.add(new FullTimeStudent("Full Time Student 6", 80, 100));
        students.add(new FullTimeStudent("Full Time Student 7", 75, 85));
        students.add(new FullTimeStudent("Full Time Student 8", 90, 80));
        students.add(new FullTimeStudent("Full Time Student 9", 90, 100));
        students.add(new FullTimeStudent("Full Time Student 10", 65, 85));


        // Add dummy quiz scores
        for (Student student : students) {
            for (int i = 0; i < 15; i++) {
                student.addQuizScore((int) (Math.random() * 100));
            }
        }
    }


    public void printQuizScoresInAscendingOrder() {
    }


    public void calculateAverageQuizScores() {
    }


    public void addStudent(Student student) {
        students.add(student);
    }

    public double averageQuizScore() {
        int sum = 0;
        int count = 0;
        for (Student student : students) {
            for (int score : student.quizScores) {
                sum += score;
                count++;
            }
        }
        return (double) sum / count;
    }

    public void printQuizScores() {
        ArrayList<Integer> scores = new ArrayList<>();
        for (Student student : students) {
            for (int score : student.quizScores) {
                scores.add(score);
            }
        }
        Collections.sort(scores);
        System.out.println("Quiz scores in ascending order: " + scores);
    }

    public void printPartTimeStudents() {
        System.out.println("Part-time students: ");
        for (Student student : students) {
            if (student instanceof PartTimeStudent) {
                System.out.println(student.name);
            }
        }
    }

    public void printFullTimeStudentsExamScores() {
        System.out.println("Full-time students exam scores: ");
        for (Student student : students) {
            if (student instanceof FullTimeStudent) {
                FullTimeStudent fullTimeStudent = (FullTimeStudent) student;
                System.out.println(fullTimeStudent.name + ": " + fullTimeStudent.getExam1Score() + ", " + fullTimeStudent.getExam2Score());
            }
        }
    }
    public void printQuizScoresInAscendingOrder(String studentName) {
        Student student = null;
        for (Student s : students) {
            if (s.getName().equals(studentName)) {
                student = s;
                break;
            }
        }
        if (students != null) {
            ArrayList<Integer> quizScores = (student).getQuizScores();
            Collections.sort(quizScores);
            System.out.println(studentName + " Quiz Scores: " + quizScores);
        } else {
            System.out.println("Student not found");
        }
    }
}



