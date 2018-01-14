package javalearningday01;

/**
 * Java基本数据类型
 * @author 小川94
 * @date 2018年1月14日
 */
public class DataType {

	public static void main(String[] args) {
		DataType dt = new DataType();
		dt.viewChar();
		dt.viewByte();
		dt.viewShort();
		dt.viewLong();
		dt.viewFloat();
		dt.viewDouble();
		dt.viewBoolean();
	}
	
	/**
	 * 字符型：char，占两个字节，16位
	 */
	public void viewChar(){
		System.out.println("=========== 查看char方法开始 =============");
		// Character是char的包装类
		char charMaxValue = Character.MAX_VALUE;
		System.out.println((int)charMaxValue); // 65535
		char charMinValue = Character.MIN_VALUE;
		System.out.println((int)charMinValue); // 0
		// char和int之间的转换
		char charNumber = 'A';
		System.out.println((int)charNumber); // 65
		char charNumber2 = 65;
		System.out.println(charNumber2); // A
		// 查看 中 对应Unicode编码值
		char charNumber3 = '中';
		System.out.println((int)charNumber3); // 20013
		System.out.println("=========== 查看char方法结束 =============");
	}
	
	/**
	 * 整型：byte，占1个字节，8位
	 * 1 byte (1个字节) = 8 bit (8个位，8个二进制编码)
	 * 八位二进制                  1   1  1  1  1  1  1  1
	 * 八位二进制对应整数 128 64 32 16  8  4  2  1
	 * 为0 二进制则是0000 0000
	 * 八位二进制表示：1     +    1     =   2  
	 *         00000001 + 00000001 = 00000002 = 00000010  这就是逢二进一
	 */
	public void viewByte(){
		System.out.println("=========== 查看byte方法开始 =============");
		// Byte是byte的包装类
		byte byteMaxValue = Byte.MAX_VALUE;
		System.out.println(byteMaxValue); // byteMaxValue = 127
		byte byteMinValue = Byte.MIN_VALUE;
		System.out.println(byteMinValue); // byteMinValue = -128
		System.out.println(Integer.toBinaryString(byteMinValue));
		// 将3转为8位二进制，0000 0011，
		System.out.println(Integer.toBinaryString(3)); //11
		System.out.println("=========== 查看byte方法结束 =============");
	}
	
	/**
	 * 整型：short，占2个字节，16位
	 */
	public void viewShort(){
		System.out.println("=========== 查看short方法开始 =============");
		// Short是short的包装类
		short shortMaxValue = Short.MAX_VALUE; 
		System.out.println(shortMaxValue); // 32767
		short shortMinValue = Short.MIN_VALUE;
		System.out.println(shortMinValue); // -32768
		short shortNumber = 323+4343;
		System.out.println(shortNumber); // 4666
		System.out.println("=========== 查看short方法结束 =============");
	}
	
	/**
	 * 整型：int，4字节，32位
	 */
	public void viewInt(){
		System.out.println("=========== 查看int方法开始 =============");
		// 查看int的最大、最小值，Integer是int的包装类
		int maxIntNumber = Integer.MAX_VALUE;
		System.out.println(maxIntNumber); // maxIntNumber = 2147483647
		int minIntNumber = Integer.MIN_VALUE;
		System.out.println(minIntNumber); // minIntNumber = -2147483648
		// 值溢出，计算时合理估算值大小，取合适范围的数据类型
		int overFlow = 1299999999+1299999999;
		System.out.println(overFlow); // overFlow = -1694967298
		// 将int换成long类型
		long suitRange = 1299999999L+1299999999L;
		System.out.println(suitRange); // suitRange = 2599999998
		// 1299999999字面量还是int，1299999999+1299999999算出来的值还是int类型
		long suitRange2 = 1299999999+1299999999;
		System.out.println(suitRange2); // suitRange2 = -1694967298
		// 1299999999L的字面量是long，1299999999的字面量是int，两者相加，取占位大的一方为结果值的字面量
		long suitRange3 = 1299999999L+1299999999;
		System.out.println(suitRange3); // suitRange3 = 2599999998
		// 字符串和int之间的转换，只能用于纯数字、合适范围值之间的转换
		String intStr = "1278098";
		int intNumber = Integer.parseInt(intStr);
		System.out.println(intNumber); // intNumber = 1278098
		System.out.println("=========== 查看int方法结束 =============");
	}
	
	/**
	 * 整型：long，占8个字节，64位
	 * 在赋值时，需要在数值尾部加一个l(小写L)或者L
	 */
	public void viewLong(){
		System.out.println("=========== 查看long方法开始 =============");
		// Long是long类型的包装类
		long longMaxValue = Long.MAX_VALUE;
		System.out.println(longMaxValue); // 9223372036854775807
		long longMinValue = Long.MIN_VALUE;
		System.out.println(longMinValue); // -9223372036854775808
		long longNumber = 3999+7328328323728332L;
		System.out.println(longNumber); // 7328328323732331
		System.out.println("=========== 查看long方法结束 =============");
	}
	
	/**
	 * 浮点型：float，占4个字节，也称为单精度类型，32位
	 * 在赋值时，需要在数值尾部加一个f或者F
	 */
	public void viewFloat(){
		System.out.println("=========== 查看float方法开始 =============");
		// float的最大值、最小值，Float是float的包装类
		float floatMaxValue = Float.MAX_VALUE; 
		System.out.println(floatMaxValue); // floatMaxValue = 3.4028235E38 
		float foatMinValue = Float.MIN_VALUE;
		System.out.println(foatMinValue); // foatMinValue = 1.4E-45
		float floatNumber = 3.14f+3;
		System.out.println(floatNumber);
		System.out.println("=========== 查看float方法结束 =============");
	}
	
	/**
	 * 浮点型：double，占8个字节，也称为双精度类型，64位
	 * 在赋值时，需要在数值尾部加一个d或者D
	 */
	public void viewDouble(){
		System.out.println("=========== 查看double方法开始 =============");
		// double的最大值、最小值，Double是double的包装类
		double doubleMaxValue = Double.MAX_VALUE;
		System.out.println(doubleMaxValue); // doubleMaxValue = 1.7976931348623157E308
		double doubleMinValue = Double.MIN_VALUE;
		System.out.println(doubleMinValue); // doubleMinValue = 4.9E-324
		double doubleNum = 3.1d+3.2D;
		System.out.println(doubleNum); // doubleNum = 6.300000000000001
		System.out.println("=========== 查看double方法结束 =============");
	}
	
	/**
	 * 布尔型：boolean，只有true、false两个值，用于逻辑判断
	 */
	public void viewBoolean(){
		System.out.println("=========== 查看boolean方法开始 =============");
		boolean boo = true;
		boolean boo2 = false;
		// Boolean是boolean的包装类
		boolean boo3 = Boolean.TRUE;
		boolean boo4 = Boolean.FALSE;
		System.out.println(boo == boo3); // true
		System.out.println(boo2 == boo4); // true
		boolean boo5 = 2 > 3; 
		System.out.println(boo5); // boo3 = false
		System.out.println("=========== 查看boolean方法结束 =============");
	}
	
}
