package oliy_talim.uz.ui.login

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import oliy_talim.uz.MainActivity
import oliy_talim.uz.R
import oliy_talim.uz.databinding.FragmentLoginBinding
import oliy_talim.uz.db.dao.PersonDao
import oliy_talim.uz.db.databse.AppDatabase
import oliy_talim.uz.db.entity.Odam


class LoginFragment : Fragment() {
    lateinit var appDatabase: AppDatabase
    lateinit var dao: PersonDao
    lateinit var binding: FragmentLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        appDatabase = AppDatabase.getDatabase(requireContext())
        dao = appDatabase.personDao()
        binding = FragmentLoginBinding.inflate(layoutInflater)
        binding.next.setOnClickListener {
            val login = binding.login.text.toString()
            val password = binding.passworddd.text.toString()
            val firstName = binding.firstName.text.toString()
            val lastName = binding.lastName.text.toString()
            val phone = binding.phone.text.toString()
            if (login.isNotEmpty() && password.isNotEmpty() && firstName.isNotEmpty() && lastName.isNotEmpty() && phone.isNotEmpty()) {

                dao?.insert(
                    Odam(
                        login = login,
                        password = password,
                        firstName = firstName,
                        lastName = lastName,
                        phone = phone
                    )
                )

                findNavController().popBackStack()
                findNavController().navigate(R.id.smsFragment)

            } else {
                Toast.makeText(requireContext(), "Ma'lumot to'liq emas", Toast.LENGTH_SHORT).show()
            }


        }





        return binding.root
    }

    override fun onStart() {
        super.onStart()
        (activity as MainActivity).hidToolbar()
    }

    override fun onResume() {
        super.onResume()
        (activity as MainActivity).hidToolbar()
    }

    private fun onClick() {
        binding.apply {
            next.setOnClickListener {
                val login = login.text.toString()
                val password = passworddd.text.toString()
                val firstName = firstName.text.toString()
                val lastName = lastName.text.toString()
                val phone = phone.text.toString()
                if (login.isNotEmpty() &&
                    password.isNotEmpty() &&
                    firstName.isNotEmpty() &&
                    lastName.isNotEmpty() &&
                    phone.isNotEmpty()
                ) {
                    dao?.insert(
                        Odam(
                            login = login,
                            password = password,
                            firstName = firstName,
                            lastName = lastName,
                            phone = phone
                        )
                    )

                    findNavController().popBackStack()
                    findNavController().navigate(R.id.smsFragment)


                }
                if (lastName.isEmpty()) {
                    Toast.makeText(context, "last Name is Empty", Toast.LENGTH_SHORT).show()
                }
                if (firstName.isEmpty()) {
                    Toast.makeText(context, "first Name is Empty", Toast.LENGTH_SHORT).show()
                }
                if (password.isEmpty()) {
                    Toast.makeText(context, "password is Empty", Toast.LENGTH_SHORT).show()
                }
                if (phone.isEmpty()) {
                    Toast.makeText(context, "phone is Empty", Toast.LENGTH_SHORT).show()
                }
                if (login.isEmpty()) {
                    Toast.makeText(context, "login is Empty", Toast.LENGTH_SHORT).show()
                }


            }
        }

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

    override fun onDestroyView() {
        super.onDestroyView()
        (activity as MainActivity).showToolbar()
    }


}