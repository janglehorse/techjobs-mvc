package org.launchcode.controllers;

import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.HashMap;

/**
 * Created by adminbackup on 3/23/17.
 */
public class TechJobsController {

    static HashMap<String, String> columnChoices = new HashMap<>();
    static HashMap<String, String> actionChoices = new HashMap<>();


    public TechJobsController(){
        actionChoices.put("search", "Search");
        actionChoices.put("list", "List");
    }

    @ModelAttribute("actions")
    static HashMap<String, String> getActionChoices(){
        return actionChoices;
    }

}
