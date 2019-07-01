package com.cjs.app;



public class HousingMortgageView {

	public static void money() {
		// 1 欢迎语
		System.out.println("欢迎来到陈氏房贷计算器");
		// 2 获取用户输入
		int howMoney = getLoans();
		// 2.1 获取利率
		double howLoans = getInterest();
		// 2.3获取还款月数
		int mon = getCountMonth();
		// 3 调用业务模型获得业务结果
		double repay = HousingMortgageModel.mortgageCalculator(howMoney, howLoans, mon);
		// 4 展示业务结果
		System.out.println("你每个月应该还" + repay + "元");
		// 4.1 展示成果结果
		// 4.2 展示错误结果
	}

	private static int getLoans() {
		while (true) {
			String a = DuQuUtil.readLine("贷款金额:", null);
			try {
				int howMuch = IntChange.parseInt(a, 10);
				if (howMuch > 0) {
					return howMuch;
				}
			} catch (IllegalArgumentException e) {
				System.out.println("输入错误，请重新输入");
			}
		}
	}

	private static double getInterest() {
		double howMany=0;
		while (true) {
			String b = DuQuUtil.readDouble("利息(数字部分):", -1);
			try {
				 howMany = DoubleChange.zhuanHuan(b);
				if (howMany > 0) {
					return howMany;
				}
			} catch (IllegalArgumentException e) {
				System.out.println("输入错误，请重新输入");
			}
		}
	}

	private static int getCountMonth() {
		while (true) {
			String c = DuQuUtil.readDouble("还款月数:", -1);
			try {
				int countmonth = IntChange.parseInt(c, 10);
				if (countmonth > 0) {
					return countmonth;
				}
			} catch (IllegalArgumentException e) {
				System.out.println("输入错误，请重新输入");
			}
		}

	}

}
