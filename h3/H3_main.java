package h3;

public class H3_main {
	public static void main (String[] args) {
		int a[]= {1,2,3};
		int b[]= {1,3,2};
		
		boolean result=compareArraysVal(a,b);
		System.out.println(result);
	}
	public static boolean compareArraysVal(int a[], int b[]) {
		if (a.length != b.length) {
			return false;
		}
		for (int i=0; i<a.length; i++) {
			int countA=0;
			int countB=0;
			for (int j=0; j<a.length; j++) {
				if (a[i]==a[j]) {
					countA ++;
				}
				if (a[i]==b[j]) {
					countB ++;
				}	
			}
			if (countA!=countB) {
				return false;
			}	
		}
		return true;
	}

}
