package com.example.minzee.minzeehomwork.recyclerView;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.minzee.minzeehomwork.R;

import java.util.ArrayList;

/**
 * Created by hanmo on 2018. 4. 12..
 */

public class RecyclerViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerview);

        //리사이클러뷰에 넣을 데이터들을 만든다.
        int[] age = new int[]{ 1, 2, 3, 4, 5 };
        String[] name = new String[]{
                "민지 1",
                "민지 2",
                "민지 3",
                "민지 4",
                "민지 5"
        };

        //minzeeItem들을 담을 배열을 만든다.
        ArrayList<MinzeeItem> minzeeItems = new ArrayList();

        for (int i = 0; i < age.length; i++) {
            //데이터들을 넣을 수 있는 공간(MinzeeItem)을 만든다.
            MinzeeItem item = new MinzeeItem();

            //만든 공간에 필요한 데이터들을 넣는다.
            item.setMinzeeAge(age[i]);
            item.setMinzeeName(name[i]);

            //배열에 만든 민지아이템을 넣는다.
            minzeeItems.add(item);

        }

        //리사이클러뷰와 아이템뷰를 합쳐줄 어댑터를 만든다.
        //어뎁어테 아이템뷰에 넣어줄 데이터를 전달해준다.  -> RecyclerViewAdapter(minzeeItems)
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(minzeeItems);

        //아이템을 어떤 방법으로 뿌려줄지 정한다.
        //(한개씩 혹은 두개씩) Linear = 한개씩 뿌려주겠다
        LinearLayoutManager manager = new LinearLayoutManager(this);

        //레이아웃의 리사이클러 뷰를 RecyclerViewActivity에서 사용하기 위해 가져온다
        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        //아이템을 어떤 방법으로 뿌릴지 리사이클러 뷰에게 알려준다.
        recyclerView.setLayoutManager(manager);

        //리사이클러뷰에게 어떤 아이템뷰를 붙일지 알려준다.
        recyclerView.setAdapter(adapter);

    }
}
