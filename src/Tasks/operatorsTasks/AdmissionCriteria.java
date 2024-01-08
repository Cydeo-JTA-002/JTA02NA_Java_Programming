package Tasks.operatorsTasks;

public class AdmissionCriteria {
    public static void main(String[] args) {
        int age=23;
        int entryExamScore=75;

        boolean isAgeGreaterOrEqual18=age>=19;
        boolean isEntryExamScoreGreaterOrEqual75=entryExamScore>74;

        System.out.println("You are admitted" + (isAgeGreaterOrEqual18 && isEntryExamScoreGreaterOrEqual75));
    }
}
