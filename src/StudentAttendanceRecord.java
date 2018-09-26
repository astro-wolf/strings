public class StudentAttendanceRecord {

    public static void main(String[] args) {
        StudentAttendanceRecord studentAttendanceRecord = new StudentAttendanceRecord();
        boolean rewarded = studentAttendanceRecord.checkRecord("PPPPPP");
        System.out.print(rewarded);
    }

    public boolean checkRecord(String s) {
        int absentCount = 0;
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == 'A') {
                absentCount++;
                if(absentCount > 1)
                    return false;
            } else if (c == 'L' && i < s.length() - 2 && s.charAt(i + 1) == 'L' && s.charAt(i + 2) == 'L')
                return false;
        }
        return true;
    }

}
