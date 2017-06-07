package com.hcl.util;

import com.hcl.dto.MyTable;

public class ReadTable {
	public static void main(String args[])
	{
		String id="1";
		readTable(id);
	}
	
	public static void readTable(String id)
	{
		MyTable tableRecord=setData(id);
		System.out.println(tableRecord.toString());
	}
	public static MyTable setData(String id)
	{
		MyTable myTable=new MyTable();
		myTable.setId("1");
        myTable.setAddress("Plano,TX");		
        myTable.setName("vinod");
        myTable.setPhone("000-000-0000");
        return myTable;
	}

}
