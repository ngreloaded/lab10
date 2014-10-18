package seatAllocation;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class MeritOrderAdmission {
    List<VirtualProgramme> progList = new ArrayList<VirtualProgramme>();
    MeritList mlistGen;
    MeritList mlistOBC;
    MeritList mlistSC;
    MeritList mlistST;
    MeritList mlistGen_pd;
    MeritList mlistOBC_pd;
    MeritList mlistSC_pd;
    MeritList mlistST_pd;
    HashSet<Candidate> choiceList;
    
    MeritOrderAdmission(ArrayList<VirtualProgramme> a){
    	progList = a;
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
    
    public void update(List<Candidate> a){ // 
    	choiceList=(HashSet<Candidate>) a;
    }
    
   	public void Allot(){
   		
   	}
}
