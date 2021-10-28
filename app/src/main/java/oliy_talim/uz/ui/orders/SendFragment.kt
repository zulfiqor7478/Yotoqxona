package oliy_talim.uz.ui.orders

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import oliy_talim.uz.R
import oliy_talim.uz.databinding.FragmentSendBinding
import oliy_talim.uz.db.databse.AppDatabase

class SendFragment : Fragment() {
    private val database = context?.let { AppDatabase.getDatabase(it) }

    private val userDao = database?.userDao()
    lateinit var binding: FragmentSendBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentSendBinding.inflate(layoutInflater)


        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        onClick()
    }

    private fun onClick() {
        binding.apply {
            save.setOnClickListener {
                Toast.makeText(context, "Ma'lumotla saqlandi", Toast.LENGTH_SHORT).show()
                findNavController().popBackStack()

            }
        }
    }
}