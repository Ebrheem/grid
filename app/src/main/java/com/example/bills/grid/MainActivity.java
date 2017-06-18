package com.example.bills.grid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    GridView gridBill;
    GridView gridBill_Header;
    ArrayList<List<String>> columnData;
    int[] headerCellsWidth;
    ArrayList<List<String>> headerColumns;
    List<String> listColumnNames;
    List<String> listdaaataNames;
    int[] headerColsIndex;
    int Col_HightData = 80;
    int Col_HightHeader = 80;
   ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      gridBill=(GridView)findViewById(R.id.gridBill);
        gridBill_Header=(GridView)findViewById(R.id.gridBill_Header);
        listdaaataNames=new ArrayList();

        listdaaataNames.add("ghj");
        listdaaataNames.add("gyhjk");
        listdaaataNames.add("hjklghj");
        listdaaataNames.add("gdftgyhuhj");
        listdaaataNames.add("gertyuhj");
columnData.add(listdaaataNames);

        this.listColumnNames = new ArrayList();
        listColumnNames.add("dhfgjfhgfd");
        listColumnNames.add("464");
        listColumnNames.add("dhfjkhghgjklgjfhgfd");
        listColumnNames.add("dhfjkjkgjfhgfd");
        listColumnNames.add("hgfd");

        this.headerColumns = new ArrayList();
        this.headerColumns.add(this.listColumnNames);

        CustomGridData  customGridData = new CustomGridData(this, this.columnData, headerCellsWidth, headerColsIndex, 80);

          gridBill.setAdapter(customGridData);
        Display localDisplay = getWindowManager().getDefaultDisplay();

        int i2 = localDisplay.getHeight();
        int i1 = localDisplay.getWidth();
        for (int n = i1 * 20 / 100;; n = 0)
        {
            prepareGridColumnsWidth(0, i1 * 18 / 100);
            prepareGridColumnsWidth(1, i1 * 22 / 100);
            prepareGridColumnsWidth(2, i1 * 15 / 100);
            prepareGridColumnsWidth(3, i1 * 15 / 100);
            prepareGridColumnsWidth(4, 0);
            prepareGridColumnsWidth(5, i1 * 15 / 100);
            prepareGridColumnsWidth(6, 0);
            prepareGridColumnsWidth(7, 0);
            prepareGridColumnsWidth(8, 0);
            prepareGridColumnsWidth(9, n);
            prepareGridColumnsWidth(10, i1 * 15 / 100);
            prepareGridColumnsWidth(11, 0);
            prepareGridColumnsWidth(12, 0);
            prepareGridColumnsWidth(13, 0);
            prepareGridColumnsWidth(14, 0);
            prepareGridColumnsWidth(15, 0);
            this.Col_HightHeader = (i2 * 5 / 100);
            this.Col_HightData = (i2 * 5 / 100);
            this.gridBill_Header.setColumnWidth(0);
            this.gridBill.setColumnWidth(16);
            this.gridBill_Header.setAdapter(new CustomGridHeader(this, this.headerColumns, this.headerCellsWidth, this.headerColsIndex, this.Col_HightHeader));
            return;

        }

    }
    private void prepareGridColumnsWidth(int paramInt1, int paramInt2)
    {
        this.headerCellsWidth[paramInt1] = paramInt2;
        this.headerColsIndex[paramInt1] = paramInt1;

    }
}
