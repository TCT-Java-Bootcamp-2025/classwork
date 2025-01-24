package class4;

public class Magazine extends Item{
    private int serialNumber;

    public Magazine(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Magazine(int serialNumber, String title, Boolean isAvailable){
        super(title, isAvailable);
        this.serialNumber=serialNumber;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "title='" + super.getTitle() + '\'' +
                ", isAvailable=" + super.getAvailable() +
                "serialNumber=" + serialNumber +
                '}';
    }
}
