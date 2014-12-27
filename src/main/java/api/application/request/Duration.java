package api.application.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
public class Duration {

    public static final String PRESENT = "Present";

    @XmlElement
    private Integer startYear;

    @XmlElement
    private Integer endYear;

    public Duration(Integer startYear, Integer endYear) {
        this.startYear = startYear;
        this.endYear = endYear;
    }

    public Duration() {
    }

    public Integer getStartYear() {
        return startYear;
    }

    public void setStartYear(Integer startYear) {
        this.startYear = startYear;
    }

    public Integer getEndYear() {
        return endYear;
    }

    public void setEndYear(Integer endYear) {
        this.endYear = endYear;
    }

}
