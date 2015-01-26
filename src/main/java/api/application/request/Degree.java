package api.application.request;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlRootElement
@XmlJavaTypeAdapter(Degree.XmlTypeAdapter.class)
public enum Degree {
	
	@XmlElement
	NO_EDUCATION("No education", 0),
	@XmlElement
	CERTIFICATE("Certificate", 1),
	@XmlElement
	DIPLOMA("Diploma", 2),
	@XmlElement
	ASSOCIATE("Associate", 3),
	@XmlElement
	BACHELOR("Bachelor", 4),
	@XmlElement
	ENGENEER("Engeneer", 5),
	@XmlElement
	MASTER("Master", 6),
	@XmlElement
	DOCTOR("Doctor", 7);

	private String name;
	private int value;
	
	public static class XmlTypeAdapter extends XmlAdapter<String, Degree> {
        @Override
        public Degree unmarshal(String enumName) {
            return Degree.fromString(enumName);
        }

        @Override
        public String marshal(Degree enumName) {
            return enumName.getName();
        }
    }

	private Degree(String name, int value) {
		this.name = name;
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public static Degree fromString(String name) {
		for (Degree current : Degree.values()) {
			if (current.name == name) {
				return current;
			}
		}
		return null;
	}
	
	public static Degree fromInt(int value) {
		for (Degree current : Degree.values()) {
			if (current.value == value) {
				return current;
			}
		}
		return null;
	}
}
