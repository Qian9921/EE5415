package com.example.newtohk;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

public class hikinglistexample extends AppCompatActivity {

    private static final int REQUEST_CODE = 1;
    private static final String LOGTAG = "video";
    private VideoView videoView;
    private TextView webUrl;
    private Button resVideoButton;

    public static String[] storge_permissions = { Manifest.permission.READ_EXTERNAL_STORAGE };
    //    @RequiresApi(api = Build.VERSION_CODES.TIRAMISU)
//    public static String[] storge_permissions_33 = {
//            Manifest.permission.READ_MEDIA_AUDIO,
//            Manifest.permission.READ_MEDIA_VIDEO
//    };
    public static String[] permissions() {
        String[] p;
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
//            p = storge_permissions_33;
//        } else {
//            p = storge_permissions;
//        }
        p = storge_permissions;
        return p;
    }





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hikinglistexample);

        ActivityCompat.requestPermissions(hikinglistexample.this, permissions(), REQUEST_CODE);
        resVideoButton = (Button) findViewById(R.id.playbutton);



        videoView = (VideoView) findViewById(R.id.videoView1);
        MediaController mc = new MediaController(this);
        mc.setAnchorView(videoView);
        videoView.setMediaController(mc);
        resVideoButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Uri uri = Uri.parse("android.resource://" +
                        getPackageName()
                        + "/" + R.raw.mailihaojing);
                videoView.setVideoURI(uri);
                videoView.start();
            }
        });





    }
}