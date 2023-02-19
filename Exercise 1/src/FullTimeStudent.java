class FullTimeStudent extends Student {
    private int exam1Score;
    private int exam2Score;

    public FullTimeStudent(String name, int exam1Score, int exam2Score) {
        super(name);
        this.exam1Score = exam1Score;
        this.exam2Score = exam2Score;
    }

    public int getExam1Score() {
        return exam1Score;
    }

    public int getExam2Score() {
        return exam2Score;
    }
}
