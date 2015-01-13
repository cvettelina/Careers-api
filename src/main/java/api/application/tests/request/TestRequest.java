package api.application.tests.request;

import java.util.List;

public class TestRequest {

    private String name;
    private List<Long> positions;
    private List<QuestionRequest> questions;
    private Boolean mandatory;

    public TestRequest() {
    }

    public List<QuestionRequest> getOpenQuestions() {
        return questions;
    }

    public void setOpenQuestions(List<QuestionRequest> questions) {
        this.questions = questions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Long> getPositions() {
        return positions;
    }

    public void setPositions(List<Long> positions) {
        this.positions = positions;
    }

    public List<QuestionRequest> getQuestions() {
        return questions;
    }

    public void setQuestions(List<QuestionRequest> questions) {
        this.questions = questions;
    }

    public Boolean getMandatory() {
        return mandatory;
    }

    public void setMandatory(Boolean mandatory) {
        this.mandatory = mandatory;
    }

}
