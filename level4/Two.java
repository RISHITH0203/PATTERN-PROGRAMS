package kodnest.JavaPatternPrograms.level4;

public class Two {
public static void main(String[] args) {
	for(int i=1;i<=10;i++) {
		for(int j=1;j<=10;j++) {
			if(i==10||j==10) {
				System.out.print("* ");
			}
			else {
				System.out.print("  ");
			}
		}
		System.out.println();
	}
}
}
