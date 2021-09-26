package iterator;
public class Flight {
    private String flightNum;
    private String from;
    private String to;
    private int duration;
    private int transfers;
public Flight(String flightNum, String from, String to, int duration, int transfers){
    /**
     * The constructor initialized the flight number, the from, the to, the duration, and the transfers.
     */
    this.flightNum = flightNum;
    this.from = from;
    this.to = to;
    this.duration = duration;
    this.transfers = transfers;
}
/**
 * @return Returns the getFrom, getTo, getDuration, and getNumTransfers.
 */
public String getFrom(){
    return from;
}
public String getTo(){
    return to;
}
public int getDuration(){
    return duration;
}
public int getNumTransfers(){
    return transfers;
}
/**
 * The toString returns all the information. It also calculates the number of hours and minutes.
 */
public String toString(){
    int temp = duration;
    int hours = duration/60;
    temp %= 60;
    int minute = temp;

    String numTransfers = "Direct Flight";
    if(transfers == 0){
        numTransfers = "Direct Flight";
    }
    else if(transfers == 1){
        numTransfers = "1 Transfer";
    }
    else{
        numTransfers = transfers+" Transfers";
    }
    return "Flight Number: "+flightNum+"\nFrom: "+from+"\nTo: "+to+"\nDuration: "+hours+" hours "+minute+" minutes\n"+numTransfers;
}
}
