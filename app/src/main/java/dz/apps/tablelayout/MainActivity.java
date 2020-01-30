package dz.apps.tablelayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

@Override
protected void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.activity_main);


	TableLayout tableLayout = findViewById(R.id.tabLayout);


	String[][] months = {{"janvier", "0"}, {"February", "1"}, {"March", "0"}, {"April", "1"},
			{"May", "1"}, {"June", "1"}, {"July", "1"}, {"August", "1"},
			{"September", "1"}, {"October", "1"}, {"November", "1"}, {"December", "1"}};


	for (int i = 0; i < months.length; i++) {

		TextView month = new TextView(this);
		TextView year = new TextView(this);

		TableRow tableRow = new TableRow(this);
		TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT, TableRow.LayoutParams.WRAP_CONTENT);
		tableRow.setLayoutParams(layoutParams);
		layoutParams.weight = 1;

		month.setText(months[i][0]);
		month.setLayoutParams(layoutParams);
		tableRow.addView(month);
		//
		if ((months[i][1].equals("1"))) {

			year.setBackgroundResource(R.drawable.ok);
			//
			tableRow.addView(year);
		} else if (months[i][1].equals("0")) {

			year.setBackgroundResource(R.drawable.no);
			tableRow.addView(year);

		}

		tableLayout.addView(tableRow, new TableLayout.LayoutParams(TableLayout.LayoutParams.WRAP_CONTENT, TableLayout.LayoutParams.WRAP_CONTENT));
	}

}
}
