package edu.coursera.parallel;

public class Test {
    public static void main(String[] args) {
        String ncoresStr = System.getenv("COURSERA_GRADER_NCORES");
        if (ncoresStr == null){
            System.out.printf("%s",Runtime.getRuntime().availableProcessors());
        }else {
            System.out.printf("%s",Integer.parseInt(ncoresStr));
        }
    }
}
