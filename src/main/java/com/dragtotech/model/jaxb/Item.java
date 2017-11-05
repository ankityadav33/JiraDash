package com.dragtotech.model.jaxb;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.Date;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
public class Item {

    @XmlElement(name = "title")
    private String title;

    @XmlElement(name = "link")
    private String link;

    @XmlElement(name = "project")
    private String project;

    @XmlElement(name = "description")
    private String description;

    @XmlElement(name = "title")
    private String environment;

    @XmlElement(name = "key")
    private String key;

    @XmlElement(name = "summary")
    private String summary;

    @XmlElement(name = "type")
    private String type;

    @XmlElement(name = "parent")
    private String parent;

    @XmlElement(name = "status")
    private String status;

    @XmlElement(name = "assignee")
    private String assignee;

    @XmlElement(name = "reporter")
    private String reporter;

    @XmlElementWrapper(name = "labels")
    @XmlElement(name = "label")
    private List<String> labelsList;


    @XmlElement(name = "created")
    @XmlJavaTypeAdapter(DateTimeAdapter.class)
    private Date createdDate;

    @XmlJavaTypeAdapter(DateTimeAdapter.class)
    @XmlElement(name = "updated")
    private Date updatedDate;

    @XmlJavaTypeAdapter(DateTimeAdapter.class)
    @XmlElement(name = "resolved")
    private Date resolvedDate;

    @XmlElement(name = "timeoriginalestimate")
    private String timeoriginalestimate;

    @XmlElement(name = "timeestimate")
    private String timeestimate;

    @XmlElement(name = "timespent")
    private String timespent;

    @XmlElement(name = "subtasks")
    private List<Item> subtasks;

    @XmlElementWrapper(name = "customfields")
    @XmlElement(name = "customfield")
    private List<CustomField> customFieldsList;

    @XmlElementWrapper(name = "subtasks")
    @XmlElement(name = "subtask")
    private List<String> subtaskList;


    public List<String> getSubtaskList() {
        return subtaskList;
    }

    public String getTitle() {
        return title;
    }

    public String getLink() {
        return link;
    }

    public String getProject() {
        return project;
    }

    public String getDescription() {
        return description;
    }

    public String getEnvironment() {
        return environment;
    }

    public String getKey() {
        return key;
    }

    public String getSummary() {
        return summary;
    }

    public String getType() {
        return type;
    }

    public String getParent() {
        return parent;
    }

    public String getStatus() {
        return status;
    }

    public String getAssignee() {
        return assignee;
    }

    public String getReporter() {
        return reporter;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public Date getResolvedDate() {
        return resolvedDate;
    }

    public String getTimeoriginalestimate() {
        return timeoriginalestimate;
    }

    public String getTimeestimate() {
        return timeestimate;
    }

    public String getTimespent() {
        return timespent;
    }

    public List<Item> getSubtasks() {
        return subtasks;
    }

    public List<CustomField> getCustomFieldsList() {
        return customFieldsList;
    }

    public List<String> getLabelsList() {
        return labelsList;
    }
}
