package com.XMPP.Activity.Launcher;

import android.support.v4.view.ViewPager.OnPageChangeListener;

public class LoginViewPagerListener implements OnPageChangeListener {
	/**
	 * ��־viewPager��������ĳ���
	 */
	private static final int LEFT_TO_RIGHT = 1;
	private static final int RIGHT_TO_LEFT = 2;
	/**
	 * preValue : ��¼���ڻ�����view��ƫ������ǰһ������
	 * proValue : ��¼���ڻ�����view��ƫ��������ǰ��
	 * pre_pro_choice : ������־��ǰviewƫ����Ӧ�ø�ֵ��preValue����proValue
	 * lock ����¼�Ƿ���Ҫ��������preValue �� proValue����ֻ���¼ǰ����ֵ�������жϷ���
	 * direction �� ��¼����1=�������ң�2=��������
	 */
	private float preValue = 0;
	private float proValue = 0;
	private int pre_pro_choice = 1;
	private int lock = 0;
	private int direction = 0;
	
	public int getDirection(){
		
		
		return 0;
	}
	
	@Override
	public void onPageScrollStateChanged(int arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onPageScrolled(int arg0, float arg1, int arg2) {
		// TODO Auto-generated method stub
		
		
		
		
	}

	@Override
	public void onPageSelected(int arg0) {
		// TODO Auto-generated method stub
		
	}

}
