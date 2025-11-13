package com.todo.todoapp.controller;


import com.todo.todoapp.models.Task;
import com.todo.todoapp.services.TaskServices;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
//@RequestMapping("/tasks")
public class TaskController {
    private final TaskServices taskServices;

    public TaskController(TaskServices taskServices) {
        this.taskServices = taskServices;
    }

    @GetMapping
    public String getTask(Model model){
        List<Task> tasks = taskServices.getAllTasks();
        model.addAttribute("tasks", tasks);
        return "tasks"; //view name - tasks (html file should be same)
    }

    @PostMapping
    public String getTask(String title){
        taskServices.createTask(title);
        return "redirect:/"; //view name - tasks (html file should be same)
    }

    @GetMapping("/{id}/delete")
    public String deleteTask(@PathVariable Long id){
        taskServices.deleteTask(id);
        return "redirect:/"; //view name - tasks (html file should be same)
    }

    @GetMapping("/{id}/toggle")
    public String toggleTask(@PathVariable Long id){
        taskServices.toggleTask(id);
        return "redirect:/"; //view name - tasks (html file should be same)
    }
}
