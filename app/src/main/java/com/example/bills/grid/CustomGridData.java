package com.example.bills.grid;
//package com.yemensoft.grid;

        import android.app.Activity;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.BaseAdapter;
        import android.widget.TextView;
        import android.widget.Toast;
        import java.util.ArrayList;
        import java.util.List;

public class CustomGridData
        extends BaseAdapter
{
    int Col_HightData;
    public MyGridData GridData;
    public ArrayList<List<String>> _GRID_DATA;
    int[] _headerCellsWidth;
    int[] _headerColsIndex;
    private Activity context;

    public CustomGridData(Activity paramActivity, ArrayList<List<String>> paramArrayList, int[] paramArrayOfInt1, int[] paramArrayOfInt2, int paramInt)
    {
        this.context = paramActivity;
        this._GRID_DATA = paramArrayList;
        this._headerColsIndex = paramArrayOfInt2;
        this._headerCellsWidth = paramArrayOfInt1;
        this.Col_HightData = paramInt;
        this.GridData = new MyGridData(this.context, this._headerCellsWidth, paramInt);
    }

    public int getCount()
    {
        return this._GRID_DATA.size();
    }

    public Object getItem(int paramInt)
    {
        return null;
    }

    public long getItemId(int paramInt)
    {
        return paramInt;
    }

    public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {int i = 0;
        if (paramView == null) {}
        for (;;)
        {
            try
            {
                this.GridData = new MyGridData(this.context, this._headerCellsWidth, this.Col_HightData);
            }
            catch (Exception paramView2)
            {
                Toast.makeText(this.context, "error=" + paramView2.getMessage() + "\n ErrNo=" + "0", Toast.LENGTH_LONG).show();
            }
            if (i < this._headerColsIndex.length)
            {                this.GridData = ((MyGridData)paramView);

                ((TextView)this.GridData.DATA_VIEW.get(this._headerColsIndex[i])).setText((CharSequence)((List)this._GRID_DATA.get(paramInt)).get(i));
                i += 1;
                continue;
            }
            else
            {
                for (;;)
                {
                    paramInt = 0;
                    while (paramInt < this._headerCellsWidth.length)
                    {
                        if (this._headerCellsWidth[paramInt] == 0) {
                            ((TextView)this.GridData.DATA_VIEW.get(paramInt)).setVisibility(View.GONE);
                        }
                        paramInt += 1;
                    }
                    return this.GridData;
                }
            }

        }
    }

    public void notifyDataSetChanged()
    {
        super.notifyDataSetChanged();
    }
}
