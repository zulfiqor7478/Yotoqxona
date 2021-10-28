package oliy_talim.uz.ui.login

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import oliy_talim.uz.MainActivity
import oliy_talim.uz.R
import oliy_talim.uz.databinding.FragmentRegistrBinding

class RegistrFragment : Fragment() {
    lateinit var binding: FragmentRegistrBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRegistrBinding.inflate(layoutInflater)


        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        onClick()
    }

    private fun onClick() {
        binding.apply {
            btn1.setOnClickListener {
                findNavController().navigate(R.id.openFragment)

            }
            btn2.setOnClickListener {
                findNavController().navigate(R.id.loginFragment)
            }

        }
    }

    override fun onStart() {
        super.onStart()
        (activity as MainActivity).hidToolbar()
    }

    override fun onResume() {
        super.onResume()
        (activity as MainActivity).hidToolbar()
    }


}