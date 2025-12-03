package intermediatary_ops;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Custome_56 {

	public static void main(String[] args) {
		
		Business business1=new Business(1,"SaniKa Entr.",67897.56,"Itery");
		
		Business business2=new Business(2,"Atharva Entr." ,56.09,"Travels");
		
		Business business3=new Business(3,"Namrta Fisheries",8740.89,"Sea");
		
        Business business4=new Business(4,"Ghatage Hospitals" ,90900.09,"Travels");
		
		Business business5=new Business(5,"Padmaja Pearls",909.09,"Travels");
		
	
		List<Business> list=new ArrayList<Business>();
		
		list.add(business5);
		list.add(business4);
		list.add(business3);
		list.add(business2);
		list.add(business1);
		
		
		list.stream()
		.sorted()
		.distinct()
		.forEach((i)->{
			System.out.println(i.turnover+i.name+"  "+i.dept);
		});


		
		
		System.out.println(business4.dept.equals(business5.dept));
		
		System.out.println(business4.dept.hashCode());
		System.out.println(business5.dept.hashCode());
		
	//	System.out.println();
		
		
		
    //System.out.println(business4.dept.equals(business5.dept));	
    
    
    
    
//    System.out.println("[" + business2.dept + "]");
//    System.out.println("[" + business4.dept + "]");
//    System.out.println("[" + business5.dept + "]");
//		System.out.println(business2.dept.equals(business4.dept));
//		System.out.println(business2.dept.hashCode());
//		System.out.println(business4.dept.hashCode());
//		System.out.println(business5.dept.hashCode());
	}

}

class  Business implements Comparable<Business>
{
	int id;
	String name;
	double turnover;
	String dept;
	@Override
	public String toString() {
		return "Business [id=" + id + ", name=" + name + ", turnover=" + turnover + ", dept=" + dept + "]";
	}
	public Business(int id, String name, double turnover, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.turnover = turnover;
		this.dept = dept;
	}
	@Override
	public boolean equals(Object o) {
		
		
	    Business b = (Business) o;
	    
	    return  this.dept.equals(b.dept);
	}

	@Override
	public int hashCode() {
		
	    return  dept.hashCode();
	}

	@Override
	public int compareTo(Business o) {
	    return  Double.compare(o.turnover,this.turnover);
	}

}

class TurnComparator implements Comparator<Business>
{

	@Override
	public int compare(Business o1, Business o2) {

                  return Double.compare(o2.turnover, o1.turnover);
	}
	
}
