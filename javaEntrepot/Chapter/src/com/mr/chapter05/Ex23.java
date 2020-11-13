package com.mr.chapter05;

import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.MonthDay;
import java.time.Year;
import java.time.YearMonth;
import java.time.ZoneId;

public class Ex23 {
	public static void main(String[] args) {
		//1.Clock��ʹ��
		Clock clock = Clock.systemUTC();
		System.out.println("��ȡUTCʱ��ת���ĵ�ǰʱ�䣺"+clock.instant());
		System.out.println("��ȡUTCʧȥת���ĺ�������"+clock.millis());
		//2.Duration��ʹ��
		Duration d = Duration.ofDays(1);
		System.out.println("һ�����"+d.toHours()+"Сʱ");
		System.out.println("һ�����"+d.toMinutes()+"����");
		System.out.println("һ�����"+d.toMillis()+"��");
		//3.Instant��ʹ��
		Instant instant = Instant.now();
		System.out.println("��ȡ��ǰUTCʱ���ĵ�ǰʱ��Ϊ��"+instant);
		System.out.println("��ǰʱ��һ��Сʱ���ʱ��Ϊ��"+instant.plusSeconds(3600));
		System.out.println("��ǰʱ��һ��Сʱǰ��ʱ��Ϊ��"+instant.minusSeconds(3600));
		//4.LocalDate��ʹ��
		LocalDate localdate = LocalDate.now();
		System.out.println("��Ĭ��ʱ����ϵͳʱ�ӻ�ȡ��ǰ���ڣ�"+localdate);
		//5.LocalTime��ʹ��
		LocalTime localtime = LocalTime.now();
		System.out.println("��Ĭ��ʱ����ϵͳʱ�ӻ�ȡ��ǰʱ�䣺"+localtime);
		//6.LocalDateTime��ʹ��
		LocalDateTime localdatetime = LocalDateTime.now();
		System.out.println("��Ĭ��ʱ����ϵͳʱ�ӻ�ȡ���ڡ�ʱ�䣺"+localdatetime);
		LocalDateTime times = localdatetime.plusDays(1).plusHours(3).plusMinutes(30);
		System.out.println("��ǰ�����ڡ�ʱ�����1��3Сʱ30��֮��"+times);
		//7.Year��YearMonth��MonthDay��ʹ��
		Year year = Year.now();
		System.out.println("��ǰ���Ϊ��"+year);
		YearMonth yearmonth = YearMonth.now();
		System.out.println("��ǰ�·�Ϊ��"+yearmonth);
		MonthDay monthday = MonthDay.now();
		System.out.println("��ǰ����Ϊ��"+monthday);
		//8.��ȡϵͳĬ��ʱ��
		ZoneId zoneid = ZoneId.systemDefault();
		System.out.println("��ǰϵͳĬ��ʱ��Ϊ��"+zoneid);
	}
}
