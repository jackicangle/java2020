package my2020;


	/**
	 * ���ӻ���������
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
			
			//������ڵ����Ԫ��
			String str = "2020-10-10";
			
			//���ʱ�����
			DateFormat df = new SimpleDateFormat("yyyy-MM-dd"); //��ʽ
			Date date = df.parse(str);
			 
			Calendar c = new GregorianCalendar();
			c.setTime(date);
			
			int day = c.get(Calendar.DAY_OF_MONTH);
			int days = c.getActualMaximum(Calendar.DATE);
			
			System.out.println("��\tһ\t��\t��\t��\t��\t��");
			
			c.set(Calendar.DAY_OF_MONTH,1);
			
			//ÿ��һ�������ڼ�
			for(int i=0;i<c.get(Calendar.DAY_OF_WEEK)-1;i++){
				System.out.print("\t");
			}                                                                                                         
			
			
			//����������ʱ����
			for(int i=1;i<=days;i++){
		
				System.out.print(c.get(Calendar.DAY_OF_MONTH)+"\t");
				
				
				
				if(c.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY){
					System.out.println();
				}
				
				c.add(Calendar.DAY_OF_MONTH,1);
				
			}
		
		}
	}


