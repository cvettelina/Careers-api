package api.application.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
public class Employment {

    @XmlElement
    private Duration duration;

    @XmlElement
    private String country;

    @XmlElement
    private String city;

    @XmlElement
    private String companyName;

    @XmlElement
    private String position;

    @XmlElement
    private String description;

    public Employment(Duration duration, String country, String city, String companyName, String position, String description) {
        this.duration = duration;
        this.country = country;
        this.city = city;
        this.companyName = companyName;
        this.position = position;
        this.description = description;
    }

    public Employment() {
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
