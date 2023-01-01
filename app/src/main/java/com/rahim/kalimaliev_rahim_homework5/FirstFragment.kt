package com.rahim.kalimaliev_rahim_homework5

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.rahim.kalimaliev_rahim_homework5.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {

private lateinit var binding: FragmentFirstBinding

companion object{
    const val USER = "USERNAME"
    const val STATUS = "STATUS"
}

private var list =  arrayListOf<CharacterModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstBinding.inflate(layoutInflater)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        loadData()
        val adapter = CharacterViewHolder(list, this:: onClick)
        binding.recycleView.adapter =adapter


    }

    private fun loadData() {
        list.add(CharacterModel(R.drawable.img_3, "Dead", "Ворд из холодной долины"))
        list.add(CharacterModel(R.drawable.img_2, "Dead", "Судия Гундир"))
        list.add(CharacterModel(R.drawable.img_1, "Dead", "Хранитель Бездны"))
        list.add(CharacterModel(R.drawable.img, "Dead", "Гигант Йорм"))
    }

   private  fun onClick(position: Int){
        binding.apply {

            findNavController().navigate(R.id.secondFragment, bundleOf(
                USER to R.id.character_name, STATUS to R.id.tx_status,

                "IMAGE" to R.id.iv_characters))


        }
    }
}



