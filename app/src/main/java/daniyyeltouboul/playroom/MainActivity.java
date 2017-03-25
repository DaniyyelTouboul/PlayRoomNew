package daniyyeltouboul.playroom;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;
    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;
    TextView textView;
    FrameLayout frameLayout;
    final String HOMEFRAGTAG = "Home Fragment Tag";
    final String EXPLOREFRAGTAG = "Explore Fragment Tag";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RelativeLayout relativeLayout = (RelativeLayout)findViewById(R.id.fragmentContainer);

        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.fragmentContainer,new HomeFragment(),HOMEFRAGTAG);
        fragmentTransaction.commit();


        bottomNavigationView = (BottomNavigationView)findViewById(R.id.bottomNavBar);
        BottomNavigationViewHelper.disableShiftMode(bottomNavigationView); // disabling the shifting (animation) with a helper class cause its not to be found on the api ** From Stackoverflow

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if (item.getItemId()==R.id.menu_home) {

                    getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer,new HomeFragment()).addToBackStack(null).commit();

                }

                else if (item.getItemId()==R.id.menu_explore) {

                    getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer,new ExploreFragment()).addToBackStack(null).commit();

                }

                else if (item.getItemId()==R.id.menu_create){

                            // NOTHING FOR NOW
                }

                else if (item.getItemId()==R.id.menu_notif) {

                    getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer,new NotificationsFragment()).addToBackStack(null).commit();

                }

                else if (item.getItemId()==R.id.menu_profile) {

                    getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer,new ProfileFragment()).addToBackStack(null).commit();


                }
                return true;
            }
        });
    }
}
