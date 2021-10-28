package oliy_talim.uz.db.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Users")
data class User(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val firstName: String,
    val lastName: String,
    val phone: String,
    val city: String,
    val university: String,
    val fakultey: String,
    val order: String
)