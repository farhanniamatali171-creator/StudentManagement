class StudentEnrollment {

   
    private String studentName;
    private final int registrationId;
    private double academicScore;
    //Static variables
    public static String institution = "COMSATS University";
    public static final String COURSE_TITLE = "Object Oriented Programming";
    private static int activeEnrollments = 0;
    //Static final  variables
    public static final int SCORE_CEILING = 100;
    public static final int MIN_PASS_SCORE = 50;

    //Constructor
    public StudentEnrollment(String studentName, int registrationId, double academicScore) {
        this.studentName = studentName;
        this.registrationId = registrationId;
        this.academicScore = academicScore;
        activeEnrollments++; 
    }

    // Overloaded Constructor 
    public StudentEnrollment(String studentName, int registrationId) {
        this(studentName, registrationId, 0.0); 
    }

    //Mutator Method 
    public void assignScore(double newScore) {
        if (newScore >= 0 && newScore <= SCORE_CEILING) {
            this.academicScore = newScore;
        } else {
            System.out.println("Invalid score assignment for " + studentName);
        }
    }

    //Method for displaying records
    public void printRecord() {
        String performanceStatus = (academicScore >= MIN_PASS_SCORE) ? "CREDIT" : "REMEDIAL/PENDING";
        
        System.out.println("=== Student File ===");
        System.out.println("ID: " + registrationId);
        System.out.println("Name: " + studentName);
        System.out.println("Current Score: " + academicScore + " / " + SCORE_CEILING);
        System.out.println("Academic Status: " + performanceStatus);
        System.out.println("Enrolled at: " + institution + " [" + COURSE_TITLE + "]");
        System.out.println("==========================================================\n");
    }

    //Static Methods
    public static void printSystemRegistry() {
        System.out.println("----- REGISTRY METRICS -----");
        System.out.println("Campus: " + institution);
        System.out.println("Total Dynamic Registrations: " + activeEnrollments);
        System.out.println("----------------------------\n");
    }

    //Change insitution name
    public static void modifyInstitution(String corporateName) {
        institution = corporateName;
    }

    //Final Method
    public final void printEvaluationPolicy() {
        System.out.println(">> Standard Policy Threshold: " + MIN_PASS_SCORE + " points required to clear.");
    }

  
    public static void main(String[] args) {
        // Creating Objects
        StudentEnrollment studentA = new StudentEnrollment("Farhan", 101, 95.5);
        StudentEnrollment studentB = new StudentEnrollment("Ahmed", 102, 48.0);
        StudentEnrollment studentC = new StudentEnrollment("Ali", 103); 

        //Display initial batch records
        studentA.printRecord();
        studentB.printRecord();
        studentC.printRecord();

        //View registry metrics via class level
        StudentEnrollment.printSystemRegistry();

        //show state change 
        System.out.println("... Updating system profiles ...\n");

        //Grading the pending student
        studentC.assignScore(78.5); 
        StudentEnrollment.modifyInstitution("FAST University");

        //Verify updates
        studentC.printRecord();
        StudentEnrollment.printSystemRegistry();
    }
}