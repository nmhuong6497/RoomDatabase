package com.example.roomdatabase.data.local;

import androidx.room.Dao;
import androidx.room.Query;

import com.example.roomdatabase.data.local.entity.TodoEntity;

import java.util.List;

import io.reactivex.rxjava3.core.Observable;

@Dao
public interface TodoDao {

    @Query("SELECT * FROM todo")
    Observable<List<TodoEntity>> getTodoEntity();
}
