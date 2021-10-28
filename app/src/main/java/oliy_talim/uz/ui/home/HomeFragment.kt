package oliy_talim.uz.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import oliy_talim.uz.R
import oliy_talim.uz.databinding.FragmentHomeBinding
import oliy_talim.uz.db.databse.AppDatabase

class HomeFragment : Fragment() {
    private val appDatabase = context?.let { AppDatabase.getDatabase(it) }
    private val userDao = appDatabase?.userDao()
    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        onClick()
    }

    private fun onClick() {
        binding.apply {
            card1.setOnClickListener {

                findNavController().navigate(R.id.sendFragment)

            }
            card2.setOnClickListener {
                findNavController().navigate(R.id.editFragment)
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}