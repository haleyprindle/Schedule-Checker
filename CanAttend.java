//Haley Prindle
//2/10/26

import java.util.ArrayList;

public class CanAttend {

	//precondition: meetings.getEnd() > meetings.getStart(); 
	//postcondition: returns if both meetings can or can't be attended. Answers if the meetings overlap.
	public static boolean canAttend(ArrayList<MeetingInterval> meetings) {
		//your implementation here
        
            ArrayList<MeetingInterval> meet = new ArrayList<MeetingInterval>();
           for (int i =0; i< meetings.length; i++){
            for (int j = i+1; j<meetings.length; j++){
            meet.add( new MeetingInterval (meetings[i], meetings[j]));
            }
                
          }
         
        for(MeetingInterval meetings: meeting){
            int start = meetings.getStart();
            int end = meetings.getEnd();
            
         if ((meetings.getStart()<start && meetings.getEnd()<end && meetings.getEnd()<start||meetings.getStart()>start && meetings.getEnd()>end && meetings.getStart()>end))
            {
                return true;
            }    
        }
        

		System.out.println(meetings);
		return false; //replace me with actual logic please!
	}
	public static void main(String[] args) {
		ArrayList<MeetingInterval> meet = new ArrayList<MeetingInterval>();
		for(int i =0; i<10; i++) {
			int start = (int)(Math.random()*2399);
			int end = start + ((int)(Math.random()*(2399-start)));


			meet.add(new MeetingInterval(start, end));



		}
		System.out.println(canAttend(meet) ? "There is no conflict with attending "+meet+" meetings":"Can't attend "+meet+" meetings due to conflict");
		//please include additional testing here!

        meet.clear();
        meet.add(new MeetingInterval(0,20));
        meet.add(new MeetingInterval(60,100));
	}
}

 class MeetingInterval {
	private int startTime;
	private int endTime;
	
	public MeetingInterval(int myStart, int myEnd) {
		startTime = myStart;
		endTime = myEnd;
	}
	public int getStart() {
		return startTime;
	}
	public int getEnd() {
		return endTime;
	}
	public String toString() {
		return "["+startTime+"]["+endTime+"]";
	}
}



