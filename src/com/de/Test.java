package com.de;

import Jama.Matrix;
import Jama.SingularValueDecomposition;

public class Test {

	/**
	 * @param args
	 */
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
////		double[][] d = {{1,	0.997775975,	0.993204534,	0.996895089,	0.994722171,	0.973093951,	0.935903394,	0.977458567,	0.997957264,	0.997775975},
////		{0.997775975,	1,	0.998748377, 0.999926399,	0.999346952,	0.986180741,	0.956781326,	0.989281589,	0.999996135,	1},
////		{0.993204534,	0.998748377,	1,	0.999281476,	0.999903368,	0.993204534,	0.969906366,	0.99532972,	0.998605544,	0.998748377},
////		{0.996895089,	0.999926399,	0.999281476,	1,	0.99971173,	0.988106152,	0.960167575,	0.990972327,	0.999888803,	0.999926399},
////		{0.994722171,	0.999346952,	0.999903368,	0.99971173,	1,	0.991497564,	0.966485369,	0.993895674,	0.999242658,	0.999346952},
////		{0.973093951,	0.986180741,	0.993204534,	0.988106152,	0.991497564,	1,	0.991530284,	0.999799635,	0.985719592,	0.986180741},
////		{0.935903394,	0.956781326,	0.969906366,	0.960167575,	0.966485369,	0.991530284,	1,	0.988746547,	0.955987173,0.956781326},
////		{0.977458567,	0.989281589,	0.99532972,	0.990972327,	0.993895674,	0.999799635,	0.988746547,1,	0.988874032,	0.989281589},
////		{0.997957264,	0.999996135,	0.998605544,	0.999888803,	0.999242658,	0.985719592,	0.955987173,	0.988874032,	1,	0.999996135},
////		{0.997775975,	1,	0.998748377,	0.999926399,	0.999346952,	0.986180741,	0.956781326,	0.989281589,	0.999996135,	1}};
//   
//		
//		double [][] d={{1,-1},{0,1}};
//		Matrix m =new Matrix(d);
//		//m.inverse();
//		SingularValueDecomposition n = m.svd();
//		Matrix U=n.getU();
//		Matrix V=n.getV();
//		Matrix sga=n.getS();
//		Matrix sga_inv = sga.inverse();
//		Matrix temp= new Matrix(m.getRowDimension(),m.getColumnDimension());
//		for(int i=0;i<sga_inv.getRowDimension();i++){
//			for(int j=0;j<sga_inv.getColumnDimension();j++){
//				temp.set(i, j, sga_inv.get(i, j));
//			}
//		}
//		Matrix inv =V.times(temp).times(U.transpose());
//		for(int i=0;i<inv.getRowDimension();i++){
//			for(int j=0;j<inv.getColumnDimension();j++){
//				System.out.print(inv.get(i, j)+"\t");
//			}
//			System.out.println();
//		}
//		
//	}

}