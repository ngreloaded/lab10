package seatAllocation;

import java.util.ArrayList;
import java.util.List;

public class Candidate {
	String uid;
	String bid; //id of allocated branch
	boolean allocated; //seat allocated or not
	char ctg;
	boolean pd;
	boolean ds;
	boolean indian;
	List<String> choice = new ArrayList<String>(); //implementation left
	Candidate (String id, char ctg1, boolean pd1, boolean ds1, boolean indian1){
		if(true) uid = id; //check that id is unique
		ctg = ctg1;
		pd = pd1;
		ds = ds1;
		indian = indian1;
	}
	String get_uid(){
		return uid;
	}
	char get_ctg(){
		return ctg;
	}
	boolean get_pd(){
		return pd;
	}
	boolean get_ds(){
		return ds;
	}
	boolean get_nationality(){
		return indian;
	}
	void add(){ //add pref
		
	}
	// function to find next virtual programme
	
	// pointer reset. needed at end of phase
}
