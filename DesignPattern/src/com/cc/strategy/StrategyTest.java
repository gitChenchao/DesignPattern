package com.cc.strategy;

public class StrategyTest {

	/**
	 * ����ģʽ������һϵ���㷨������ÿ���㷨��װ������ʹ���ǿ����໥�滻�����㷨�ı仯����Ӱ�쵽ʹ���㷨�Ŀͻ���
	 * ��Ҫ���һ���ӿڣ�Ϊһϵ��ʵ�����ṩͳһ�ķ��������ʵ����ʵ�ָýӿڣ����һ�������ࣨ���п��ޣ����ڸ����ࣩ���ṩ��������
	 * ����ģʽ�ľ���Ȩ���û���ϵͳ�����ṩ��ͬ�㷨��ʵ�֣���������ɾ���㷨���Ը����㷨����װ����ˣ�����ģʽ�������㷨����ϵͳ�У�
	 * �ⲿ�û�ֻ��Ҫ�������ĸ��㷨���ɡ�
	 */
	public static void main(String[] args) {
		String exp = "2-8";
		ICalculator cal = new Minus();
		int result = cal.calculate(exp);
		System.out.println(result);
	}

}