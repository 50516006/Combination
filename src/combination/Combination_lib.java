package combination;

public class Combination_lib{
	int y=1;
	private int s,r;
	public Combination_lib(int s, int r) {
		// TODO 自動生成されたコンストラクター・スタブ
this.s=s;
this.r=r;
	}
	public int getFuctrial(int s, int  r ){
	if (r*(r-s)==0){
		return 1;
	}
		for (int x=s;x>=r;x--){
		y=y*x;	
		}
		for (int x=r;x>=1;x--){
			y=y/x;	
			}
		return y;
	}
	

}
