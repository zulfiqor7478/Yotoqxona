package oliy_talim.uz.db.dao

import androidx.room.Dao
import androidx.room.Query
import oliy_talim.uz.db.entity.Odam


@Dao
interface PersonDao : BaseDao<Odam> {
    @Query("select * from Persons")
    fun getPersonsss(): List<Odam>

}