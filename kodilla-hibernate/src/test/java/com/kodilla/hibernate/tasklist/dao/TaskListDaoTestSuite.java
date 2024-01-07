package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklists.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private  TaskListDao taskListDao;
@Test
    void testFindByListName(){
//Given
        TaskList taskList = new TaskList();
        taskList.setListName("TestList1");
        taskList.setDescription("TestDescription1");
        taskListDao.save(taskList);

        //When
        List<TaskList>result = taskListDao.findByListName("TestList1");

        //Then
        assertEquals("TestList1",result.get(0).getListName());

        // CleanUp
        taskListDao.deleteAll();

    }
}
