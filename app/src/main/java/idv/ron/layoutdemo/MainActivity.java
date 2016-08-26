package idv.ron.layoutdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<View> views;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        views = new ArrayList<>();
    }

    // the clicked image becomes invisible
    public void onImageG1Click(View view) {
        view.setVisibility(View.INVISIBLE);
        views.add(view);
    }

    // the clicked image becomes invisible and doesn't take any space
    public void onImageG2Click(View view) {
        view.setVisibility(View.GONE);
        views.add(view);
    }

    // all the invisible images become visible
    public void onResetClick(View view) {
        if (views != null && views.size() > 0) {
            for (View v : views) {
                v.setVisibility(View.VISIBLE);
            }
        }
    }

}
