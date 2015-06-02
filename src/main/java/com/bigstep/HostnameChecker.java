package com.bigstep;

import java.net.InetAddress;

public class HostnameChecker
{ 
 
    public static void main( String[] args ) throws Exception
    {
	InetAddress me = InetAddress.getLocalHost();

	System.out.println("java.net.InetAddress.getLocalHost().getHostName() = "+ me.getHostName());
	System.out.print("java.net.InetAddress.getLocalHost().getCanonicalHostName() = "+ me.getCanonicalHostName());

	if(!me.getHostName().equals(me.getCanonicalHostName()))
		System.out.println(red(" Not OK!"));
	else
		System.out.println(green(" OK!"));


	
	byte[] meIPAddress = me.getAddress();
	InetAddress meReverse = InetAddress.getByAddress(me.getAddress());
	
	System.out.println("java.net.InetAddress.getLocalHost().getHostAddress() = "+ me.getHostAddress());
	System.out.print("java.net.InetAddress.getByAddress(me.getaddress()).getHostName() [Reverse] = "+ meReverse.getHostName());


	if(!meReverse.getHostName().equals(me.getHostName()))
		System.out.println(red(" Not OK!"));
	else
		System.out.println(green(" OK!"));



	System.out.print("java.net.InetAddress.getByAddress(me.getaddress()).getCanonicalHostName() [Reverse] = "+ meReverse.getCanonicalHostName());

	if(!meReverse.getHostName().equals(meReverse.getCanonicalHostName()))
		System.out.println(red(" Not OK!"));
	else
		System.out.println(green(" OK!"));


	System.out.println("\nFor more information visit: http://docs.oracle.com/javase/7/docs/api/java/net/InetAddress.html"); 	
    }
	
    public static String red(String text) 
    {
	return "\u001B[31m"+text+"\u001B[0m";
    }

    public static String green(String text) 
    {
	return "\u001B[32m"+text+"\u001B[0m";
    }
}
