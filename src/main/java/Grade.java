package main.java;

public enum Grade {
    A(5),
    B(4),
    C(3),
    D(2);
    private final int gradeCode;

    Grade(int gradeCode) {
        this.gradeCode = gradeCode;
    }

    public int getGradeCode() {
        return this.gradeCode;
    }

    public static Grade fromNum(int num) {
        for (Grade type : values()) {
            if (type.getGradeCode() == num) {
                return type;
            }
        }
        return null;
    }
}
