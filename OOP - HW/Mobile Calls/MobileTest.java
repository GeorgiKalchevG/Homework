
public class MobileTest {

	public static void main(String[] args) {
		GSM nexus = new GSM();
		GSM iPhone = new GSM();
		
		nexus.model = "five";
		nexus.hasSimCard = true;
		nexus.simMobileNumber = "0887713820";
		nexus.outgoingCallsDuration = 25;
		
		iPhone.model = "6s";
		iPhone.hasSimCard = true;
		iPhone.simMobileNumber = "0883378966";
		iPhone.outgoingCallsDuration = 220;
		
		
		
	
		
		int callDuration1  = 100;
		int callDuration2  = 500;
		int callDuration3  = 311;
		int callDuration4 = 0;
	
		System.out.println("Before calls");
		System.out.println("nexus");
		nexus.printInfoForTheLastOutgoingCall();
		System.out.println("iphone");
		iPhone.printInfoForTheLastOutgoingCall();
		System.out.println("----------------------------------");
//		
		
		System.out.println("nexus 0887713820 to iphone 0883378966 duration 100");
		System.out.println("----------------------------------");
		nexus.call( callDuration1, iPhone);
		nexus.printInfoForTheLastOutgoingCall();
		nexus.printInfoForTheLastIncomingCall();
		System.out.println("----------------------------------");
		System.out.println("Bill for total outgoing calls : "+"$"+nexus.getSumForCall() + " " +"for " + nexus.outgoingCallsDuration + " mins" );
		System.out.println("----------------------------------");
		System.out.println();
		System.out.println();
		System.out.println();

		
		
		
		System.out.println("iphone 0883378966 to nexus 0887713820  duration 500");
		System.out.println("----------------------------------");
		iPhone.call( callDuration2, nexus);
		iPhone.printInfoForTheLastOutgoingCall();
		iPhone.printInfoForTheLastIncomingCall();
		System.out.println("----------------------------------");
		System.out.println("Bill for total outgoing calls : "+"$"+iPhone.getSumForCall() + " " +"for " + iPhone.outgoingCallsDuration + " mins" );
		System.out.println("----------------------------------");
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		
		
		System.out.println("iphone 0883378966 to nexus - 311");
		System.out.println("----------------------------------");
		iPhone.call( callDuration3,  nexus);
		iPhone.printInfoForTheLastOutgoingCall();
		iPhone.printInfoForTheLastIncomingCall();
		System.out.println("----------------------------------");
		System.out.println("Bill for total outgoing calls : "+"$"+ iPhone.getSumForCall() + " " +"for " + iPhone.outgoingCallsDuration + " mins" );
		System.out.println("----------------------------------");
		System.out.println();
		System.out.println();
		System.out.println();
		
		System.out.println("nexus 0887713820 to iphone - 200");
		System.out.println("----------------------------------");
		nexus.call( callDuration4, iPhone);
		nexus.printInfoForTheLastOutgoingCall();
		nexus.printInfoForTheLastIncomingCall();
		System.out.println("----------------------------------");
		System.out.println("Bill for total outgoing calls : "+"$"+nexus.getSumForCall() + " " +"for " + nexus.outgoingCallsDuration + " mins" );
		System.out.println("----------------------------------");
		
	}


}
