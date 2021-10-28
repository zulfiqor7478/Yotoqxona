package oliy_talim.uz.ui.orders

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import oliy_talim.uz.R
import oliy_talim.uz.databinding.FragmentEditBinding

class EditFragment : Fragment() {
    lateinit var binding: FragmentEditBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentEditBinding.inflate(layoutInflater)




        return binding.root
    }
}