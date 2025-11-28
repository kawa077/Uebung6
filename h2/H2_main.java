package h2;

public class H2_main {
	public static void main(String[] args) {
		int a[]= {1,2,3};
		int b[]= {1,2,3};
		boolean result=compareArrays(a,b);
		System.out.println(result);
	}
	public static boolean compareArrays(int a[], int b[]) {
		if (a.length != b.length) {
			return false;
		}
		for (int i=0; i<a.length;i++) {
			if (a[i]!=b[i]) {
				return false;
			}
		}
		return true;
	}

}
