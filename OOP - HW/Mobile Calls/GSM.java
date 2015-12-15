public class GSM {
	String model;
    boolean hasSimCard = false;
	String simMobileNumber= new String();
	int outgoingCallsDuration;
	Call lastIncomingCall = new Call();
	Call lastOutgoingCall= new Call();
	
	
	 
	
	boolean insertSimCard(String simMobileNumber){
		boolean validSim=false;
		if(simMobileNumber.substring(0, 2).equals("08")&&simMobileNumber.length()==10&&simMobileNumber.matches("[0-9]+")){
			validSim=true;
			hasSimCard = true;
		}
		else{

			validSim=false;
			hasSimCard = false;
			
		}
	
		return validSim;
		
		
	
	}
	
		
	 void removeSimCard(){
		hasSimCard = false;
	}
	
	void call(int duration, GSM receiver){
		if(simMobileNumber.compareToIgnoreCase(receiver.simMobileNumber)==0){
			System.out.println("You can't call yourself");
			return;
			
		}
		if(!insertSimCard(simMobileNumber)){
			System.out.println("The SIM card is missing or broken");
			return;
		}
		if(!insertSimCard(receiver.simMobileNumber)){
			System.out.println("The number you have dialed is unreachable");
			return;
		}
		if(duration >=0){
				
//			lastOutgoingCall.caller = simMobileNumber;
			lastOutgoingCall.receiver = receiver.simMobileNumber;
			lastOutgoingCall.duration = duration;
			
			receiver.lastIncomingCall.caller = simMobileNumber;
//			receiver.lastIncomingCall.receiver = receiver.simMobileNumber;
			receiver.lastIncomingCall.duration = duration;
			
			outgoingCallsDuration+= duration;
		}
		if(duration <0){
			return;
			
		}
		
			
	
		
		
		
		
		
	}
	 double getSumForCall(){
		
		
		return Call.callPrice*outgoingCallsDuration;
	}

	void printInfoForTheLastOutgoingCall() {
		if (lastOutgoingCall.duration >= 0) {
//		System.out.println("Caller: " + lastOutgoingCall.caller);
		System.out.println("Last outgoing call to " + lastOutgoingCall.receiver);
		System.out.println("Duration: " + lastOutgoingCall.duration + " minutes");
		} else {
			System.out.println("No outgoing calls have been made from this GSM yet.");
		}
	}
	
	
		void printInfoForTheLastIncomingCall() {
			if (lastIncomingCall.duration >= 0) {
			System.out.println("Last incoming call from " + lastIncomingCall.caller);
//			System.out.println("Receiver: " + lastIncomingCall.receiver);
			System.out.println("Duration: " + lastIncomingCall.duration + " minutes");
			} else {
				System.out.println("No incoming calls have been made to this GSM yet.");
			}
		}
	
	
}
