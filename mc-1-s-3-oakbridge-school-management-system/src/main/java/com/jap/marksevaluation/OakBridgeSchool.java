package com.jap.marksevaluation;
public class OakBridgeSchool {

    public int[] calculateTotalMarks(int [] math,int science[],int[] social)
    {   if(math.length==0||science.length==0||social.length==0){
        return null;
    }
        int totalMarks[] = new int[math.length];
        for(int i=0;i<math.length;i++){
            totalMarks[i]=(math[i]+science[i]+social[i]);
        }

        return totalMarks;
    }

    public int[] calculateTotalAverageMarksForEachStudent(int [] totalMarks, int noOfSubjects){
        if(totalMarks.length==0||noOfSubjects==0){
            return null;
        }
        int averageMarks[] = new int[totalMarks.length];
        for(int i=0;i<totalMarks.length;i++) {
            averageMarks[i] = (totalMarks[i] / noOfSubjects);
        }
        return averageMarks;
    }

   // Write the logic inside the method to calculate the grade based on the math mark of the student
    public char findGradeInMath(int math){
        char mathGrade;
        if(math>=90){
                mathGrade='A';
            }
            else if (math>=80&&math<=89){
               mathGrade='B';
            } else if (math>=70&&math<=79) {
                mathGrade='C';
            }
            else if (math>=60&&math<=69) {
                mathGrade='D';
            }
            else {
                mathGrade='F';

            }


        return mathGrade;
    }
    // Write the logic inside the method to calculate the grade based on the science mark of the student
    public char findGradeInScience(int science){
        char scienceGrade;
            if(science>=90){
                scienceGrade='A';
            }
            else if (science>=80&&science<=89){
                scienceGrade='B';
            } else if (science>=70&&science<=79) {
                scienceGrade='C';
            }
            else if (science>=60&&science<=69) {
                scienceGrade='D';
            }
            else {
                scienceGrade='F';

            }


        return scienceGrade;
    }
    // Write the logic inside the method to calculate the grade based on the english mark of the student
    public char findGradeInEnglish(int english){
        char englishGrade;
            if(english>=90){
                englishGrade='A';
            }
            else if (english>=80&&english<=89){
                englishGrade='B';
            } else if (english>=70&&english<=79) {
                englishGrade='C';
            }
            else if (english>=60&&english<=69) {
                englishGrade='D';
            }
            else {
                englishGrade='F';

            }

        return englishGrade;
    }

    // Write the logic to sort the total marks of the students of the class, use insertion-sort

    public int[] sortByTotalMarks(int[] totalMarks)
    {
        for (int i = 1; i < totalMarks.length; i++) {
            int key = totalMarks[i];
            int j = i - 1;
            while (j >= 0 && totalMarks[j] > key) {
                totalMarks[j + 1] = totalMarks[j];
                j = j - 1;
            }
            totalMarks[j + 1] = key;


        }
        return totalMarks;
    }

    //Display the details of the student
    public void displayDetails(int totalMarks, int averageMarks, char mathGrade, char scienceGrade, char englishGrade,String studentNames, int rollNos,int totaltestmarks){
        System.out.println("*********************************************************************");
        System.out.println("Grading and Evaluation");
        System.out.println("*********************************************************************");

            System.out.println("------------------------------------------------------------");
            System.out.println("Student Name :: "+studentNames+ "  ||  Roll Number ::"+rollNos);
            System.out.println("---------------------------------------------------------------");
            System.out.println("The Total Marks "+totalMarks+"/"+totaltestmarks);
            System.out.println("The Average Marks "+averageMarks);
            System.out.println("-----------------------------------------------------------------");
            System.out.println("Math Grade "+mathGrade);
            System.out.println("Science Grade "+scienceGrade);
            System.out.println("English Grade "+englishGrade);

    }

    public static void main(String[] args) {
        int [] math = {88,89,100,70,60,80,35,3,25,56};
        int [] science = {80,83,99,67,56,84,38,9,32,65};
        int [] english = {90,98,100,65,54,82,40,13,45,67};
        int noOfSubjects = 3;
        int testtakensubjectmarks=100;
        String  studentNames[] = {"Michelle","Ram","Sri","Tina","Tom","Sam","Ria","Pam","Leena","Leo"};
        int [] rollNos = {102,109,101,103,104,108,110,105,106,107};


        int totaltestmarks=noOfSubjects*testtakensubjectmarks;
        OakBridgeSchool oakBridgeSchool = new OakBridgeSchool();
        int [] totalMarks = oakBridgeSchool.calculateTotalMarks(math,science,english);
        int [] averageMarks = oakBridgeSchool.calculateTotalAverageMarksForEachStudent(totalMarks,noOfSubjects);
        for(int i=0;i<averageMarks.length;i++) {
            char mathGrade[]=new char[math.length];
            char scienceGrade[]=new char[science.length];
            char englishGrade[]=new char[english.length];
             mathGrade[i] =oakBridgeSchool.findGradeInMath(math[i]);
             scienceGrade[i] =oakBridgeSchool.findGradeInMath(science[i]);
             englishGrade[i] =oakBridgeSchool.findGradeInMath(english[i]);
            oakBridgeSchool.displayDetails(totalMarks[i], averageMarks[i], mathGrade[i], scienceGrade[i], englishGrade[i], studentNames[i], rollNos[i], totaltestmarks);

        }
        int sortedtotalmarks[] = oakBridgeSchool.sortByTotalMarks(totalMarks);
        System.out.println("The Total marks of class in descending order ");
         for (int i=0;i<sortedtotalmarks.length;i++){
             System.out.println(sortedtotalmarks[i]);
         }
    }
}
