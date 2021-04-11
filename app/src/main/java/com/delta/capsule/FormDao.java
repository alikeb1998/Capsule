package com.delta.capsule;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
interface FormDao {
    @Query("SELECT * FROM form")
    List<Form> getAllForms();

    @Query("SELECT * FROM form WHERE id LIKE :formId LIMIT 1")
    Form getForm(int formId);

    @Insert
    void insert(Form... form);

    @Delete
    void delete(Form form);

    @Query("DELETE FROM form WHERE id LIKE :id")
    void deleteById(int id);

    @Update
    void update(Form... form);
}
