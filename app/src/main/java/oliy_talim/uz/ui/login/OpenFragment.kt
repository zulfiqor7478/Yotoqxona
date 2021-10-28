package oliy_talim.uz.ui.login

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import oliy_talim.uz.MainActivity
import oliy_talim.uz.R
import oliy_talim.uz.databinding.FragmentOpenBinding
import oliy_talim.uz.db.dao.PersonDao
import oliy_talim.uz.db.databse.AppDatabase


class OpenFragment : Fragment() {
    private val TAG = "OpenFragment"
    lateinit var appDatabase: AppDatabase
    lateinit var dao: PersonDao
    lateinit var binding: FragmentOpenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var t = false
        appDatabase = AppDatabase.getDatabase(requireContext())
        dao = appDatabase.personDao()
        binding = FragmentOpenBinding.inflate(layoutInflater)
        binding.next.setOnClickListener {

            var login1 = ""
            var password1 = ""
            val login = binding.login.text.toString()
            val password = binding.passsword.text.toString()
            for (personsss in dao.getPersonsss()) {
                if (personsss.login == login) {
                    login1 = personsss.login
                }
                if (personsss.password == password) {
                    password1 = personsss.password
                }
                if (personsss.login == login && personsss.password == password) {
                    t = true

                    findNavController().popBackStack()
                    findNavController().navigate(R.id.nav_home)
                }
//                if (!t) {
//                    if (password != password1) {
//                        Toast.makeText(requireContext(), "parol notog'ri", Toast.LENGTH_SHORT)
//                            .show()
//
//                    }
//                    if (login != login1) {
//                        android.widget.Toast.makeText(
//                            requireContext(),
//                            "login notog'ri",
//                            android.widget.Toast.LENGTH_SHORT
//                        )
//                            .show()
//
//                    }
            }


        }
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


    }

    private fun onClick() {

    }

    override fun onDestroy() {
        super.onDestroy()
        (activity as MainActivity).showToolbar()

    }


}