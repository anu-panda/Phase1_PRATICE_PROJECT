package com.mphasis.work.project;

public class ThreadsCreation extends SyncDemo
{
 	public void run()
 	{
  		System.out.println("concurrent thread started running..");
}
 	public static void main( String args[] )
 	{
 		ThreadsCreation mt = new  ThreadsCreation();
  		mt.start();
 	}
}
