package oliy_talim.uz.ui.splash

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.navigation.fragment.findNavController
import oliy_talim.uz.MainActivity
import oliy_talim.uz.R
import oliy_talim.uz.databinding.FragmentSplashBinding

class SplashFragment : Fragment() {
    lateinit var binding: FragmentSplashBinding
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val animation = AnimationUtils.loadAnimation(context, R.anim.anim)
        binding = FragmentSplashBinding.inflate(layoutInflater)
        binding.image.startAnimation(animation)
        Handler(Looper.getMainLooper()).postDelayed({

            findNavController().popBackStack()
            findNavController().navigate(R.id.registrFragment)


        }, 3000)
        return binding.root
    }

    override fun onStart() {
        super.onStart()
        (activity as MainActivity).hidToolbar()
    }


}