public class MyExperiences {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        System.out.println("hello world");

        //Hint for below look for right data type
        double number = 43.32;

        System.out.println(number);

        float float1= 43.1f;

        System.out.println(float1);

        System.out.println("I love java");

        boolean bl = true;

        System.out.println(bl);

        long l = 4567877777776L;
        System.out.println(l);

        System.out.println("=====================================");
        int firstExam1 = 60, secondExam1 = 65, thirdExam1 = 70, reqAverage = 65,  reqAttendance = 80, percentangeOfAttendance1 = 80;
        double myAverage1 = ((0.2 * firstExam1) + (0.30 * secondExam1) + ( 0.50 * thirdExam1));

        boolean examPass1 = myAverage1 >= reqAverage;
        boolean attendancePass1 = percentangeOfAttendance1 >= reqAttendance;

        System.out.println(examPass1 && attendancePass1);

        int firstExam2 = 60, secondExam2 = 65, thirdExam2 = 70, percentangeOfAttendance2 = 70;
        double myAverage2 = ((0.2 * firstExam2) + (0.30 * secondExam2) + ( 0.50 * thirdExam2));

        boolean examPass2 = myAverage2 >= reqAverage;
        boolean attendancePass2 = percentangeOfAttendance2 >= reqAttendance;

        System.out.println(examPass2 && attendancePass2);

        int firstExam3 = 50, secondExam3 = 40, thirdExam3 = 30, percentageOfAttendance3 = 90;
        double myAverage3 = ((0.2 * firstExam3) + (0.30 * secondExam3) + ( 0.50 * thirdExam3));

        boolean examPass3 = myAverage3 >= reqAverage;
        boolean attendancePass3 = percentageOfAttendance3 >= reqAttendance;

        System.out.println(examPass3 && attendancePass3);






    }



    }

