package gliderAIAssessment;

import java.util.HashMap;

public class LittlePigs {
	
	public int solve(int[] a ) {
		
		int t=0;		
		for(int x:a) {
			t+=x;
		}
		if(t%3 != 0) {
			return 0;
		}
		int m=t/3;
		int c=0;
		int ps=0;
		HashMap<Integer,Integer> pc = new HashMap<>();
		pc.put(0, 0);
		for(int i=0;i<a.length-1;i++) {
			ps+=a[i];
			if(ps == 2*m) {
				c+=pc.getOrDefault(m,0);
			}
			pc.put(ps, pc.getOrDefault(ps,0)+1);
		}
		
		return c;
		
	}
	public static void main(String[] args) {
		

	}

}
