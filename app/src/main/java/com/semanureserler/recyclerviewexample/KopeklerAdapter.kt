package com.semanureserler.recyclerviewexample

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.semanureserler.recyclerviewexample.databinding.KopekCardTasarimBinding

class KopeklerAdapter(private var kopeklerList: ArrayList<KopekModel>):RecyclerView.Adapter<KopeklerAdapter.KopekCardTasarim>(){

    class KopekCardTasarim(val kopekCardTasarimBinding:KopekCardTasarimBinding)//binding istedik
        :RecyclerView.ViewHolder(kopekCardTasarimBinding.root)//activitydeki setcontetview gibi düşünebiliriz
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): KopeklerAdapter.KopekCardTasarim {
        val layoutInflater=LayoutInflater.from(parent.context)
        val kopekCardTasarimBinding=KopekCardTasarimBinding.inflate(layoutInflater,parent,false)
        return KopekCardTasarim(kopekCardTasarimBinding)
    }

    override fun onBindViewHolder(holder: KopeklerAdapter.KopekCardTasarim, position: Int) {
      val kopek=kopeklerList[position]
        holder.kopekCardTasarimBinding.kopekimageView.setImageResource(kopek.kopekGorsel)
        holder.kopekCardTasarimBinding.kopektextView.text=kopek.kopekTur
    }

    override fun getItemCount(): Int {
       return kopeklerList.size
    }
}