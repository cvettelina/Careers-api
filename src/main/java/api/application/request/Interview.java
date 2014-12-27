package api.application.request;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType()
public class Interview {

    @XmlElement
    private Long userId;

    @XmlElement
    private Long personId;

    @XmlElement
    private String startDate;

    @XmlElement
    private String endDate;

    @XmlElement
    private String comment;

    private Interview() {
    }

    private Interview(Long userId, Long personId, String startDate, String endDate, String comment) {
        this.userId = userId;
        this.personId = personId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.comment = comment;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getPersonId() {
        return personId;
    }

    public void setPersonId(Long personId) {
        this.personId = personId;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
