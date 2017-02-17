package com.cc.bridge;

public class BridgeTest {

	/**
	 * �Ž�ģʽ���ǰ�����������ʵ�ַֿ���ʹ���ǿ��Ը��Զ����ı仯���Žӵ������ǣ���������ʵ�ֻ����ʹ�ö��߿��Զ����仯��
	 * �����ǳ��õ�JDBC��DriverManagerһ��
	 * ��JDBC�����������ݿ��ʱ���ڸ������ݿ�֮������л�����������Ҫ��̫��Ĵ��룬����˿�����ö�
	 * ��ԭ�����JDBC�ṩͳһ�ӿڣ�ÿ�����ݿ��ṩ���Ե�ʵ�֣���һ���������ݿ������ĳ������ŽӾ�����
	 * ��ͨ����Bridge��ĵ��ã�ʵ���˶Խӿ�Sourceable��ʵ����SourceSub1��SourceSub2�ĵ���
	 */
	public static void main(String[] args) {
		Bridge bridge = new MyBridge();

		/* ���õ�һ������ */
		Sourceable source1 = new SourceSub1();
		bridge.setSource(source1);
		bridge.method();

		/* ���õڶ������� */
		Sourceable source2 = new SourceSub2();
		bridge.setSource(source2);
		bridge.method();
	}

}