package oliy_talim.uz.db.dao

import androidx.room.Dao
import androidx.room.Query
import oliy_talim.uz.db.entity.User

@Dao
interface UserDao : BaseDao<User> {
    @Query("select * from Users")
    fun getUserss(): List<User>
}