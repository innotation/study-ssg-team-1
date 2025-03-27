package com.ino.model.dto;

public class ChunDB {
    private String studentNo;
    private String studentName;
    private Double score;

    @Override
    public String toString() {
        return "ChunDB{" +
                "studentNo='" + studentNo + '\'' +
                ", studentName='" + studentName + '\'' +
                ", score=" + score +
                '}';
    }

    public ChunDB(String studentNo, String studentName, Double score) {
        this.studentNo = studentNo;
        this.studentName = studentName;
        this.score = score;
    }

    public String getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }
}
