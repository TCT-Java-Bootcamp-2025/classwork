package class4;

public class Item {
    private String title;
    private Boolean isAvailable;

    public Item(String title, Boolean isAvailable) {
        this.title = title;
        this.isAvailable = isAvailable;
    }

    public Item(){
    }

    public String getTitle() {
        return title;
    }

    public Boolean getAvailable() {
        return isAvailable;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAvailable(Boolean available) {
        isAvailable = available;
    }



}
