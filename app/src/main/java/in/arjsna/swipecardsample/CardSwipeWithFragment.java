package in.arjsna.swipecardsample;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

/**
 * Created by arjun on 6/3/17.
 */

public class CardSwipeWithFragment extends AppCompatActivity {
  @Override protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_fragment_demo);
    if (savedInstanceState == null) {
      getSupportFragmentManager().beginTransaction()
          .add(R.id.fragment_container, new FragmentDemo())
          .commit();
    }
  }
}
