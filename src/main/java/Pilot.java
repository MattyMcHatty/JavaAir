public class Pilot extends CabinCrewMember{

    private String licenceNumber;

    public Pilot(String name, RankType rank, String licenceNumber){
        super(name, rank);
        this.licenceNumber = licenceNumber;
    }

    public String getLicenceNumber() {
        return licenceNumber;
    }

    public void setLicenceNumber(String licenceNumber) {
        this.licenceNumber = licenceNumber;
    }
}
