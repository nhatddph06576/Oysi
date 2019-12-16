package com.oysi.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Filter
import android.widget.Filterable
import androidx.recyclerview.widget.RecyclerView
import com.oysi.R
import com.oysi.filter.FilterHelpCountry
import com.oysi.model.country.Data
import kotlinx.android.synthetic.main.item_country.view.*

class AdapterCountry(var context: Context,var list : ArrayList<Data>,var onclick : onItemSelect) :
    RecyclerView.Adapter<AdapterCountry.ViewHolder>(),Filterable {

    interface onItemSelect{
        fun onclickListener(position: Int)
    }


    class ViewHolder(itemView : View):RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterCountry.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_country,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    fun setCityCraft(filterCountryCraft : ArrayList<Data>?){
        if (filterCountryCraft != null) {
            this.list = filterCountryCraft
        }
    }

    override fun onBindViewHolder(holder: AdapterCountry.ViewHolder, position: Int) {
        holder.itemView.tvCountry.text = list[position].country
        holder.itemView.cardViewCountry.setOnClickListener {
            onclick.onclickListener(position)
        }

        if (holder.itemView.tvCountry.text == "Afghanistan") {
            holder.itemView.imgCountry.setImageResource(R.drawable.afghanistan)
        } else if (holder.itemView.tvCountry.text == "Algeria") {
            holder.itemView.imgCountry.setImageResource(R.drawable.algeria)
        } else if (holder.itemView.tvCountry.text == "Andorra") {
            holder.itemView.imgCountry.setImageResource(R.drawable.andorra)
        } else if (holder.itemView.tvCountry.text == "Algola") {
            holder.itemView.imgCountry.setImageResource(R.drawable.angola)
        } else if (holder.itemView.tvCountry.text == "Argentina") {
            holder.itemView.imgCountry.setImageResource(R.drawable.argentina)
        } else if (holder.itemView.tvCountry.text == "Armenia") {
            holder.itemView.imgCountry.setImageResource(R.drawable.armenia)
        } else if (holder.itemView.tvCountry.text == "Australia") {
            holder.itemView.imgCountry.setImageResource(R.drawable.australia)
        } else if (holder.itemView.tvCountry.text == "Austria") {
            holder.itemView.imgCountry.setImageResource(R.drawable.austria)
        } else if (holder.itemView.tvCountry.text == "Bahamas") {
            holder.itemView.imgCountry.setImageResource(R.drawable.bahamas)
        } else if (holder.itemView.tvCountry.text == "Bahrain") {
            holder.itemView.imgCountry.setImageResource(R.drawable.bahrain)
        } else if (holder.itemView.tvCountry.text == "Bangladest") {
            holder.itemView.imgCountry.setImageResource(R.drawable.bangladesh)
        } else if (holder.itemView.tvCountry.text == "Belgium") {
            holder.itemView.imgCountry.setImageResource(R.drawable.belgium)
        } else if (holder.itemView.tvCountry.text == "Bovilia") {
            holder.itemView.imgCountry.setImageResource(R.drawable.bolivia)
        } else if (holder.itemView.tvCountry.text == "Bosnia Herzegovina") {
            holder.itemView.imgCountry.setImageResource(R.drawable.bosnia)
        } else if (holder.itemView.tvCountry.text == "Brazil") {
            holder.itemView.imgCountry.setImageResource(R.drawable.brazil)
        } else if (holder.itemView.tvCountry.text == "Brunei") {
            holder.itemView.imgCountry.setImageResource(R.drawable.brunei)
        } else if (holder.itemView.tvCountry.text == "Bulgaria") {
            holder.itemView.imgCountry.setImageResource(R.drawable.bulgaria)
        } else if (holder.itemView.tvCountry.text == "Bulgaria") {
            holder.itemView.imgCountry.setImageResource(R.drawable.bulgaria)
        } else if (holder.itemView.tvCountry.text == "Canada") {
            holder.itemView.imgCountry.setImageResource(R.drawable.canada)
        } else if (holder.itemView.tvCountry.text == "Chile") {
            holder.itemView.imgCountry.setImageResource(R.drawable.chile)
        } else if (holder.itemView.tvCountry.text == "China") {
            holder.itemView.imgCountry.setImageResource(R.drawable.china)
        } else if (holder.itemView.tvCountry.text == "Colombia") {
            holder.itemView.imgCountry.setImageResource(R.drawable.colombia)
        } else if (holder.itemView.tvCountry.text == "Croatia") {
            holder.itemView.imgCountry.setImageResource(R.drawable.croatia)
        } else if (holder.itemView.tvCountry.text == "Cyprus") {
            holder.itemView.imgCountry.setImageResource(R.drawable.cyrus)
        } else if (holder.itemView.tvCountry.text == "Czech Republic") {
            holder.itemView.imgCountry.setImageResource(R.drawable.czech)
        } else if (holder.itemView.tvCountry.text == "Democratic Republic of the Congo") {
            holder.itemView.imgCountry.setImageResource(R.drawable.democratic)
        } else if (holder.itemView.tvCountry.text == "Denmark") {
            holder.itemView.imgCountry.setImageResource(R.drawable.denmark)
        } else if (holder.itemView.tvCountry.text == "Ecuador") {
            holder.itemView.imgCountry.setImageResource(R.drawable.ecuador)
        } else if (holder.itemView.tvCountry.text == "Ethiopia") {
            holder.itemView.imgCountry.setImageResource(R.drawable.ethiopia)
        } else if (holder.itemView.tvCountry.text == "Finland") {
            holder.itemView.imgCountry.setImageResource(R.drawable.finland)
        } else if (holder.itemView.tvCountry.text == "France") {
            holder.itemView.imgCountry.setImageResource(R.drawable.france)
        } else if (holder.itemView.tvCountry.text == "Germany") {
            holder.itemView.imgCountry.setImageResource(R.drawable.germany)
        } else if (holder.itemView.tvCountry.text == "Ghana") {
            holder.itemView.imgCountry.setImageResource(R.drawable.bulgaria)
        } else if (holder.itemView.tvCountry.text == "Greece") {
            holder.itemView.imgCountry.setImageResource(R.drawable.greece)
        } else if (holder.itemView.tvCountry.text == "Guatemala") {
            holder.itemView.imgCountry.setImageResource(R.drawable.guatemala)
        } else if (holder.itemView.tvCountry.text == "Haiti") {
            holder.itemView.imgCountry.setImageResource(R.drawable.haiti)
        } else if (holder.itemView.tvCountry.text == "Hong Kong") {
            holder.itemView.imgCountry.setImageResource(R.drawable.hongkong)
        } else if (holder.itemView.tvCountry.text == "Hungary") {
            holder.itemView.imgCountry.setImageResource(R.drawable.hungary)
        } else if (holder.itemView.tvCountry.text == "Iceland") {
            holder.itemView.imgCountry.setImageResource(R.drawable.iceland)
        } else if (holder.itemView.tvCountry.text == "India") {
            holder.itemView.imgCountry.setImageResource(R.drawable.india)
        } else if (holder.itemView.tvCountry.text == "Indonesia") {
            holder.itemView.imgCountry.setImageResource(R.drawable.indonesia)
        } else if (holder.itemView.tvCountry.text == "Iran") {
            holder.itemView.imgCountry.setImageResource(R.drawable.iran)
        } else if (holder.itemView.tvCountry.text == "Iraq") {
            holder.itemView.imgCountry.setImageResource(R.drawable.iraq)
        } else if (holder.itemView.tvCountry.text == "Ireland") {
            holder.itemView.imgCountry.setImageResource(R.drawable.ireland)
        } else if (holder.itemView.tvCountry.text == "Israel") {
            holder.itemView.imgCountry.setImageResource(R.drawable.israel)
        } else if (holder.itemView.tvCountry.text == "Italy") {
            holder.itemView.imgCountry.setImageResource(R.drawable.italy)
        } else if (holder.itemView.tvCountry.text == "Ivory Coast") {
            holder.itemView.imgCountry.setImageResource(R.drawable.ivory_coast)
        } else if (holder.itemView.tvCountry.text == "Japan") {
            holder.itemView.imgCountry.setImageResource(R.drawable.japan)
        } else if (holder.itemView.tvCountry.text == "Jordan") {
            holder.itemView.imgCountry.setImageResource(R.drawable.jordan)
        } else if (holder.itemView.tvCountry.text == "Kazakhstan") {
            holder.itemView.imgCountry.setImageResource(R.drawable.kazakhstan)
        } else if (holder.itemView.tvCountry.text == "Kosovo") {
            holder.itemView.imgCountry.setImageResource(R.drawable.kosovo)
        } else if (holder.itemView.tvCountry.text == "Kuwait") {
            holder.itemView.imgCountry.setImageResource(R.drawable.kuwait)
        } else if (holder.itemView.tvCountry.text == "Kyrgyzstan") {
            holder.itemView.imgCountry.setImageResource(R.drawable.kyrgyzstan)
        } else if (holder.itemView.tvCountry.text == "Laos") {
            holder.itemView.imgCountry.setImageResource(R.drawable.laos)
        } else if (holder.itemView.tvCountry.text == "Latvia") {
            holder.itemView.imgCountry.setImageResource(R.drawable.latvia)
        } else if (holder.itemView.tvCountry.text == "Lithuania") {
            holder.itemView.imgCountry.setImageResource(R.drawable.lithuania)
        } else if (holder.itemView.tvCountry.text == "Luxembourg") {
            holder.itemView.imgCountry.setImageResource(R.drawable.luxembourg)
        } else if (holder.itemView.tvCountry.text == "Macao") {
            holder.itemView.imgCountry.setImageResource(R.drawable.macao)
        } else if (holder.itemView.tvCountry.text == "Macedonia") {
            holder.itemView.imgCountry.setImageResource(R.drawable.macedonia)
        } else if (holder.itemView.tvCountry.text == "Malaysia") {
            holder.itemView.imgCountry.setImageResource(R.drawable.malaysia)
        } else if (holder.itemView.tvCountry.text == "Malta") {
            holder.itemView.imgCountry.setImageResource(R.drawable.malta)
        } else if (holder.itemView.tvCountry.text == "Mexico") {
            holder.itemView.imgCountry.setImageResource(R.drawable.mexico)
        } else if (holder.itemView.tvCountry.text == "Mongolia") {
            holder.itemView.imgCountry.setImageResource(R.drawable.mongolia)
        } else if (holder.itemView.tvCountry.text == "Myanmar") {
            holder.itemView.imgCountry.setImageResource(R.drawable.myanmar)
        } else if (holder.itemView.tvCountry.text == "Nepal") {
            holder.itemView.imgCountry.setImageResource(R.drawable.nepal)
        } else if (holder.itemView.tvCountry.text == "Netherlands") {
            holder.itemView.imgCountry.setImageResource(R.drawable.netherlands)
        } else if (holder.itemView.tvCountry.text == "New Zealand") {
            holder.itemView.imgCountry.setImageResource(R.drawable.newzealand)
        } else if (holder.itemView.tvCountry.text == "Nigeria") {
            holder.itemView.imgCountry.setImageResource(R.drawable.nigeria)
        } else if (holder.itemView.tvCountry.text == "Norway") {
            holder.itemView.imgCountry.setImageResource(R.drawable.norway)
        } else if (holder.itemView.tvCountry.text == "Pakistan") {
            holder.itemView.imgCountry.setImageResource(R.drawable.pakistan)
        } else if (holder.itemView.tvCountry.text == "Peru") {
            holder.itemView.imgCountry.setImageResource(R.drawable.peru)
        } else if (holder.itemView.tvCountry.text == "Philippines") {
            holder.itemView.imgCountry.setImageResource(R.drawable.philippines)
        } else if (holder.itemView.tvCountry.text == "Poland") {
            holder.itemView.imgCountry.setImageResource(R.drawable.poland)
        } else if (holder.itemView.tvCountry.text == "Portugal") {
            holder.itemView.imgCountry.setImageResource(R.drawable.portugal)
        } else if (holder.itemView.tvCountry.text == "Puerto Rico") {
            holder.itemView.imgCountry.setImageResource(R.drawable.puertorico)
        } else if (holder.itemView.tvCountry.text == "Romania") {
            holder.itemView.imgCountry.setImageResource(R.drawable.romania)
        } else if (holder.itemView.tvCountry.text == "Russia") {
            holder.itemView.imgCountry.setImageResource(R.drawable.russia)
        } else if (holder.itemView.tvCountry.text == "San Marino") {
            holder.itemView.imgCountry.setImageResource(R.drawable.sanmarino)
        } else if (holder.itemView.tvCountry.text == "Saudi Arabia") {
            holder.itemView.imgCountry.setImageResource(R.drawable.saudiarabia)
        } else if (holder.itemView.tvCountry.text == "Serbia") {
            holder.itemView.imgCountry.setImageResource(R.drawable.serbia)
        } else if (holder.itemView.tvCountry.text == "Singapore") {
            holder.itemView.imgCountry.setImageResource(R.drawable.singapore)
        } else if (holder.itemView.tvCountry.text == "Slovakia") {
            holder.itemView.imgCountry.setImageResource(R.drawable.slovakia)
        } else if (holder.itemView.tvCountry.text == "Slovenia") {
            holder.itemView.imgCountry.setImageResource(R.drawable.slovenia)
        } else if (holder.itemView.tvCountry.text == "South Africa") {
            holder.itemView.imgCountry.setImageResource(R.drawable.southafrica)
        } else if (holder.itemView.tvCountry.text == "South Korea") {
            holder.itemView.imgCountry.setImageResource(R.drawable.southkorea)
        } else if (holder.itemView.tvCountry.text == "Spain") {
            holder.itemView.imgCountry.setImageResource(R.drawable.spain)
        } else if (holder.itemView.tvCountry.text == "Sri Lanka") {
            holder.itemView.imgCountry.setImageResource(R.drawable.srilanka)
        } else if (holder.itemView.tvCountry.text == "Sweden") {
            holder.itemView.imgCountry.setImageResource(R.drawable.sweden)
        } else if (holder.itemView.tvCountry.text == "Switzerland") {
            holder.itemView.imgCountry.setImageResource(R.drawable.switzerland)
        } else if (holder.itemView.tvCountry.text == "Taiwan") {
            holder.itemView.imgCountry.setImageResource(R.drawable.taiwan)
        } else if (holder.itemView.tvCountry.text == "Thailand") {
            holder.itemView.imgCountry.setImageResource(R.drawable.thailand)
        } else if (holder.itemView.tvCountry.text == "Uganda") {
            holder.itemView.imgCountry.setImageResource(R.drawable.uganda)
        } else if (holder.itemView.tvCountry.text == "Ukraine") {
            holder.itemView.imgCountry.setImageResource(R.drawable.ukraine)
        } else if (holder.itemView.tvCountry.text == "United Arab Emirates") {
            holder.itemView.imgCountry.setImageResource(R.drawable.unitedarabemirates)
        } else if (holder.itemView.tvCountry.text == "United Kingdom") {
            holder.itemView.imgCountry.setImageResource(R.drawable.unitedkingdom)
        } else if (holder.itemView.tvCountry.text == "USA") {
            holder.itemView.imgCountry.setImageResource(R.drawable.unitedstates)
        } else if (holder.itemView.tvCountry.text == "Uzbekistan") {
            holder.itemView.imgCountry.setImageResource(R.drawable.uzbekistan)
        } else if (holder.itemView.tvCountry.text == "Vietnam") {
            holder.itemView.imgCountry.setImageResource(R.drawable.vietnam)
        } else if (holder.itemView.tvCountry.text == "Yemen") {
            holder.itemView.imgCountry.setImageResource(R.drawable.yemen)
        }

    }

    override fun getFilter(): Filter {
        var filterList : ArrayList<Data> = list
        return FilterHelpCountry.instanceCountry(filterList,this)
    }
}