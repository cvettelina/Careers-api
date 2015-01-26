package api.application.request;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlRootElement
@XmlJavaTypeAdapter(Gender.XmlTypeAdapter.class)
public enum Gender {

	@XmlElement
    MALE("male"),
    @XmlElement
    FEMALE("female");

    public static class XmlTypeAdapter extends XmlAdapter<String, Gender> {
        @Override
        public Gender unmarshal(String enumName) {
            return Gender.fromString(enumName);
        }

        @Override
        public String marshal(Gender enumName) {
            return enumName.getType();
        }
    }

    private String gender;

    private Gender(String contentType) {
        this.gender = contentType;
    }

    public static Gender fromString(String gender) {
        for (Gender current : values()) {
            if (current.gender.equalsIgnoreCase(gender)) {
                return current;
            }
        }
        throw new IllegalArgumentException("Unsupported gender: " + gender);
    }

    public String getType() {
        return gender;
    }
}
