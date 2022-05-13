package com.mycompany.projectmanager.web.controller;


import com.mycompany.projectmanager.entities.TaskLog;
import com.mycompany.projectmanager.service.TaskLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/taskLog")
public class TaskLogController {

    private final TaskLogService taskLogService;

    @Autowired
    public TaskLogController(TaskLogService taskLogService) {

        this.taskLogService = taskLogService;
    }

    @GetMapping("/taskLogList")
    public ResponseEntity<List<TaskLog>> taskLogList(){
        List<TaskLog> taskLogs = taskLogService.findAll();
        return new ResponseEntity<>(taskLogs,HttpStatus.OK);
    }

}
