package com.hgdev.thequotebook;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;


public class Quotebook extends ActionBarActivity {
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quotebook);

        RelativeLayout touch = (RelativeLayout) findViewById(R.id.touch);
        final TextView quoteText = (TextView) findViewById(R.id.quote);
        final TextView personText = (TextView) findViewById(R.id.person);

        final ArrayList<Quote> quoteArrayList = new ArrayList<Quote>();

        Quote quote1 = new Quote("When Students cheat on exams it's because our School System values grades more than Students value learning.", "Neil Degrasse Tyson");
        quoteArrayList.add(quote1);

        Quote quote2 = new Quote("We ask 18-year-olds to make huge decisions about their career and financial future, when a month ago they had to ask to go to the bathroom.", "Adam Kotsko");
        quoteArrayList.add(quote2);

        Quote quote3 = new Quote("The day the child realizes that all adults are imperfect, he becomes an adolescent; the day he forgives them, he becomes an adult; the day he forgives himself, he becomes wise.", "Alden Nowlan");
        quoteArrayList.add(quote3);

        Quote quote4 = new Quote("When I was a boy of 14, my father was so ignorant I could hardly stand to have the old man around. But when I got to be 21, I was astonished at how much the old man had learned in seven years.", "Mark Twain");
        quoteArrayList.add(quote4);

        touch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(count < quoteArrayList.size())
                {
                    Quote q = quoteArrayList.get(count);
                    quoteText.setText(q.getQuote());
                    personText.setText(q.getPerson());

                    count++;
                }
                else
                {
                    count = 0;
                }
            }
        });


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_quotebook, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
