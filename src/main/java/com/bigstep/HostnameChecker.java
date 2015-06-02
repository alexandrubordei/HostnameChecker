package com.bigstep;

import java.net.InetAddress;

public class HostnameChecker
{
    public static void main( String[] args ) throws Exception
    {
	InetAddress me = InetAddress.getLocalHost();

	System.out.println("java.net.InetAddress.getLocalHost().getHostName() = "+ me.getHostName());
	System.out.println("java.net.InetAddress.getLocalHost().getCanonicalHostName() = "+ me.getCanonicalHostName());
	System.out.println("java.net.InetAddress.getLocalHost().getHostAddress() = "+ me.getHostAddress());
	
	byte[] meIPAddress = me.getAddress();

	InetAddress meReverse = InetAddress.getByAddress(me.getAddress());
	
	System.out.println("java.net.InetAddress.getByAddress(me.getaddress()).getHostName() [Reverse] = "+ meReverse.getHostName());
	System.out.println("java.net.InetAddress.getByAddress(me.getaddress()).getCanonicalHostName() [Reverse] = "+ meReverse.getCanonicalHostName());
		
	System.out.println("\nFor more information visit: http://docs.oracle.com/javase/7/docs/api/java/net/InetAddress.html"); 	
    }
}
