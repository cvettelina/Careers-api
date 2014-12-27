package api.application.request;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
public class Application {

    @XmlElement
    private PersonalInformation personalInformation;

    @XmlElement
    private List<Education> education;

    @XmlElement
    private List<Employment> employment;

    @XmlElement
    private String personalSkills;

    @XmlElement
    private String technicalSkills;

    @XmlElement
    private String comment;

    @XmlElement
    private Long positionId;

    public Application(PersonalInformation personalInformation, List<Education> education, List<Employment> employment, String personalSkills,
            String technicalSkills, String comment) {
        this.personalInformation = personalInformation;
        this.education = education;
        this.employment = employment;
        this.personalSkills = personalSkills;
        this.technicalSkills = technicalSkills;
        this.comment = comment;
    }

    public Application() {
    }

    public PersonalInformation getPersonalInformation() {
        return personalInformation;
    }

    public void setPersonalInformation(PersonalInformation personalInformation) {
        this.personalInformation = personalInformation;
    }

    public List<Education> getEducation() {
        return education;
    }

    public void setEducation(List<Education> education) {
        this.education = education;
    }

    public List<Employment> getEmployment() {
        return employment;
    }

    public void setEmployement(List<Employment> employment) {
        this.employment = employment;
    }

    public String getPersonalSkills() {
        return personalSkills;
    }

    public void setPersonalSkills(String personalSkills) {
        this.personalSkills = personalSkills;
    }

    public String getTechnicalSkills() {
        return technicalSkills;
    }

    public void setTechnicalSkills(String technicalSkills) {
        this.technicalSkills = technicalSkills;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Long getPositionId() {
        return positionId;
    }

    public void setPositionId(Long positionId) {
        this.positionId = positionId;
    }

}
