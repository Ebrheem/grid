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

public class MyGridHeader
        extends LinearLayout
{
    public ArrayList<TextView> HEADER_VIEW;
    public int HightHeader_;
    Activity context;
    int[] headerCellsWidth;

    public MyGridHeader(Activity paramActivity, int[] paramArrayOfInt, int paramInt)
    {
        super(paramActivity);
        this.context = paramActivity;
        this.headerCellsWidth = paramArrayOfInt;
        this.HightHeader_ = paramInt;
        addView(componentGridHeaders());
        paramActivity.getWindowManager().getDefaultDisplay().getHeight();
    }

    LinearLayout componentGridHeaders()
    {
        LinearLayout localLinearLayout = new LinearLayout(this.context);
        localLinearLayout.setOrientation(HORIZONTAL);
        localLinearLayout.setBackgroundResource(R.color.colorPrimaryDark);
        if (this.HightHeader_ > 0) {
            new LinearLayout.LayoutParams(-1, this.HightHeader_);
        }
        for (;;)
        {
            localLinearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            this.HEADER_VIEW = new ArrayList();
            int i = 0;
            while (i < this.headerCellsWidth.length)
            {
                LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(this.headerCellsWidth[i], -1);
                localLayoutParams.setMargins(0, 1, 0, 0);
                TextView localTextView = new TextView(this.context);
                localTextView.setBackgroundResource(R.color.colorPrimary);
                localTextView.setText("_ListInv_I_Code");
                localTextView.setGravity(17);
                localTextView.setTextColor(getResources().getColor(R.color.white));
                localTextView.setPadding(5, 60, 5, 60);
                this.HEADER_VIEW.add(localTextView);
                localLinearLayout.addView(localTextView, localLayoutParams);
                i += 1;
            }
            if (this.HightHeader_ == 0) {
                new LinearLayout.LayoutParams(-1, -1);
            }
            return localLinearLayout; }

    }
}
