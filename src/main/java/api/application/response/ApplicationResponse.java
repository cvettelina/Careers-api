package api.application.response;

import java.util.Collection;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import api.application.request.Application;
import api.application.request.Degree;
import api.application.request.Status;

@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
public class ApplicationResponse extends Application {

    @XmlElement
    private Long id;

    @XmlElement
    private Collection<PositionResponse> positions;

    @XmlElement
    private Degree qualification;

    @XmlElement
    private Integer totalExperience;
    
    @XmlElement
    private Status status;

    public ApplicationResponse() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Collection<PositionResponse> getPositions() {
        return positions;
    }

    public void setPositions(Collection<PositionResponse> positions) {
        this.positions = positions;
    }

    public Degree getQualification() {
        return qualification;
    }

    public void setQualification(Degree qualification) {
        this.qualification = qualification;
    }

    public Integer getTotalExperience() {
        return totalExperience;
    }

    public void setTotalExperience(Integer totalExperience) {
        this.totalExperience = totalExperience;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

}
