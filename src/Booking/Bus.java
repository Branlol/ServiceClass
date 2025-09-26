
package Booking;


public class Bus extends TransportService{
    
    private String busCompany;
    private String boardingPoint;

    public Bus() {
    }

    public Bus(String busCompany, String boardingPoint) {
        this.setBusCompany(busCompany);
        this.setBoardingPoint(boardingPoint);
    }
    
    public void setBusCompany(String busCompany) {
        this.busCompany = busCompany;
    }
    public void setBoardingPoint(String boardingPoint) {
        this.boardingPoint = boardingPoint;
    }

    public String getBusCompany() {
        return busCompany;
    }
    
    public String getBoardingPoint() {
        String str = "\n" + this.getId + "has reached the point of embarking";
        return str;
    }
    public String getServiceInformation(){
        String str = "\n" + this.busCompany
        return 
    }
    
    @Override
    public String toString() {
        
    }
    
    
    
    
    
    
    
    
}
