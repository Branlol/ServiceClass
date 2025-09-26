
package Booking;

public class Train extends TransportService{
    private String seatType;
    private int wagonNumber;
    
    public Train(){
        
    }
    public Train (int id, String origin, String destinaton, double price, String seatType, int wagonNumber){
        
        this.setSeatType(seatType);
        this.setWagonNumber(wagonNumber);
    }

    public String getSeatType() { //0
        return seatType;
    }

    public final void setSeatType(String seatType) {
        this.seatType = seatType;
    }

    public int getWagonNumber() {
        return wagonNumber;
    }

    public final void setWagonNumber(int wagonNumber) {
        this.wagonNumber = wagonNumber;
    }
    
    public String getServiceInformation(){
        return null;
    }
    
    public String getLuggageInformation(){
        return null;
    }
    
    @Override
    public String toString(){
        return null;
    }
}
