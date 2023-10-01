package com.news.hub.dao;

import com.news.hub.entity.student.Student;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author DXgriz
 */
@Local
public interface StudentFacadeLocal {

    void create(Student student);

    void edit(Student student);

    void remove(Student student);

    Student find(Object id);

    List<Student> findAll();

    List<Student> findRange(int[] range);

    int count();
    
}
