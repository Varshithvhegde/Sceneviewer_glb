package com.varshith.sceneviewer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button ar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ar=(Button) findViewById(R.id.arr);
        ar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sceneViewerIntent = new Intent(Intent.ACTION_VIEW);
                Uri intentUri =
                        Uri.parse("https://arvr.google.com/scene-viewer/1.0").buildUpon()
                                .appendQueryParameter("file", "https://firebasestorage.googleapis.com/v0/b/new-touch-reno.appspot.com/o/Bed.glb?alt=media&token=9f2e3a3e-94a7-4f0b-86ab-3f712aee32e1")
                                .appendQueryParameter("mode", "ar_only")
                                .build();
                sceneViewerIntent.setData(intentUri);
//                sceneViewerIntent.setPackage("com.google.ar.core");
                startActivity(sceneViewerIntent);
            }
        });
    }
}