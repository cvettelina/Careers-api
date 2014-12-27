package api.application.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
public class Education {

    @XmlElement
    private Duration duration;

    @XmlElement
    private String city;

    @XmlElement
    private String country;

    @XmlElement
    private String schoolName;

    @XmlElement
    private SchoolType schoolType;

    @XmlElement
    private Degree degree;

    public Education() {
    }

    public Education(Duration duration, String city, String country, String schoolName, SchoolType schoolType, Degree degree) {

        this.duration = duration;
        this.city = city;
        this.country = country;
        this.schoolName = schoolName;
        this.schoolType = schoolType;
        this.degree = degree;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public SchoolType getSchoolType() {
        return schoolType;
    }

    public void setSchoolType(SchoolType schoolType) {
        this.schoolType = schoolType;
    }

    public Degree getDegree() {
        return degree;
    }

    public void setDegree(Degree degree) {
        this.degree = degree;
    }

}
