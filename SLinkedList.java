import Node.SN;
package LinkS;
public class SLinkedList
{
public SN h;

public SLinkedList()
{
	h = null;
}

public void AE(int le)
{
h = new SN(le, h);		
}

public int Element(int index)
{
	if(h == null)
	{
		return 0;
	}
	
	SN tmp = h;
	for(int i = 0; i < index;i++)
	{
		tmp = tmp.next;
	}
	
	return tmp.data;
}
																	
public int DeleteE(int index)
{
return 0;
}
 public void Tail()
 {
	SN ne = h; 
	while(ne != null)
	{
		ne = ne.next;
	}
 }
} 
