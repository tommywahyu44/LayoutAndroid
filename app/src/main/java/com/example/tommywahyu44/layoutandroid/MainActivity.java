package com.example.tommywahyu44.layoutandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    TableRow row;
    TableLayout tableLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.linear_layout);
//        setContentView(R.layout.frame_layout);
//        setContentView(R.layout.relative_layout);
//        setContentView(R.layout.constraint_layout);
        setContentView(R.layout.table_layout);
        InsertRow("produk A","2");
        InsertRow("produk B","4");

    }

    public void InsertRow(String P1, String P2) {
        tableLayout = findViewById(R.id.tableLayoutId);
        row = (TableRow) getLayoutInflater().inflate(R.layout.table_row_layout, null);

        ((TextView) row.findViewById(R.id.TextTable)).setText(P1);
        ((TextView) row.findViewById(R.id.TextTable2)).setText(P2);

        tableLayout.addView(row);

    }
}
