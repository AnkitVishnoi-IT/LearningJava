//package ProgramsForInterviews;
//
//import java.util.Scanner;
//
//public class ArrangeInDescendingOrder {
//
////int i;
////	double[] arrayOfNum = { 2.0, 4, 8, 5.2, 210.0, 150, 67.38 };
////	double[] descendingarray = new double[arrayOfNum.length];
////	double minnum;
////
////	void descendingorder() {
////		double maxnum = arrayOfNum[0];
////
////		for (i = 0; i < arrayOfNum.length; i++) {
////
////			if (arrayOfNum[i] > maxnum) {
////				minnum = maxnum;
////				maxnum = arrayOfNum[i];
////			}
////			
////			for (int j = 0; j < arrayOfNum.length; j++) {
////				descendingarray[j] = minnum;
////			}
////
////			
////		System.out.println("***");
////	}
////}
//	Scanner sc = new Scanner(System.in);
//	int i, j, k;
//
//	double arrayOfNum[];
//
//	void descendingorderarray() {
//		System.out.print("Enter the number of elements in the array : ");
//		j = sc.nextInt();
//		double arrayOfNum[] = new double[j];
//
//		for (i = 0; i < arrayOfNum.length; i++) {
//			System.out.println("Enter the element for index " + i);
//			arrayOfNum[i] = sc.nextDouble();
//			if (arrayOfNum[i]>arrayOfNum[i++]) {
//				arrayOfNum[k]=arrayOfNum[i];
//				arrayOfNum[i]=arrayOfNum[i++];
//				arrayOfNum[i++]=arrayOfNum[k];
//			}
//		}
//		System.out.print("Elements of the array are : [");
//		for (int i = 0; i < arrayOfNum.length; i++) {
//
//			System.out.print(arrayOfNum[i]);
//			if (i < (arrayOfNum.length - 1))
//				System.out.print(", ");
//		}
//		System.out.print("]");
//
//	}
//}