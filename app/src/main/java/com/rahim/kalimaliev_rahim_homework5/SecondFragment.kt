package com.rahim.kalimaliev_rahim_homework5

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.rahim.kalimaliev_rahim_homework5.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {
private lateinit var  binding: FragmentSecondBinding
private lateinit var navArgs: SecondFragmentArgs

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


   arguments?.let {
       navArgs = SecondFragmentArgs.fromBundle(it)
   }
 binding.status.text = navArgs.card
 binding.name.text = navArgs.name





    }

}


