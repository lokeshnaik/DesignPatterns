package designpatternclass;
/**
 * Thread safe pattern:Using thread and synchronized keyword we slove this problem
 * @author Lokesh Naik
 * */

class ThreadSafePattern
{
	public static ThreadSafePattern object;
	private ThreadSafePattern()                            //private construtor is created

	{
		System.out.println("Hey Lokesh just be dedicated:");
	}
	public static ThreadSafePattern getInstance()        //returning the object
	{
		if(object==null)
		{
			synchronized(ThreadSafePattern.class)
			{
				if(object==null)
				{
					object=new ThreadSafePattern();
				}
			}
			
		}
		return object;
	}
}

public class ThreadSafeSingleton {

	public static void main(String[] args)
	{
	   Thread threadone=new Thread(new Runnable()    //one thread is created
			   {
			    public void run()
			     {
			    	 ThreadSafePattern object=ThreadSafePattern.getInstance();
			     }
			   });
	   Thread threadsecond=new Thread(new Runnable()   //one thread is created
	   {
	    public void run()
	     {
	    	 ThreadSafePattern object1=ThreadSafePattern.getInstance();
	     }
	   });
	   threadone.start();   //Calling the runnable method
	   threadsecond.start(); //Calling the runnable method
	}

}
