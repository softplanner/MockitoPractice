package edu.practice.java;

import java.util.List;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ToDoBusinessImpStubTest {

    @Test
    public void testRetreiveToDosRelatedToSpring() {
        ToDoService todoService = new ToDoServiceStub();
        ToDoBusinessImp todoBusinessImpl = new ToDoBusinessImp(todoService);
        List<String> todos = todoBusinessImpl
                .retrieveTodosRelatedToSpring("Dummy");
        assertEquals(2, todos.size());
    }
}