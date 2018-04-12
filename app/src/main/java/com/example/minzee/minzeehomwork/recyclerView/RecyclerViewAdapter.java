package com.example.minzee.minzeehomwork.recyclerView;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.minzee.minzeehomwork.R;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by hanmo on 2018. 4. 12..
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    //RecyclerViewActivity에서 보내준 데이터를 담을 똑같은 배열을 만든다.
    ArrayList<MinzeeItem> minzeeItems;

    public RecyclerViewAdapter(ArrayList<MinzeeItem> minzeeItems) {

        //RecyclerViewActivity에서 보내준 데이터를 담는다.
        this.minzeeItems = minzeeItems;

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())// 아이템뷰가 어디에 들어갈건지 부모의 정보를 알려준다.
                .inflate(R.layout.item_minzee, parent, false); // 아이템뷰에 레이아웃을 붙여준다

        //아이템뷰를 사용할 뷰홀더를 만든다.
        //어떤 아이템(레이아웃)을 사용할 건지 알려준다.
        ViewHolder viewHolder = new ViewHolder(itemView);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        //아이템에 넣어줄 데이터를 한개(이름, 나이가 담긴 MinzeeItem) 꺼낸다.
        MinzeeItem item = minzeeItems.get(position);

        //필요한 데이터(이름, 나이)를 꺼낸다.
        String minzeeName = item.getMinzeeName();
        String minzeeAge = String.valueOf(item.getMinzeeAge());

        //뷰홀더에서 가져온 텍스트 뷰에 데이터를 넣어준다.
        holder.minzeeName.setText(minzeeName);
        holder.minzeeAge.setText(minzeeAge);

    }

    @Override
    public int getItemCount() {
        //데이터의 크기를 알려준다.
        return minzeeItems.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        TextView minzeeName;
        TextView minzeeAge;

        public ViewHolder(View itemView) {
            super(itemView);
            //아이템뷰의 텍스트뷰를 가져온다.
            //왜 가져오느냐?  텍스트뷰에 데이터들을 담아야 하기 때문!
            minzeeName = itemView.findViewById(R.id.minzeeName);
            minzeeAge = itemView.findViewById(R.id.minzeeAge);
        }
    }

}
