
public class Marks{
    public static int mark1 = 20;
    public static int mark2 = 92;
    public static int mark3 = 56;
    public static int mark4 = 18;
    public static void main(String[] str){
        int totalSum = mark1 + mark2 + mark3 + mark4;
        int averageMarks = totalSum/4;
        System.out.println(mark1+" "+ mark2+" "+ mark3+" "+ mark4);
        System.out.println("Total Sum is"+ " "+totalSum);
        System.out.println("The Average is"+ " "+averageMarks);
    }
}