package xuetang9.L1v4.ninth.Demo1;
/**
 * 
 * @author A二狗
 * @desc 水仙花数类
 */
public class NarcissisticNumber {
	/**
	 * @desc 判断一个数是否满足水仙花数
	 * @param num 输入的数字
	 * @return
	 */
	private boolean isNarcissisticNumber(int num) {
		boolean isNarcissisticNumber = false;//是否是水仙花数
		if(num >= 100 && num <= 999) {//首先判断是否是三位数（结合上下文的话，这里其实没有必要）
			int gewei = num % 10;//个位
			int shiwei = num / 10 % 10;//十位
			int baiwei = num / 100;//百位
			isNarcissisticNumber = num == (Math.pow(gewei, 3) + Math.pow(shiwei, 3) + Math.pow(baiwei, 3)) ? true : false;
		}
		return isNarcissisticNumber;
	}
	/**
	 * @desc 逻辑方法
	 */
	public void logic() {
		System.out.println("输出水仙花数");
		for(int num = 100; num <= 999; num ++) {
			if(isNarcissisticNumber(num)) {
				System.out.println(num);
			}
		}
	}
}
