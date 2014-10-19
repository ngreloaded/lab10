package seatAllocation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class MeritOrderAdmission {
    HashMap<String,int[]> progList;
    MeritList mlistGen;
    MeritList mlistOBC;
    MeritList mlistSC;
    MeritList mlistST;
    MeritList mlistGen_pd;
    MeritList mlistOBC_pd;
    MeritList mlistSC_pd;
    MeritList mlistST_pd;
    HashMap<Candidate,String> choiceList;
    
    MeritOrderAdmission(ArrayList<VirtualProgramme> a){
    	for(int i=0; i<a.size(); i++){
    		progList.put(a.get(i).id, a.get(i).availableSeat);
    	}
    }
    
    public void createMeritList(ArrayList<Candidate> a){
    	mlistGen = new MeritList(a,0);
    	mlistOBC = new MeritList(a,1);
    	mlistSC = new MeritList(a,2);
    	mlistST = new MeritList(a,3);
    	mlistGen_pd = new MeritList(a,4);
    	mlistOBC_pd = new MeritList(a,5);
    	mlistSC_pd = new MeritList(a,6);
    	mlistST_pd = new MeritList(a,7);
    }
    
    public void update(ArrayList<Candidate> a){ // 
    	for(int i=0; i<a.size(); i++){
    		choiceList.put(a.get(i), a.get(i).preferenceList);
    	}
    }
    
   	public void Allot(){
   		for(int i=0; i<mlistGen.size(); i++){
   			Candidate c = mlistGen.element(i);
   			if(choiceList.containsKey(c)){
   				String str = choiceList.get(c);
   				while()
   			}
   		}
   	}
}
