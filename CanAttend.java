//Haley Prindle
//2/10/26

import java.util.ArrayList;

public class CanAttend {

	//precondition: the starting meeting interval is less than the ending meeting interval. 
	//Also, neither intervals can be null.
	//postcondition: returns if the meeting in the array list meetings can or can't be attended
	//Answers if the meetings overlap.
	public static boolean canAttend(ArrayList<MeetingInterval> meetings) {
		//your implementation here
        

           for (int i =0; i< meetings.size(); i++){
            for (int j = i+1; j<meetings.size(); j++){
           
			MeetingInterval m1 = meetings.get(i);
            MeetingInterval m2 = meetings.get(j);
			if (m1.getStart() < m2.getEnd() && m2.getStart() < m1.getEnd()) {
                    return false; // Overlap detected
            }
			
                
          }
		}
         
        

        
        

		System.out.println(meetings);
		return true; //replace me with actual logic please!
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
		System.out.println(canAttend(meet) ? "There is no conflict with attending "+meet+" meetings":"Can't attend "+meet+" meetings due to conflict");

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



