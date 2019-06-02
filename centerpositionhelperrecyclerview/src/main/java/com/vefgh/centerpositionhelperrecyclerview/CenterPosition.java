package com.vefgh.centerpositionhelperrecyclerview;

import android.view.View;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.LinearSnapHelper;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SnapHelper;
import android.view.View;

public class CenterPosition {

    private static SnapHelper snapHelper;

    public static CenterPosition init() {
        snapHelper = new LinearSnapHelper();
        return  new CenterPosition();
    }


    public void setRecyclerview(RecyclerView recyclerview, final LinearLayoutManager layoutManager, final getPosition position) {
        snapHelper.attachToRecyclerView(recyclerview);
        recyclerview.addOnScrollListener(new RecyclerView.OnScrollListener() {

            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
                if (newState == RecyclerView.SCROLL_STATE_IDLE) {
                    View centerView = snapHelper.findSnapView(layoutManager);
                    int pos = layoutManager.getPosition(centerView);
                    position.position(pos);

                }
            }
        });
    }

    public interface getPosition {

        void position(int pos);
    }
}
