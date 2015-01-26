package api.application.request;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlRootElement
@XmlJavaTypeAdapter(SchoolType.XmlTypeAdapter.class)
public enum SchoolType {
    
	@XmlElement
	PRIMARY_SCHOOL("Primary school"),
    HIGH_SCHOOL("High school"),
    TECHNICAL_SCHOOL("Technical school"),
    COLLEGE("College"),
    UNIVERSITY("University");
	
	private String name;
	
	private SchoolType(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public static class XmlTypeAdapter extends XmlAdapter<String, SchoolType> {
        @Override
        public SchoolType unmarshal(String enumName) {
            return SchoolType.fromString(enumName);
        }

        @Override
        public String marshal(SchoolType enumName) {
            return enumName.getName();
        }
    }

	public static SchoolType fromString(String name) {
		for (SchoolType current : SchoolType.values()) {
			if (current.name == name) {
				return current;
			}
		}
		return null;
	}
}
