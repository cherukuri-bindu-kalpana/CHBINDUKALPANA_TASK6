package com.task6.EpamHT6;

public class Main 
{
	public static void main(String[] args) 
    {
        DataList<Integer> list = new DataList<Integer>();
        
        list.add(1);
        list.add(2);
        list.add(3);
        
        System.out.println("Elements in the list After adding into list");
        System.out.println(list);
         
        list.remove(2);
        
        System.out.println("Elements in the list after Removing some elements");
        System.out.println(list);

        System.out.println("Elements by Index");
        System.out.println( list.get(0) );
        System.out.println( list.get(1) );
 
        System.out.println("Size of the List");
        System.out.println(list.size());
    }

}
