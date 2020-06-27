package my2020;


	/**
	 * 可视化日历程序
	 * @author 86131
	 * 2020.6.17
	 */

	import java.text.DateFormat;
	import java.text.SimpleDateFormat;
	import java.text.ParseException;
	import java.util.Calendar;
	import java.util.Date;
	import java.util.GregorianCalendar;

	public class TestCanlendar1 {

		public static void main(String[] args) throws ParseException{
			
			//获得日期的相关元素
			String str = "2020-10-10";
			
			//获得时间对象
			DateFormat df = new SimpleDateFormat("yyyy-MM-dd"); //格式
			Date date = df.parse(str);
			 
			Calendar c = new GregorianCalendar();
			c.setTime(date);
			
			int day = c.get(Calendar.DAY_OF_MONTH);
			int days = c.getActualMaximum(Calendar.DATE);
			
			System.out.println("日\t一\t二\t三\t四\t五\t六");
			
			c.set(Calendar.DAY_OF_MONTH,1);
			
			//每月一号是星期几
			for(int i=0;i<c.get(Calendar.DAY_OF_WEEK)-1;i++){
				System.out.print("\t");
			}                                                                                                         
			
			
			//到星期六的时候换行
			for(int i=1;i<=days;i++){
		
				System.out.print(c.get(Calendar.DAY_OF_MONTH)+"\t");
				
				
				
				if(c.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY){
					System.out.println();
				}
				
				c.add(Calendar.DAY_OF_MONTH,1);
				
			}
		
		}
	}


