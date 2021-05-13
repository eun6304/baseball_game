import java.util.Random;
import java.util.Scanner;

public class baseball_game {
	public static void main(String[] args) {
	 Random rnd = new Random();
     Scanner sc = new Scanner(System.in);
     
     int []nums = new int[3];
     int []inputNums = new int[3];
     boolean []checks = new boolean[3];
     boolean []strike = new boolean[3];
     
     do {
        for (int i = 0; i < nums.length; i++)
           nums[i] = rnd.nextInt(20) + 1;
     } while(nums[0] == nums[1] || nums[0] == nums[2] || nums[1] == nums[2]);


     System.out.println(nums[0]);
     System.out.println(nums[1]);
     System.out.println(nums[2]);
     
     while (true) {
        int cntBall = 0;
        int cntStrike = 0;
        
        for (int i = 0; i < nums.length; i++) {
           System.out.print(i + " 번째 수 입력 : ");
           inputNums[i] = sc.nextInt();
           strike[i] = inputNums[i] == nums[i];
           if (strike[i]) {
              cntStrike++;
           }
        }
        
        for (int i = 0; i < nums.length; i++) {
           for (int j = 0; j < nums.length; j++) {
              
              if (nums[i] == inputNums[j] && !strike[i]) {
                 cntBall++;
                 break;
              }
           }

        }
        
        System.out.println("S : " + cntStrike + "\n" + "B : " + cntBall);
        
        
     }

}
}

