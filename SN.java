package Node;
public class SN
{
	public int data;
	public SN next;
	
	
	SN()
	{
		this.next = null;
		this.data = 0;
	}
	
	SN(int d, SN n)
	{
		this.data = d;
		this.next = n;
	}
	
	public void Next(SN n)
	{
		this.next = n;
	}
	
	 public void Data(int d)
	{
		this.data = d;
	}

	public int Dataneeded()
	{
		
		return this.data;
	}
	
	SN Nextneeded()
	{
		return next;
		
	}
		
}



	
	



