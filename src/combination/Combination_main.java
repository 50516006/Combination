package combination;

import java.util.Scanner;


public class Combination_main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
Scanner scan = new Scanner(System.in);
System.out.println("s=");
int s = Integer.parseInt(scan.next());
System.out.println("r=");
int r =Integer.parseInt(scan.next());
Combination_lib clib =new Combination_lib(s,r);
System.out.println(s+"C"+r+"="+clib.getFuctrial(s,r));

	}

	

}
