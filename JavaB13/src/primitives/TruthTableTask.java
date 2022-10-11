package primitives;

public class TruthTableTask {
    public static void main(String[] args) {
        int e1 = 100, e2 = 60, e3 = 50, reqAve = 70, reqParticipation = 80,
                myParticipation = 100, reqHW = 90, myHW = 100;
        int myAve = ((e1 + e2 + e3) / 3);
        System.out.println(myAve);
        boolean examPass = myAve >= reqAve;
        boolean partiPass = myParticipation >= reqParticipation;
        boolean HWPass = myHW >= reqHW;
        System.out.println("Are you passing the course? " + (examPass && partiPass && HWPass));
        // B2 +2 == 3*C|| True && C<B/3
        int b= 6, c = 2;
        boolean result = b+2 ==3*c|| !true && c <b/3;
        System.out.println(result); // false because 3 false results


        System.out.println("===========");

        int exam1 = 60, exam2 = 65, exam3 = 70, reqAverage = 65,  reqAttendance = 80, myAttendance1 = 80;
        double myAverage1 = ((0.2 * exam1) + (0.30 * exam2) + ( 0.50 * exam3));

        boolean examPass1 = myAverage1 >= reqAverage;
        boolean attendancePass1 = myAttendance1 >= reqAttendance;

        System.out.println(examPass1 && attendancePass1);

        int myAttendance2 = 70;
        double myAverage2 = ((0.2 * exam1) + (0.30 * exam2) + ( 0.50 * exam3));

        boolean examPass2 = myAverage2 >= reqAverage;
        boolean attendancePass2 = myAttendance2 >= reqAttendance;

        System.out.println(examPass2 && attendancePass2);

        int exam_1 = 50, exam_2 = 40, exam_3 = 30,  myAttendance3 = 90;
        double myAverage3 = ((0.2 * exam_1) + (0.30 * exam_2) + ( 0.50 * exam_3));

        boolean examPass3 = myAverage3 >= reqAverage;
        boolean attendancePass3 = myAttendance3 >= reqAttendance;

        System.out.println(examPass3 && attendancePass3);





    }
}
