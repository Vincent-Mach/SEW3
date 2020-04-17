package persMgmt;

public class City {
    private int postCode;
    private String name;

    public City(int postCode, String name) {
        this.postCode = postCode;
        this.name = name;
    }

    public int getPostCode() {
        return postCode;
    }

    public String getName() {
        return name;
    }

    public void setPostCode(int postCode) {
        this.postCode = postCode;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("City{");
        sb.append("postCode=").append(postCode);
        sb.append(", name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
