package com.amazon.qa.base;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListIterations {

	public static void main(String[] args) {
		
		ArrayList<String> tvSeries= new ArrayList<String>(); 
		
		
		tvSeries.add("GOT");
		tvSeries.add("Breakin Bad");
		tvSeries.add("Prison Break");
		tvSeries.add("Dexter");
		tvSeries.add("Mentalist");
		tvSeries.add("Vikings");
		System.out.println("***********************<First>************************");
		//1st method is to iterating using for each using lambada expression 
		tvSeries.forEach(tvshows -> {
			System.out.println(tvshows);
		});
		
		System.out.println("***********************<Second>************************");
		//2nd option is using Iterator
		Iterator<String> it=tvSeries.listIterator();
		
		while(it.hasNext()) {
			String Shows =it.next();
			System.out.println(Shows);
			
			
		}
		System.out.println("***********************<Third >************************");
		//3rd option is 
		for(int i=0; i<tvSeries.size(); i++) {
			System.out.println(tvSeries.get(i));
			
		}
		System.out.println("***********************<forth >************************");
		//4th option is using for loop
		for(String Shows: tvSeries) {
			System.out.println(Shows);
		
		}
		System.out.println("***********************<Fifth >************************");
		
		ListIterator<String> tvSeriesItertor =tvSeries.listIterator(tvSeries.size());
		while(tvSeriesItertor.hasPrevious()) {
			String show =tvSeriesItertor.previous();
		System.out.println(show);
		
		}
		}
				
	}
	
	
	

