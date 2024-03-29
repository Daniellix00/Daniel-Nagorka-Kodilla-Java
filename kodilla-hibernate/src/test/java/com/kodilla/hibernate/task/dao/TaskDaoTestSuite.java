package com.kodilla.hibernate.task.dao;

import com.kodilla.hibernate.task.Task;
import com.kodilla.hibernate.task.TaskFinancialDetails;
import com.kodilla.hibernate.tasklist.dao.TaskListDao;
import com.kodilla.hibernate.tasklists.TaskList;
import com.sun.xml.bind.v2.TODO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class TaskDaoTestSuite {

    private static final String TODO ="tasklist";
    @Autowired
private TaskListDao taskListDao;
    @Autowired
    private TaskDao taskDao;
    private static final String DESCRIPTION = "Test: Learn Hibernate";
    @Test
    void testTaskDaoSave(){
        //Given
        Task task = new Task(DESCRIPTION, 7);
        //When
        taskDao.save(task);
        //Then
        int id = task.getId();
        Optional<Task>readTask = taskDao.findById(id);
        assertTrue(readTask.isPresent());
        //CleanUp
        taskDao.deleteById(id);
    }
    @Test
    void testTaskDaoFindByDuration() {
        //Given
        Task task = new Task(DESCRIPTION, 7);
        taskDao.save(task);
        int duration = task.getDuration();

        //When
        List<Task> readTasks = taskDao.findByDuration(duration);

        //Then


        //CleanUp
        int id = readTasks.get(0).getId();
        taskDao.deleteById(id);
    }




    }
