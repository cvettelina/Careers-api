package api.application.tests.request;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlRootElement
@XmlJavaTypeAdapter(QuestionType.XmlTypeAdapter.class)
public enum QuestionType {

    OPEN("Open questions"),
    TEST("Test questions");

    public static class XmlTypeAdapter extends XmlAdapter<String, QuestionType> {
        @Override
        public QuestionType unmarshal(String enumName) {
            return QuestionType.fromString(enumName);
        }

        @Override
        public String marshal(QuestionType enumName) {
            return enumName.getType();
        }
    }

    private String type;

    private QuestionType(String contentType) {
        this.type = contentType;
    }

    public static QuestionType fromString(String type) {
        for (QuestionType current : values()) {
            if (current.type.equalsIgnoreCase(type)) {
                return current;
            }
        }
        throw new IllegalArgumentException("Unsupported type: " + type);
    }

    public String getType() {
        return type;
    }

}
