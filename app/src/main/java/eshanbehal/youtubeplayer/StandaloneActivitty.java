package eshanbehal.youtubeplayer;

import android.content.Intent;
import android.database.DefaultDatabaseErrorHandler;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeStandalonePlayer;

public class StandaloneActivitty extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_standalone);

        Button btnPlayVideo = (Button) findViewById(R.id.btnPlayVideo);
        Button btnPlaylist = (Button) findViewById(R.id.btnPlayList);

        btnPlayVideo.setOnClickListener(this);
        btnPlaylist.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent = null;

        switch (view.getId()){
            case R.id.btnPlayVideo:
                YouTubeStandalonePlayer.createVideoIntent(this , YouTubeActivity.GOOGLE_API_KEY , YouTubeActivity.YOUTUBE_VIDEO_ID);
                break;

            case R.id.btnPlayList:
                YouTubeStandalonePlayer.createVideoIntent(this , YouTubeActivity.GOOGLE_API_KEY , YouTubeActivity.YOUTUBE_PLAYLIST);
                break;

                default:
        }

        if (intent != null ){
            startActivity(intent);
        }

    }
}
