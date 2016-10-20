package sample;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateI
{

	public DateI()
	{
	
	}	
	public DateI(long timeSinceUnix)
	{
		this.sinceUnix = timeSinceUnix;
		this.chrono = new Date(timeSinceUnix);
	}

	private Date chrono;
	private long sinceUnix;
	private int year;
	private int month;
	private int day;
	private int hour;
	private int minute; 

	public void setChrono(long sinceUnix)
	{
		chrono = new Date(sinceUnix);

	}
	public void setSinceUnix(long time)
	{
		this.sinceUnix = time;
	}
	public void setYear()
	{
		year = Integer.parseInt(new SimpleDateFormat("yyyy").format(chrono));
	}	
	public void setMonth()
	{
		month = Integer.parseInt(new SimpleDateFormat("MM").format(chrono));
	}
	public void setDay()
	{
		day = Integer.parseInt(new SimpleDateFormat("dd").format(chrono));
	}
	public void setHour()
	{
		hour = Integer.parseInt(new SimpleDateFormat("HH").format(chrono));
	}
	public void setMinute()
	{
		minute = Integer.parseInt(new SimpleDateFormat("mm").format(chrono));
	}	

	public long getSinceUnix()
	{
		return sinceUnix;
	}	
	public int getYear()
	{
		return year;
	}
	public int getMonth()
	{
		return month;
	}
	public int getDay()
	{
		return day;
	}
	public int getHour()
	{
		return hour;
	}
	public int getMinute()
	{
		return minute;
	}	
}