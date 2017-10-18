package Beans;

public class Images {
    private String icon;
    private String medium;
    private String screen;
    private String small;
    private String large;

    public Images(String ic, String med, String scr, String sm, String lrg) {
        this.icon = ic;
        this.medium = med;
        this.screen = scr;
        this.small = sm;
        this.large = lrg;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getMedium() {
        return medium;
    }

    public void setMedium(String medium) {
        this.medium = medium;
    }

    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }

    public String getSmall() {
        return small;
    }

    public void setSmall(String small) {
        this.small = small;
    }

    public String getLarge() {
        return large;
    }

    public void setLarge(String large) {
        this.large = large;
    }
}
