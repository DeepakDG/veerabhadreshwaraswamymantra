package com.arka.veerabhadraswamymantra;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.viewpager.widget.ViewPager;

public class PagerActivity extends Activity
{
    private ViewPager pager = null;
    private MainPagerAdapter pagerAdapter = null;

    //-----------------------------------------------------------------------------
    @Override
    public void onCreate (Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView (R.layout.activity_welcome);

//    ... do other initialization, such as create an ActionBar ...

        pagerAdapter = new MainPagerAdapter();
        pager = (ViewPager) findViewById (R.id.view_pager);
        pager.setAdapter (pagerAdapter);

        // Create an initial view to display; must be a subclass of FrameLayout.
        LayoutInflater inflater = getLayoutInflater();
        FrameLayout v0 = (FrameLayout) inflater.inflate (R.layout.welcome_slide1, null);
        pagerAdapter.addView (v0, 0);
        pagerAdapter.notifyDataSetChanged();

        // Add textview 1
        TextView textView1 = new TextView(this);
        textView1.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT));
        textView1.getLayoutParams().width = 300;
        textView1.getLayoutParams().height = 300;
        textView1.setText("programmatically created TextView1");
        textView1.setBackgroundColor(0xff66ff66); // hex color 0xAARRGGBB
        textView1.setPadding(20, 20, 20, 20);// in pixels (left, top, right, bottom)
        addView(textView1);



        TextView textView2 = new TextView(this);
        textView2.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT));
        textView2.getLayoutParams().width = 300;
        textView2.getLayoutParams().height = 300;
        textView2.setText("programmatically created TextView2");
        textView2.setBackgroundColor(0xff660066); // hex color 0xAARRGGBB
        textView2.setPadding(20, 20, 20, 20);// in pixels (left, top, right, bottom)
        addView(textView2);

        Button backButton=(Button)findViewById(R.id.btn_back);
        Button nextButton=(Button)findViewById(R.id.btn_next);
        nextButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Next",Toast.LENGTH_SHORT).show();
                pager.setCurrentItem (pager.getCurrentItem()+1, true);
            }
        });


        backButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Back",Toast.LENGTH_SHORT).show();
                pager.setCurrentItem (pager.getCurrentItem()-1, true);
            }
        });

        pager.setCurrentItem (0, true);
    }

    //-----------------------------------------------------------------------------
    // Here's what the app should do to add a view to the ViewPager.
    public void addView (View newPage)
    {
        int pageIndex = pagerAdapter.addView (newPage);
        pagerAdapter.notifyDataSetChanged();
        // You might want to make "newPage" the currently displayed page:
        pager.setCurrentItem (pageIndex, true);
    }

    //-----------------------------------------------------------------------------
    // Here's what the app should do to remove a view from the ViewPager.
    public void removeView (View defunctPage)
    {
        int pageIndex = pagerAdapter.removeView (pager, defunctPage);
        // You might want to choose what page to display, if the current page was "defunctPage".
        if (pageIndex == pagerAdapter.getCount())
            pageIndex--;
        pager.setCurrentItem (pageIndex);
    }

    //-----------------------------------------------------------------------------
    // Here's what the app should do to get the currently displayed page.
    public View getCurrentPage ()
    {
        return pagerAdapter.getView (pager.getCurrentItem());
    }

    //-----------------------------------------------------------------------------
    // Here's what the app should do to set the currently displayed page.  "pageToShow" must
    // currently be in the adapter, or this will crash.
    public void setCurrentPage (View pageToShow)
    {
        pager.setCurrentItem (pagerAdapter.getItemPosition (pageToShow), true);
    }
}
