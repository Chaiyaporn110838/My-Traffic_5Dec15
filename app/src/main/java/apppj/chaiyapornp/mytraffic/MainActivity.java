package apppj.chaiyapornp.mytraffic;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    //Explicit
    private ListView trafficListView;
    private Button aboutMeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Bind widget
        bindWidget();

        //Button Controller
        buttonController();

        //ListView Controller
        listViewController();

    }   // Main Method นี่คือ เมธอด

    private void listViewController() {


        //For Icon
        final int[] intIcon = {R.drawable.traffic_01, R.drawable.traffic_02,
                R.drawable.traffic_03, R.drawable.traffic_04,
                R.drawable.traffic_05, R.drawable.traffic_06,
                R.drawable.traffic_07, R.drawable.traffic_08,
                R.drawable.traffic_09, R.drawable.traffic_10,
                R.drawable.traffic_11, R.drawable.traffic_12,
                R.drawable.traffic_13, R.drawable.traffic_14,
                R.drawable.traffic_15, R.drawable.traffic_16,
                R.drawable.traffic_17, R.drawable.traffic_18,
                R.drawable.traffic_19, R.drawable.traffic_20};
        //for title
        final String[] titleSrting = new String[20];
        titleSrting[0] = "หัวข้อที่ 1";
        titleSrting[1] = "หัวข้อที่ 2";
        titleSrting[2] = "หัวข้อที่ 3";
        titleSrting[3] = "หัวข้อที่ 4";
        titleSrting[4] = "หัวข้อที่ 5";
        titleSrting[5] = "หัวข้อที่ 6";
        titleSrting[6] = "หัวข้อที่ 7";
        titleSrting[7] = "หัวข้อที่ 8";
        titleSrting[8] = "หัวข้อที่ 9";
        titleSrting[9] = "หัวข้อที่ 10";
        titleSrting[10] = "หัวข้อที่ 11";
        titleSrting[11] = "หัวข้อที่ 12";
        titleSrting[12] = "หัวข้อที่ 13";
        titleSrting[13] = "หัวข้อที่ 14";
        titleSrting[14] = "หัวข้อที่ 15";
        titleSrting[15] = "หัวข้อที่ 16";
        titleSrting[16] = "หัวข้อที่ 17";
        titleSrting[17] = "หัวข้อที่ 18";
        titleSrting[18] = "หัวข้อที่ 19";
        titleSrting[19] = "หัวข้อที่ 20";


        //For Detail

        String[] detailString = getResources().getStringArray(R.array.detail_short);
        MyAdapter objMyAdapter = new MyAdapter(MainActivity.this, titleSrting, detailString, intIcon);

        trafficListView.setAdapter(objMyAdapter);
        trafficListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent obgIntent = new Intent(MainActivity.this, DetailActivity.class);
                obgIntent.putExtra("Title", titleSrting[position]);
                obgIntent.putExtra("Image", intIcon[position]);
                obgIntent.putExtra("Index", position);
                startActivity(obgIntent);

            }
        });

    }   //ListView Controller

    private void buttonController() {
        aboutMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Sound Effect

                MediaPlayer buttonMediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.sheep);
                buttonMediaPlayer.start();
                //Intent to WebView
                Intent objIntent = new Intent(Intent.ACTION_VIEW);
                objIntent.setData(Uri.parse("https://youtu.be/UOOQWrrZDgY"));
                startActivity(objIntent);

            }   //event
        });
    }

    private void bindWidget() {
        trafficListView = (ListView) findViewById(R.id.listView);
        aboutMeButton = (Button) findViewById(R.id.button);
    }
}   //Main Class  นี่คือคลาสหลัก
