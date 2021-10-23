package jdbc.task.six;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.graphbuilder.struc.LinkedList;

public class PhoneDirectory {
	
	HashMap map=new HashMap();
	
	Map.Entry map1;
	Collection c;
	Iterator it,it1;
	Person p;
	Set s;
	BookEntry b,b1;
	boolean check;
	PhoneNumber pn;
	
	
	public boolean doEntry(String fname,String lname,int acode,int number) {
		p=new Person(fname, lname);
		pn=new PhoneNumber(acode, number);
		b=new BookEntry(p, pn);
		check=true;
		s=map.entrySet();
		it=s.iterator();
		
		
		while(it.hasNext()) {
			map1=(Map.Entry)it.next();
			b1=(BookEntry)map1.getValue();
			if(b1.pn.number==number) {
				check=false;
				break;
			}
		}
		if(check) {
			map.put(p, b);
		}
		return check;
	}
	
	public void display() {
		s=map.entrySet();
		it=s.iterator();
		System.out.println("\n");
		System.out.printf("%-15s%-15s%-15s%-15s\n","First name","Last name","Areacode","Phone number");
		while(it.hasNext()) {
			map1=(Map.Entry)it.next();
			b=(BookEntry)map1.getValue();
			System.out.printf("%-15s%-15s%-15s%-15s",b.p.fname,b.p.lname,b.pn.acode,b.pn.number);
			System.out.println();
			
		}
		System.out.println("\n");
		}
			
		public int[] findNumber(String fname) {
			int[] a=new int[map.size()];
			int i=0;
			s=map.entrySet();
			it=s.iterator();
			
			while(it.hasNext()) {
				map1=(Map.Entry)it.next();
				b=(BookEntry)map1.getValue();
				if(b.p.fname.equals(fname)) {
					a[i]=b.pn.number;
					i++;
				}
			}
			return a;
		}
			
		public String findName(int number) {
			String st=" ";
			s=map.entrySet();
			it=s.iterator();
			
			
			while(it.hasNext()) {
				map1=(Map.Entry)it.next();
				b=(BookEntry)map1.getValue();
				if(b.pn.number==number) {
					st=b.p.fname;
				}
			}
			return st;
		}
			
			
		public void sort() {
			s=map.entrySet();
			LinkedList lt=(LinkedList)s;
	//	Collections.sort();
		}
		
}
