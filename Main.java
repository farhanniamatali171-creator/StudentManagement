import java.util.ArrayList;

class Student {
private String name;
private int reg;
private int[] marks=new int[5];
private int total;
String grade;

public Student() {
}

public Student(String name, int reg, int[] marks, int total) {
    this.name = name;
    this.reg = reg;
    this.marks = marks;
    this.total = total;
    
}

public double calculations(){
    int sum=0;
    for(int i=0;i<marks.length;i++){
        sum+=this.marks[i];
    }
    double percentage=((double)sum/total)*100;
    return percentage;
}
public String calculateGrade(double average){
    
    if (average<=100 && average>90) {
        this.grade="A+";
    }
    else if (average<90 && average>=80) {
        this.grade="A";
    }
    else if (average<80 && average>=75) {
        this.grade="B";
    }
    else if (average<75 && average>=65) {
        this.grade="C";
    }
    else if (average<65 && average>=60) {
        this.grade="D";
    }
    else if (average<60 && average>=50) {
        this.grade="E";
    }
    else if(average<50)
        this.grade="Fail";
    return this.grade;
}

public void display(){
    System.out.println(" Name               : "+name);
    System.out.println(" Registration Number: "+reg);
    System.out.println(" Grade               :"+ grade);
    System.out.println("---------------------------");
}
    
}



public class Main {
    
    public static void main(String[] args) {
        int marks[][]=new int[5][];
         marks[0]=new int[]{90,97,98,95,90};
         marks[1]=new int[]{80,87,98,85,75};
         marks[2]=new int[]{75,87,67,87,89};
         marks[3]=new int[]{56,78,98,76,56};
         marks[4]=new int[]{45,67,35,47,39};
        Student student[]=new Student[5];
        student[0]=new Student("Farhan", 1, marks[0], 500);
        student[1]=new Student("Ali", 2, marks[1], 500);
        student[2]=new Student("Raza", 3,marks[2],500);
        student[3]=new Student("Majid",4, marks[3], 500);
        student[4]=new Student("Wahab", 5,marks[4], 500);
       System.out.println("----- STUDENT RECORDS ------");
        for (Student s : student) {
            double avg = s.calculations(); 
            s.calculateGrade(avg);         
            s.display();
     }
   }
}
