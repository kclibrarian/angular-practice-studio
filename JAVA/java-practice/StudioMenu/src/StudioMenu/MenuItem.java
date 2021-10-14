package StudioMenu;
import java.util.ArrayList;

public class MenuItem {
    private String name;
    private Double price;
    private String description;
    private Boolean current;

    public MenuItem(String name, String description, Double price, Boolean current) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.current = current;
    }
            public String getName() {
                return name;
            }

            public String getDescription() {
                return description;
            }

            public Double getPrice() {
                return price;
            }

            public Boolean getCurrent() {
                return current;
            }

            public void setDescription(String aDescription) {
                description = aDescription;
            }

            public void setName(String aName) {
                name = aName;
            }
            public void setName(Double aPrice) {
                price = aPrice;
            }
            public void setCurrent(Boolean aCurrent) {
                current = aCurrent;
            }
}


}
