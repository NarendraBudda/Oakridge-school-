package com.jap.marksevaluation;
public class OakBridgeSchool {
    public int[] calculateTotalMarks(int [] math,int science[],int[] english) {
        if(math.length==0||science.length==0||english.length==0){
            return null;
        }
        int totalMarks[] = new int[math.length];
        for(int i=0;i<math.length;i++){
            totalMarks[i]=(math[i]+science[i]+english[i]);
        }
        return totalMarks;
    }

    public int[] calculateTotalAverageMarksForEachStudent(int [] totalMarks, int noOfSubjects){
        if(totalMarks.length==0||noOfSubjects==0){
            return null;
        }
        int averageMarks[] = new int[totalMarks.length];
        for(int i=0;i<totalMarks.length;i++){
             averageMarks[i]=(totalMarks[i]/noOfSubjects);
        }
        return averageMarks;
    }
    public int calculateAverageScienceMarks (int[] science)
    {  int totalScienceMarks=0;
        int averageScienceMarks=0;
        if(science.length==0){
            return -1;
        }

       for(int i=0;i<science.length;i++){
           totalScienceMarks = totalScienceMarks+science[i];

       }
         averageScienceMarks = (totalScienceMarks/science.length);
       return averageScienceMarks;
    }
    public int calculateAverageEnglishMarks (int[] english)
    {  int totalEnglishMarks=0;
        if(english.length==0){
            return -1;
        }
        for(int i=0;i<english.length;i++){
            totalEnglishMarks=totalEnglishMarks+english[i];
        }
        int averageEnglishMarks=(totalEnglishMarks/english.length);
       return averageEnglishMarks;
    }
    public int calculateAverageMathMarks (int[] math) {
        int totalMathMarks=0;
        if(math.length==0){
            return -1;
        }
        for(int i=0;i<math.length;i++){
            totalMathMarks=totalMathMarks+math[i];
        }
       int averageMathMarks=(totalMathMarks/math.length);
      return averageMathMarks;
    }

    public static void main(String[] args) {
        //Object of OakBridgeSchool class is created
        OakBridgeSchool oakBridgeSchool = new OakBridgeSchool();
        // Initialize the arrays with 10 values of marks for each subject
        int [] math = {88,89,100,70,60,80,35,3,25,56};
        int [] science = {80,83,99,67,56,84,38,9,32,65};
        int [] english = {90,98,100,65,54,82,40,13,45,67};
        // The total number of subjects
        int noOfSubjects = 3;
        int testtakensubjectmarks=100;
        // Initialize names of 10 Students
        String[] studentNames = {"Michelle","Ram","Sri","Tina","Tom","Sam","Ria","Pam","Leena","Leo"};
        // Initialize roll numbers of 10 Students
        int [] rollNos = {102,109,101,103,104,108,110,105,106,107};
        // Call the methods to calculate total marks and average marks
        int [] totalMarks = oakBridgeSchool.calculateTotalMarks(math,science,english);
        int [] averageMarks = oakBridgeSchool.calculateTotalAverageMarksForEachStudent(totalMarks,noOfSubjects);
        // Display the marks and average marks of each student

        // Call the methods to calculate average marks of science, math and social subjects of the class
        int averageScienceMarks = oakBridgeSchool.calculateAverageScienceMarks(science);
        int averageMathMarks = oakBridgeSchool.calculateAverageMathMarks(math);
        int averageEnglishMarks = oakBridgeSchool.calculateAverageEnglishMarks(english);
        int totaltestmarks=noOfSubjects*testtakensubjectmarks;

        // Display the average marks scored by the class in subjects
             for(int i=0;i<totalMarks.length;i++){
                 System.out.println("------------------------------------------------------------");
                 System.out.println("Student Name :: "+studentNames[i]+ "  ||  Roll Number ::"+rollNos[i]);
                 System.out.println("---------------------------------------------------------------");
                 System.out.println("The Total Marks "+totalMarks[i]+"/"+totaltestmarks);
                 System.out.println("The Average Marks "+averageMarks[i]);
                 System.out.println("-----------------------------------------------------------------");
             }
        System.out.println("The Average Science Marks Scored by the class is "+averageScienceMarks);
        System.out.println("The Average English Marks Scored by the class is "+averageEnglishMarks);
        System.out.println("The Average Maths Marks Scored by the class is "+averageMathMarks);
    }
}
