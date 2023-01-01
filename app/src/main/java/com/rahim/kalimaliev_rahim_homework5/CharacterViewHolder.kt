package com.rahim.kalimaliev_rahim_homework5

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.rahim.kalimaliev_rahim_homework5.databinding.RecycleViewModelBinding
import java.util.ArrayList

class CharacterViewHolder(val CharacterList: ArrayList<CharacterModel>,
val onClick: (position: Int) -> Unit): RecyclerView.Adapter<CharacterViewHolder.PersonViewHolder>() {



   inner class PersonViewHolder(private val binding: RecycleViewModelBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(){
          val item = CharacterList[adapterPosition]
            binding.txStatus.text = item.characterStatus
            binding.characterName.text = item.characterName
            binding.ivCharacters.loadImage(item.characterImage)
            itemView.setOnClickListener{
                onClick(adapterPosition)
            }
        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonViewHolder {
      return PersonViewHolder(RecycleViewModelBinding.inflate(LayoutInflater.from(parent.context),parent,false))

    }

    override fun onBindViewHolder(holder: PersonViewHolder, position: Int) {
     holder.bind()
    }

    override fun getItemCount(): Int {
      return CharacterList.size
    }


}