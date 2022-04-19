public class Campane extends Thread {
    private String campane; 
    private int delay;


    public Campane(String c, int d) 
    {
	campane = c;
	delay = d;
    }


    public void run()
    {
	try {
	    while(true) 
            {
		System.out.print(campane + " ");
		Thread.sleep(delay); 
	    }
	} catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
