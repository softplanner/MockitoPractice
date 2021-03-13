package edu.practice.java;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class ToDoBusinessImpMockitoTest {

    @Test
    public void usingMockito() {
        ToDoService todoService = mock(ToDoService.class);
        List<String> allTodos = Arrays.asList("Learn Spring MVC",
                "Learn Spring", "Learn to Dance");
        when(todoService.retrieveToDOs("Dummy")).thenReturn(allTodos);

        ToDoBusinessImp todoBusinessImpl = new ToDoBusinessImp(todoService);
        List<String> todos = todoBusinessImpl
                .retrieveTodosRelatedToSpring("Dummy");
        assertEquals(2, todos.size());
    }
}

