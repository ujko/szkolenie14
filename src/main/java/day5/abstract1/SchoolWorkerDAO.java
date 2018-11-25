package day5.abstract1;

public class SchoolWorkerDAO {
    private SchoolWorker[] schoolWorkers = new SchoolWorker[0];

    public SchoolWorker[] getSchoolWorkers() {
        return schoolWorkers;
    }

    public void setSchoolWorkers(SchoolWorker[] schoolWorkers) {
        this.schoolWorkers = schoolWorkers;
    }
}
