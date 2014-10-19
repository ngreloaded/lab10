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
    HashMap<Candidate,Candidate> choiceList;
    ArrayList<Candidate> candidates;
    
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
    	candidates = a;
    }
    
    public void update(ArrayList<Candidate> a){ // 
    	for(int i=0; i<a.size(); i++){
    		choiceList.put(a.get(i), a.get(i));
    	}
    }
    
   	public void allot(){
   		for(int i=0; i<mlistGen.size(); i++){ // 7 similar structures needed.
   			Candidate c = mlistGen.element(i);
   			if(choiceList.containsKey(c)){
   				Candidate c1 = choiceList.get(c);
   				if(c1.allocated) continue;
   				String str = c1.preferenceList;
   				int a = str.indexOf('_');
   				while(a>-1){
   					int a1 = progList.get(str.substring(0,a))[0];// last 0 for gen category.
   					if(a1>0){
   						a1--;
   						c1.allocated = true;
   						c1.bid = str.substring(0,a);
   						break;
   					}
   					str.substring(a+1);
   					a = str.indexOf('_');
   					if (a==-1){
   						c1.allocated = false;
   					}
   				}
   			}
   		}
   	}
   	
   	public void print(){
   		for(int i=0; i<candidates.size(); i++){
   			System.out.println(candidates.get(i).uid + " , " + "candidates.bid"); // risky, depends wgether pass by reference works or not
   		}
   	}
}
