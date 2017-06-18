package com.example.bills.grid;

import android.app.Activity;
import android.content.res.Resources;
import android.view.Display;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
//import com.yemensoft.gen.PublicVar;
import java.util.ArrayList;

public class MyGridData
        extends LinearLayout
{
    int Col_HightData;
    public ArrayList<TextView> DATA_VIEW;
    Activity context;
    int[] headerCellsWidth;

    public MyGridData(Activity paramActivity, int[] paramArrayOfInt, int paramInt)
    {
        super(paramActivity);
        this.context = paramActivity;
        this.headerCellsWidth = paramArrayOfInt;
        addView(componentGridData());
        paramInt = paramActivity.getWindowManager().getDefaultDisplay().getHeight();
        this.Col_HightData = (70 * paramInt / 100);
    }

    LinearLayout componentGridData()
    {
        LinearLayout localLinearLayout = new LinearLayout(this.context);
        localLinearLayout.setOrientation(HORIZONTAL);
        if (this.Col_HightData > 0) {
            new LinearLayout.LayoutParams(-1, this.Col_HightData);
        }
        for (;;)
        {
            localLinearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            this.DATA_VIEW = new ArrayList();
            int i = 0;
            while (i < this.headerCellsWidth.length)
            {
                LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(this.headerCellsWidth[i], -1);
                localLayoutParams.setMargins(0, 1, 0, 0);
                TextView localTextView = new TextView(this.context);
                localTextView.setBackgroundResource(R.color.black);
                localTextView.setGravity(17);
                localTextView.setPadding(10, 30, 10, 30);
                localTextView.setTextColor(getResources().getColor(R.color.black));
                this.DATA_VIEW.add(localTextView);
                localLinearLayout.addView(localTextView, localLayoutParams);
                i += 1;
            }
            if (this.Col_HightData == 0) {
                new LinearLayout.LayoutParams(-1, -1);
            }
            return localLinearLayout; }
    }

}
