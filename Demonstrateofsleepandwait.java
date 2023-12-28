package com.mphasis.work.project;

public class Demonstrateofsleepandwait {
	    private static Object LOCK = new Object();
	    public static void main(String args[]) throws InterruptedException
	    {
	        SyncDemo.sleep(1000);
	        System.out.println("Thread '" + SyncDemo.currentThread().getName() + "' is woken after sleeping for 1 second");
	        synchronized (LOCK) 
	        {
	            LOCK.wait(1000);
	            System.out.println("Object '" + LOCK + "' is woken after" + " waiting for 1 second");
	        }
	    }
	}