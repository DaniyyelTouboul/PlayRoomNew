package daniyyeltouboul.playroom;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * Created by Daniyyel on 25/03/2017.
 */

public class ExploreFragment extends android.support.v4.app.Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

//        TextView textView4 = (TextView)getView().findViewById(R.id.textviewExplore);
        View view = inflater.inflate(R.layout.explore_fragment,container,false);
        return view;
    }


}


