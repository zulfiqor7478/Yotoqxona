package oliy_talim.uz.db.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Persons")
data class Odam(
    @PrimaryKey(autoGenerate = true)
    var id: Long = 0,
    var login: String = "",
    var password: String = "",
    var firstName: String = "",
    var lastName: String = "",
    var phone: String = ""
)
