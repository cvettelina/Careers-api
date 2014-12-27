package api.application.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import api.application.request.User;

@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
public class UserResponse extends User {
    
    @XmlElement
    private Long id;

    public UserResponse() {
    }

    public UserResponse(String username, String email, String type, boolean active, Long id) {
        super(username, email, type, active);
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
