package com.Question1;

import java.util.Comparator;

public class ProductNameComparator implements Comparator { //sorting product by name
       public int  compare(Object o1,Object o2)
       {
    	   Product p1=(Product) o1;
    	   Product p2=(Product) o2;
    	   return p1.Pname.compareTo(p2.Pname);
       }
}