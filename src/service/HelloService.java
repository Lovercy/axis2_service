package service;

import java.text.SimpleDateFormat;
import java.util.Date;

public class HelloService {

	public String sayHello(String name){
		return "Hello,my name is "+name;
	}
	public void nowTime(Date date){
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		System.out.println("what is time:"+sdf.format(date));
	}
}
