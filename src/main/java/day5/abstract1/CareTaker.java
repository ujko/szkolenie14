package day5.abstract1;

import java.io.InputStream;
import java.util.Arrays;

public class CareTaker implements SchoolWorker {
    private SchoolWorkerDAO schoolWorkerDAO = new SchoolWorkerDAO();
    private int Id;
    private String name;

    public CareTaker(int id, String name) {
        Id = id;
        this.name = name;
    }
    @Override
    public void addWorker(SchoolWorker schoolWorker) {
        SchoolWorker[] tablica = schoolWorkerDAO.getSchoolWorkers();
        schoolWorkerDAO.setSchoolWorkers(addNewWorker(schoolWorker, tablica));
        System.out.println(Arrays.toString(schoolWorkerDAO.getSchoolWorkers()));
    }
    private SchoolWorker[] addNewWorker (SchoolWorker schoolWorker,
                               SchoolWorker[] schoolWorkers) {
        SchoolWorker[] tablica2 =
                Arrays.copyOf(schoolWorkers, schoolWorkers.length + 1);
        tablica2[tablica2.length-1] = schoolWorker;
         return tablica2;
    }
    @Override
    public SchoolWorker[] getAllWorkers() {
        return schoolWorkerDAO.getSchoolWorkers();
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                '}';
    }
}
