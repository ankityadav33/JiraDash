package com.dragtotech.model;

import com.dragtotech.model.entity.JiraIssue;
import com.dragtotech.model.jaxb.Item;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

import java.util.List;

public interface IssuesRepository extends MongoRepository<Item, String> {
    Item findByKey(String key);

    List<Item> findByType(String type);

    List<Item> findByAssignee(String assignee);
}