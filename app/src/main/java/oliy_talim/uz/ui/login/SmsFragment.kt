package oliy_talim.uz.ui.login

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import oliy_talim.uz.MainActivity
import oliy_talim.uz.R
import oliy_talim.uz.databinding.FragmentSmsBinding


class SmsFragment : Fragment() {
    lateinit var binding: FragmentSmsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSmsBinding.inflate(layoutInflater)


        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        onClick()
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
        binding.next.setOnClickListener {
            findNavController().popBackStack()
            findNavController().navigate(R.id.nav_home)

        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        (activity as MainActivity).showToolbar()
    }

}