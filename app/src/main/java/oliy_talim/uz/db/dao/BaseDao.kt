package oliy_talim.uz.db.dao

import androidx.room.*
import oliy_talim.uz.db.entity.User

@Dao
interface BaseDao<T> {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(t: T)

    @Update
    fun update(t: T)

    @Delete
    fun delete(t: T)

}