import java.util.Scanner;
public class gradeCalci {
    public static void main(String[] args){
        int English,Science,Maths,CS,DS;
        float Total;
        float AvgPercentage;
        Scanner sub =new Scanner(System.in);
        System.out.print("Enter marks for English:");
        English=sub.nextInt();
        System.out.print("Enter marks for Science:");
        Science=sub.nextInt();
        System.out.print("Enter marks for Maths:");
        Maths=sub.nextInt();
        System.out.print("Enter marks for CS:");
        CS=sub.nextInt();
        System.out.print("Enter marks for DS:");
        DS=sub.nextInt();
        Total= (float) (English+Science+Maths+CS+DS);//Typecasting
        System.out.println("Total marks obtained by the student is " +Total);
        AvgPercentage=Total/5;//(Total/500)*100 IT IS SAME
        System.out.println("Average Percentage obtained by student is "+AvgPercentage);
        char Grade;
        if(AvgPercentage<=100 && AvgPercentage>=91) {
            Grade='A';
        }
        else if (AvgPercentage<=90 && AvgPercentage>=81) {
            Grade='B';
        }
        else if(AvgPercentage<=80 && AvgPercentage>=71) {
            Grade='C';
        } else if (AvgPercentage<=70 && AvgPercentage>=61) {
            Grade='D';
        } else if (AvgPercentage<=60 && AvgPercentage>=55) {
            Grade='E';
        }
        else {
            Grade='F';
            System.out.println("You need to reappear for exam");
        }
        System.out.println("Grade obtained by student is "+Grade);
    }
}
