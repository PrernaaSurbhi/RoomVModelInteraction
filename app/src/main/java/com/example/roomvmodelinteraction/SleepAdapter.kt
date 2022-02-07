package com.example.roomvmodelinteraction

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.roomvmodelinteraction.dataBase.SleepDetail

/**
 * Created by PrernaSurbhi on 07/02/22.
 */

public class SleepAdapter(private var sleepDetailList: ArrayList<SleepDetail>) :
    RecyclerView.Adapter<SleepAdapter.SleepAdapterViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SleepAdapterViewHolder {
        var itemView: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.sleep_data_list_item, parent, false)
        return SleepAdapterViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: SleepAdapterViewHolder, position: Int) {
        val sleepDetail:SleepDetail = sleepDetailList.get(position)
        holder.apply {
            startDetail?.text = sleepDetail.startTimeMilli.toString()
            endDetail?.text = sleepDetail.endTimeMilli.toString()
            qualityDetail?.text = sleepDetail.sleepQuality.toString()
            timeDetail?.text = sleepDetail.nightId.toString()
        }
    }

    override fun getItemCount(): Int {
        return sleepDetailList.size
    }

    class SleepAdapterViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var startDetail: TextView? = null
        var endDetail: TextView? = null
        var qualityDetail: TextView? = null
        var timeDetail: TextView? = null

        init {
            startDetail = view.findViewById(R.id.start_detail)
            endDetail = view.findViewById(R.id.end_tv_detail)
            qualityDetail = view.findViewById(R.id.quality_tv_detail)
            timeDetail = view.findViewById(R.id.time_detail)
        }
    }
}