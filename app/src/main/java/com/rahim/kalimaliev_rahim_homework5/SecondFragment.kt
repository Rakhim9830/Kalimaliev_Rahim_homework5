package com.rahim.kalimaliev_rahim_homework5

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.rahim.kalimaliev_rahim_homework5.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {
private lateinit var  binding: FragmentSecondBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


      val name = arguments?.getString(FirstFragment.USER)
      val status = arguments?.getString(FirstFragment.STATUS)
      val image = arguments?.getInt(FirstFragment.IMAGE)
       binding.status.text = status
        binding.name.text = name
        binding.imageCharacter.loadImage(binding.imageCharacter.toString())








    }

}


