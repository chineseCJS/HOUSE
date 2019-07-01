package com.cjs.app;

public class HousingMortgageModel {
     /**
      * 通过贷款金额、还款月数和利率计算每月还款金额
      * @param loans 贷款金额
      * @param interest 利率
      * @param mon 还款月数
      * @return 每月还款金额
      */
	 public static double mortgageCalculator(int loans,double interest,int mon) {
		 //【贷款本金×月利率×（1+月利率）^还款月数】÷【（1+月利率）^还款月数-1】
		 //验证参数
		 double in=interest/100;
		 double inn=in+1;
		 return loans*in*Math.pow(inn,mon)/Math.pow(inn,mon-1);
	 }


}
