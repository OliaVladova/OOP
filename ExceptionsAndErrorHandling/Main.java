package ExceptionsAndErrorHandling;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NumberFormatException{
        Scanner scanner = new Scanner(System.in);

        String[] range = scanner.nextLine().split("\\s+");
        int startRange = Integer.parseInt(range[0]);
        int endRange = Integer.parseInt(range[1]);

        System.out.printf("Range: [%d...%d]\n",startRange,endRange);
        int validNum = validateNumber(startRange,endRange,scanner);
        System.out.println("Valid number: "+validNum);



    }
    public static int validateNumber(int start,int end,Scanner scanner){
        for (;;){
            String input = scanner.nextLine();
            try {
                int num = Integer.parseInt(input);
                if (num>=start&&num<=end){
                    return num;
                }else {
                    System.out.printf("Invalid number: %d\n",num);
                }
            }catch (Exception ex){
                System.out.printf("Invalid number: %s\n",input);
            }

        }
    }
}
