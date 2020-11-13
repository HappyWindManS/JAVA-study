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
		//1.Clock的使用
		Clock clock = Clock.systemUTC();
		System.out.println("获取UTC时区转换的当前时间："+clock.instant());
		System.out.println("获取UTC失去转换的毫秒数："+clock.millis());
		//2.Duration的使用
		Duration d = Duration.ofDays(1);
		System.out.println("一天等于"+d.toHours()+"小时");
		System.out.println("一天等于"+d.toMinutes()+"分钟");
		System.out.println("一天等于"+d.toMillis()+"秒");
		//3.Instant的使用
		Instant instant = Instant.now();
		System.out.println("获取当前UTC时区的当前时间为："+instant);
		System.out.println("当前时间一个小时后的时间为："+instant.plusSeconds(3600));
		System.out.println("当前时间一个小时前的时间为："+instant.minusSeconds(3600));
		//4.LocalDate的使用
		LocalDate localdate = LocalDate.now();
		System.out.println("从默认时区的系统时钟获取当前日期："+localdate);
		//5.LocalTime的使用
		LocalTime localtime = LocalTime.now();
		System.out.println("从默认时区的系统时钟获取当前时间："+localtime);
		//6.LocalDateTime的使用
		LocalDateTime localdatetime = LocalDateTime.now();
		System.out.println("从默认时区的系统时钟获取日期、时间："+localdatetime);
		LocalDateTime times = localdatetime.plusDays(1).plusHours(3).plusMinutes(30);
		System.out.println("当前的日期、时间加上1天3小时30分之后："+times);
		//7.Year、YearMonth、MonthDay的使用
		Year year = Year.now();
		System.out.println("当前年份为："+year);
		YearMonth yearmonth = YearMonth.now();
		System.out.println("当前月份为："+yearmonth);
		MonthDay monthday = MonthDay.now();
		System.out.println("当前月日为："+monthday);
		//8.获取系统默认时区
		ZoneId zoneid = ZoneId.systemDefault();
		System.out.println("当前系统默认时区为："+zoneid);
	}
}
