package DriverFile;


public class AppTest {

	public static void main(String[] args) throws Throwable {
DriverScript ds=new DriverScript();
try
{
	ds.startTest();
}
catch(Exception e)
{
	e.printStackTrace();
}
	}

}