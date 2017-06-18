package com.example.bills.grid;


import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class CustomGridHeader
        extends BaseAdapter {
    MyGridHeader GridHeader;
    public ArrayList<List<String>> _HEADER_COLS;
    int[] _headerCellsWidth;
    int[] _headerColsIndex;
    private Activity context;

    public CustomGridHeader(Activity paramActivity, ArrayList<List<String>> paramArrayList, int[] paramArrayOfInt1, int[] paramArrayOfInt2, int paramInt) {
        this.context = paramActivity;
        this._HEADER_COLS = paramArrayList;
        this._headerColsIndex = paramArrayOfInt2;
        this._headerCellsWidth = paramArrayOfInt1;
        this.GridHeader = new MyGridHeader(this.context, paramArrayOfInt1, paramInt);
    }

    public int getCount() {
        return this._HEADER_COLS.size();
    }

    public Object getItem(int paramInt) {
        return null;
    }

    public long getItemId(int paramInt) {
        return 0L;
    }

    @SuppressLint("ServiceCast")
    public View getView(int paramInt, View paramView, ViewGroup paramViewGroup) {
       // LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        paramViewGroup = (ViewGroup) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);


        if (paramView == null) {
            new View(this.context);
            paramView = this.GridHeader;
        }
        for (; ; ) {
            int i = 0;
            while (i < this._headerColsIndex.length) {
                ((TextView) this.GridHeader.HEADER_VIEW.get(this._headerColsIndex[i])).setText((CharSequence) ((List) this._HEADER_COLS.get(paramInt)).get(i));
                i += 1;
            }
            paramInt = 0;
            while (paramInt < this._headerCellsWidth.length) {
                if (this._headerCellsWidth[paramInt] == 0) {
                    ((TextView) this.GridHeader.HEADER_VIEW.get(paramInt)).setVisibility(View.GONE);
                }
                paramInt += 1;
            }
            return paramView;
        }

    }
}
