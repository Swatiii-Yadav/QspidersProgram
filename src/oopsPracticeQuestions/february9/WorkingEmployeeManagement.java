package oopsPracticeQuestions.february9;

//service layer for EMployeeManageMent

public class WorkingEmployeeManagement {
    static void work(EmployeeManagement emp) {
        if (emp != null) {
            if (emp instanceof Management) {
                Management mg = (Management) emp;
                mg.manage();
                mg.work();
            } else if (emp instanceof Development) {
                Development dev = (Development) emp;
                dev.work();

            }
        }
    }
}
