package api.application.response;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import api.application.request.Position;

@XmlRootElement
public class PositionResponse extends Position {

    @XmlElement
    private Long id;

    public PositionResponse() {
    }

    public PositionResponse(String title, String description, Long id) {
        super(title, description);
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (!(o instanceof Long)) {
            return false;
        }
        System.out.println(this.id.equals(o) + " " + 0 + " " + this.id);
        if (!this.id.equals(o)) {
            return false;
        }
        return true;
    }
    
    public int hashCode() {
        return this.id.hashCode();
    }
}
