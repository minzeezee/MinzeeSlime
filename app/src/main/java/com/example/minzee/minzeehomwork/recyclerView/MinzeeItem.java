package com.example.minzee.minzeehomwork.recyclerView;

/**
 * Created by hanmo on 2018. 4. 12..
 */
//데이터들을 담을 그릇을 만든다. (이름, 나이)
public class MinzeeItem {

    private int minzeeAge;
    private String minzeeName;

    public int getMinzeeAge() {
        return minzeeAge;
    }

    public void setMinzeeAge(int minzeeAge) {
        this.minzeeAge = minzeeAge;
    }

    public String getMinzeeName() {
        return minzeeName;
    }

    public void setMinzeeName(String minzeeName) {
        this.minzeeName = minzeeName;
    }

}
