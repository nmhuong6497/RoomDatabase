package com.example.roomdatabase.data.reponsitory;

import android.content.Context;

import com.example.roomdatabase.data.local.TodoDao;
import com.example.roomdatabase.data.local.TodoDatabase;
import com.example.roomdatabase.data.local.entity.TodoEntity;

import java.util.List;

import io.reactivex.rxjava3.core.Observable;

public class TodoReponsitory {
    private TodoDao todoDao;

    public TodoReponsitory(Context context) {
        todoDao = TodoDatabase.getInstance(context).getTodoDao();
    }

    public Observable<List<TodoEntity>> getTodos() {
        return todoDao.getTodoEntity();
    }
}
