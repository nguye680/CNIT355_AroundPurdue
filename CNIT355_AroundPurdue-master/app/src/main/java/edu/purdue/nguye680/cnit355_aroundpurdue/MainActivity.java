package edu.purdue.nguye680.cnit355_aroundpurdue;

import static android.view.Gravity.CENTER;
import static android.view.Gravity.CENTER_HORIZONTAL;
import static android.view.Gravity.CENTER_VERTICAL;
import static android.view.Gravity.FILL_HORIZONTAL;
import static android.view.Gravity.FILL_VERTICAL;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    static int place;
    static ArrayList<Location> locations = new ArrayList<Location>();
    ArrayList<String> names = new ArrayList<String>();
    Spinner spinner;
    String[] categories = { "Purdue", "Nature", "Restaurants", "Shopping", "Activities", "Exhibitions", "21+", "Cafes", "Chill"};
    String categorySelected;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = (Spinner) findViewById(R.id.spinner);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int pos, long id) {
                categorySelected = categories[pos];
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }


        });


        Location.A.name = "Purdue Memorial Union";
        Location.A.filter ="Purdue";
        Location.A.recommendation = "Visiting Purdue Hotel \n Study with friends \n Chill in front of the fireplace \n Attend Special events";
        Location.A.description = "Memorial Union";
        Location.A.price = "N/A";
        Location.A.rate = "⭐⭐⭐⭐";
        Location.A.location = "West Lafayette";
        Location.A.address = "101 Grant St, West Lafayette, IN 47906";
        Location.A.time = "Monday - Sunday 6:00 am - 12:00 am";
        Location.A.contact = "(765) 494-8899";
        Location.A.link = "https://www.union.purdue.edu/";
        locations.add(Location.A);

        Location.B.name = "Purdue Convocations";
        Location.B.filter ="Purdue";
        Location.B.recommendation = "Watch musical \n Watch TED talk \n Watch live music";
        Location.B.description = "Convocation (live music, performances, and events)";
        Location.B.price = "$$";
        Location.B.rate = "⭐⭐⭐⭐";
        Location.B.location = "West Lafayette";
        Location.B.address = "Stewart Center, 128 Memorial Mall Dr, West Lafayette, IN 47907";
        Location.B.time = "Monday - Friday 8:00 am - 5:00 pm";
        Location.B.contact = "(765) 494-9712";
        Location.B.link = "https://www.purdue.edu/convocations/";
        locations.add(Location.B);

        Location.C.name = "Jules Janick Horticulture Garden";
        Location.C.filter="Purdue";
        Location.C.recommendation = "";
        Location.C.description = "Horticulture Garden";
        Location.C.price = "N/A";
        Location.C.rate = "⭐⭐⭐⭐";
        Location.C.location = "West Lafayette";
        Location.C.address = "Marsteller St, West Lafayette, IN 47906";
        Location.C.time = "24 hours";
        Location.C.contact = "(765) 494-1296 \n haydenml@purdue.edu";
        Location.C.link = "https://www.arboretum.purdue.edu/come-learn/horticulture-garden/";
        locations.add(Location.C);

        Location.D.name = "Purdue Horticulture Gardens";
        Location.D.filter="Purdue, Nature";
        Location.D.recommendation = "";
        Location.D.description = "Horticulture Park";
        Location.D.price = "N/A";
        Location.D.rate = "⭐⭐⭐⭐";
        Location.D.location = "West Lafayette";
        Location.D.address = "Marsteller St, West Lafayette, IN 47906";
        Location.D.time = "24 hours";
        Location.D.contact = "(765) 494-1296 \n haydenml@purdue.edu";
        Location.D.link = "https://www.arboretum.purdue.edu/come-learn/horticulture-garden/";
        locations.add(Location.D);

        Location.E.name = "Ross-Ade Stadium";
        Location.E.filter="Purdue, Sports";
        Location.E.recommendation = "Watch Football \n Watch Basketball \n Watch Volleyball";
        Location.E.description = "Sporting Events";
        Location.E.price = "$$";
        Location.E.rate = "⭐⭐⭐";
        Location.E.location = "West Lafayette";
        Location.E.address = "John R Wooden Dr, West Lafayette, IN 47906";
        Location.E.time = "24 hours";
        Location.E.contact = "";
        Location.E.link = "";
        locations.add(Location.E);

        Location.F.name = "Purdue Galleries";
        Location.F.filter = "Purdue, Exhibition";
        Location.F.recommendation = "";
        Location.F.description = "";
        Location.F.price = "";
        Location.F.rate = "⭐⭐⭐";
        Location.F.location = "West Lafayette";
        Location.F.address = "552 W Wood St, West Lafayette, IN 47907";
        Location.F.time = "Monday-Friday: 10:00 am - 5:00 pm";
        Location.F.contact = "(765) 494-3061";
        Location.F.link = "https://www.cla.purdue.edu/academic/rueffschool/galleries/index.html";
        locations.add(Location.F);

        Location.G.name = "Union Rack & Roll";
        Location.G.filter = "Purdue, Activity";
        Location.G.recommendation = "Play bowling";
        Location.G.description = "Bowling";
        Location.G.price = "$";
        Location.G.rate = "⭐⭐⭐";
        Location.G.location = "West Lafayette";
        Location.G.address = "101 S Grant St, West Lafayette, IN 47906";
        Location.G.time = "Monday      10AM–9PM \n Tuesday    10AM–9PM \n Wednesday  10AM–9PM \n Thursday   10AM–11PM \n Friday       10AM–11PM \n Saturday  10AM–11PM \n Sunday       1PM–9PM";
        Location.G.contact = "(765) 494-8990";
        Location.G.link = "https://union.purdue.edu/racknroll/index.html";
        locations.add(Location.G);

        Location.H.name = "All Fired Up";
        Location.H.filter = "Activity";
        Location.H.recommendation = "Paint the seasonal pottery";
        Location.H.description = "Pottery";
        Location.H.price = "$$";
        Location.H.rate = "⭐⭐⭐";
        Location.H.location = "West Lafayette";
        Location.H.address = "375 Brown St, West Lafayette, IN 47906";
        Location.H.time = "Monday      12PM–9PM \n Tuesday    12PM–9PM \n Wednesday  12PM–9PM \n Thursday   12PM–9PM \n Friday    12PM–9PM \n Saturday   12PM–9PM \n Sunday    12PM–5PM";
        Location.H.contact = "(765) 743-7800";
        Location.H.link = "https://www.allfiredupwestlafayette.com/";
        locations.add(Location.H);

        for (int i = 0; i < locations.size(); i++) {
            names.add(locations.get(i).name);
        }

        TableLayout tl = (TableLayout) findViewById(R.id.tableLayout1);

        for( int i = 0; i < names.size(); i = i + 2)
        {
            int j = i + 1;
            TableRow tr = new TableRow(this);
            TextView textview2 = new TextView(this);
            TextView textview3 = new TextView(this);
            RelativeLayout ll = new RelativeLayout(this);
            RelativeLayout ll2 = new RelativeLayout(this);
            ImageView iv = new ImageView(this);
            ImageView iv2 = new ImageView(this);

            int paddingDp = 5;
            float density = getResources().getDisplayMetrics().density;
            int paddingPixel = (int)(paddingDp * density);

            tr.setGravity(CENTER);
            LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(paddingPixel * 39, paddingPixel * 7, 1);
            LinearLayout.LayoutParams lp2 = new LinearLayout.LayoutParams(paddingPixel * 39, paddingPixel * 50);


            ll.setLayoutParams(lp);
            ll2.setLayoutParams(lp);


            lp.setMargins(paddingPixel, paddingPixel, paddingPixel, 0);
            lp2.setMargins(paddingPixel, 0, paddingPixel, 0);
            tr.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT, TableRow.LayoutParams.WRAP_CONTENT));

            textview2.setText(names.get(i));
            textview2.setTextColor(getResources().getColor(R.color.black));
            textview2.setBackgroundResource(R.color.purdue);
            textview2.setGravity(CENTER);

            textview3.setText(names.get(j));
            textview3.setTextColor(getResources().getColor(R.color.black));
            textview3.setBackgroundResource(R.color.purdue);
            textview3.setGravity(CENTER);

            iv.setImageResource(R.drawable.sample);
            iv2.setImageResource(R.drawable.sample);


            textview2.setLayoutParams(lp);
            textview3.setLayoutParams(lp);
            iv.setLayoutParams(lp2);
            iv2.setLayoutParams(lp2);
            ll.addView(textview2);
            ll.addView(iv);
            ll2.addView(textview3);
            ll2.addView(iv2);

            tr.addView(ll, new TableRow.LayoutParams(0));
            tr.addView(ll2, new TableRow.LayoutParams(0));
            tl.addView(tr, new TableLayout.LayoutParams(TableLayout.LayoutParams.MATCH_PARENT, TableLayout.LayoutParams.WRAP_CONTENT));

            int I = i;
            iv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    place = I;
                    Intent intent = new Intent(MainActivity.this, GuideActivity.class);
                    startActivity(intent);
                }
            });
            iv2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    place = j;
                    Intent intent = new Intent(MainActivity.this, GuideActivity.class);
                    startActivity(intent);
                }
            });


        }


    }



    public void openDetailedPage(View view) {
        Intent mIntent = new Intent (this, GuideActivity.class);
        startActivity(mIntent);
    }

    public void openSavedPage(View view) {
        Intent mIntent = new Intent (this, SaveActivity.class);
        startActivity(mIntent);
    }
}