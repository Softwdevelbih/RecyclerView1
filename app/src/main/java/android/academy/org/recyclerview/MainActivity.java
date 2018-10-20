package android.academy.org.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    //vars
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: started");

        initImageBitmpas();

    }

    private void initImageBitmpas(){
        Log.d(TAG, "initImageBitmaps: preparing bitmpas.");

        mImageUrls.add("https://www.thecanyon.com/images/Havasu-Falls.jpg");
        mNames.add("Havasu Falls");

        mImageUrls.add("http://res.cloudinary.com/simpleview/image/upload/v1504558184/clients/norway/6d185cb5_1903_43a6_bd2b_9771c44d25bc_3c270880-a51d-4199-a673-021a21c8d2a9.jpg");
        mNames.add("Trondheim");

        mImageUrls.add("https://img.flytap.com/countries/portugal.jpg");
        mNames.add("Portugal");

        mImageUrls.add("https://assets.simpleviewcms.com/simpleview/image/upload/c_fill,h_360,q_50,w_720/v1/clients/estespark/5e41e3c7_3174_472a_b85c_ffe35dc7250f_bccff069-05e4-4991-81a5-764ca41e10ad.jpg");
        mNames.add("Rocky Mountain National Park");

        mImageUrls.add("http://posadapachamama.com/wp-content/uploads/2015/08/mahahaul.jpg");
        mNames.add("Mahahual");

        mImageUrls.add("http://t.wallpaperweb.org/wallpaper/nature/1920x1080/whitedessertsand1920x1080wallpaper2941.jpg");
        mNames.add("White Sands Desert");

        mImageUrls.add("https://www.dewanholidays.com/packageImg/large/1515135945_beautiful-australia-01.jpg");
        mNames.add("Australia");

        mImageUrls.add("https://kids.nationalgeographic.com/content/dam/kids/photos/States/O-W/washington-dc-capitol.ngsversion.1435610747994.adapt.1900.1.jpg");
        mNames.add("Washington");

        initRecyclerView();

    }

    private void initRecyclerView(){
        Log.d(TAG, "initRecyclerView: init recyclerview.");
        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, mNames, mImageUrls);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}
