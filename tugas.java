/**
 * tugas
 */
public class tugas {

    public static void main(String[] args) {

        String status = "";
        int grade = 80;

        // mendaptkan status pelajar
        status = (grade >= 60) ? "passed" : "fail";

        // status
        System.out.println(status);
    }
}