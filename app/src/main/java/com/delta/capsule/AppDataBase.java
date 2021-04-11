package com.delta.capsule;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Form.class},version = 1)
public abstract class AppDataBase extends RoomDatabase {
    public abstract FormDao formDao();
}
