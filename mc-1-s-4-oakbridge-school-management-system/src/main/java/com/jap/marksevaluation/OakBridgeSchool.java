package com.jap.marksevaluation;
public class OakBridgeSchool {
    public int[] calculateTotalMarks(int [] math,int science[],int[] english)
    {  
        if(math.length==0||science.length==0||english.length==0){
            return null;
        }
        int totalMarks[] = new int[math.length];
        for(int i=0;i<math.length;i++){
            totalMarks[i]=(math[i]+science[i]+english[i]);
        }

        return totalMarks;

        }




    // Write the logic to calculate the average marks using recursion
   public double calculateAverageScienceMarks (int[] science,int len)
    {     double totalsciencemarks;
        if(len==1){
         return  totalsciencemarks=science[0];

         }
         else {
             totalsciencemarks=science[len-1]+(len-1)*calculateAverageScienceMarks(science,len-1);
             }



        return  totalsciencemarks/len;
    }
    // Write the logic to calculate the average marks using recursion
    public double calculateAverageEnglishMarks (int[] english,int len)
    {
        double totalenglishmarks;
        if(len==1){
            totalenglishmarks=english[0];
        }
        else {
            totalenglishmarks=english[len-1]+(len-1)*calculateAverageEnglishMarks(english,len-1);
        }


        return totalenglishmarks/len;
    }
    // Write the logic to calculate the average marks using recursion
    public double calculateAverageMathMarks (int[] math,int len)    {
        double totalmathhmarks;
        if(len==1){
            totalmathhmarks=math[0];
        }
        else {
            totalmathhmarks=math[len-1]+(len-1)*calculateAverageMathMarks(math,len-1);
        }



        return totalmathhmarks/len;
    }

    //Write the logic to find the top score in the class using recursion
    public int findTopScore(int [] totalMarks,int len){
        int max;
        if(len==1){
            return max=totalMarks[0];
        }
        max=totalMarks[len-1];
        if(totalMarks[0]>max){

          max= findTopScore(totalMarks,len-1);
        }
        else {
            totalMarks[0]=max;
            max= findTopScore(totalMarks,len-1);
        }

         return max;
    }

    public static void main(String[] args) {
        OakBridgeSchool oakBridgeSchool=new OakBridgeSchool();
        int [] math = {88, 89, 100, 70, 60, 80, 35, 3, 25, 56};
        int [] science = {80, 83, 99, 67, 56, 84, 38, 9, 32, 65};
        int [] english = {90, 98, 100, 65, 54, 82, 40, 13, 45, 67};
        int noOfSubjects = 3;
        int testtakensubjectmarks=100;
        String  studentNames[] = {"Michelle","Ram","Sri","Tina","Tom","Sam","Ria","Pam","Leena","Leo"};
        int [] rollNos = {102,109,101,103,104,108,110,105,106,107};
        int len=math.length;
      double averageScienceMarks =oakBridgeSchool.calculateAverageScienceMarks(science,len);
        double averageenglishMarks =oakBridgeSchool.calculateAverageEnglishMarks(english,len);
        double averagemathMarks =oakBridgeSchool.calculateAverageMathMarks(math,len);
        int[] totalmarks=oakBridgeSchool.calculateTotalMarks(math,science,english);
        int max =oakBridgeSchool.findTopScore(totalmarks,len);
        System.out.println("Top score in class "+max);
       System.out.println("Average science marks "+averageScienceMarks);
        System.out.println("Average math marks "+averagemathMarks);
       System.out.println("Average english marks "+averageenglishMarks);

        // Initialize the OakBridgeSchool class object

        // Call the appropriate methods and display the output

    }
}
