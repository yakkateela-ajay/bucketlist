package service;
//Create a class called ListOperations inside service package with the following methods.

import java.util.List;

import model.TouristPlace;

//Use lamda operations to sort.
//The return type of all the methods are list.



import java.util.*;
public class ListOperations{
	ArrayList<TouristPlace> l=new ArrayList<>();
	public List<TouristPlace> add(TouristPlace places){

		l.add(places);
		System.out.println(l);
		return l;


	}
	public List<TouristPlace> remove(TouristPlace places){
		l.remove(places);
		return l;
	}
	public Object sortByDestination(List<TouristPlace> places) {
		Comparator<TouristPlace> place = new Comparator<TouristPlace>() {
			public int compare(TouristPlace o1, TouristPlace o2) {
				return o1.getDestination().compareTo(o2.getDestination());
			}

		};
	return place;

	}




	public Object sortByRank(List<TouristPlace> places) {
		Comparator<TouristPlace> place = new Comparator<TouristPlace>() {
			public int compare(TouristPlace o1, TouristPlace o2) {
				return o1.getRank().compareTo(o2.getRank());
			}

		};
	return place;
	}

	public Object reset(List<TouristPlace> places) {
		places.clear();
		return places;
	} 
}