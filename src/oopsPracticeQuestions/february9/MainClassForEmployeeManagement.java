package oopsPracticeQuestions.february9;

public class MainClassForEmployeeManagement {
    public static void main(String[] args) {
        WorkingEmployeeManagement.work(new Management(123,"MGR",56000,30000));
        WorkingEmployeeManagement.work(new Development(123,"MGR",56000,"KYC"));

    }
}
