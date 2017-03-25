package daniyyeltouboul.playroom;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.UnknownFormatFlagsException;

/**
 * Created by Daniyyel on 08/03/2017.
 */

public class HomeFragment extends android.support.v4.app.Fragment {

    String imageUrl = "http://www.atpworldtour.com/-/media/tennis/players/gladiator/2016/daniel_full_16.png";
    private RecyclerView recyclerView;
    ArrayList <Room> rooms;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        try {
            rooms = new ArrayList<Room>();

           rooms.add(imageUrl,"2","One","This","This","This","This","This",imageUrl);

       } catch (Exception recyclerViewProblem) {
            rooms = new ArrayList<>();
        }

        TextView textView1 = (TextView)getView().findViewById(R.id.testtext);
        recyclerView = (RecyclerView)getView().findViewById(R.id.recycler);

        LinearLayoutManager lim = new LinearLayoutManager(getContext());
        lim.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(lim);

        RoomAdapter roomAdapter = new RoomAdapter(rooms);
        recyclerView.setAdapter(roomAdapter);

        View view = inflater.inflate(R.layout.home_fragment,container,false);
        return view;
    }


}


