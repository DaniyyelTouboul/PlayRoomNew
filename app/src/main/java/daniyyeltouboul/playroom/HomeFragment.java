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

    String profileUrl = "https://lh3.googleusercontent.com/-l_QP1zl2r8M/AAAAAAAAAAI/AAAAAAAARWs/Cc31JerPK14/s36-p-k-no/photo.jpg";
    String videoUrl = "http://www.clipartkid.com/images/10/large-or-small-college-z8lhi2-clipart.jpg";
    private RecyclerView recyclerView;
    ArrayList <Room> rooms;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        rooms = new ArrayList<Room>();
        rooms.add(new Room(profileUrl,"Daniel Torman","22:22","Rock, Metal","Poison","Alice Cooper","5","6",videoUrl));
//        rooms.add(new Room(profileUrl,"Daniel Torman","22:22","Rock, Metal","Poison","Alice Cooper","5","6",videoUrl));
//        rooms.add(new Room(profileUrl,"Daniel Torman","22:22","Rock, Metal","Poison","Alice Cooper","5","6",videoUrl));
//        rooms.add(new Room(profileUrl,"Daniel Torman","22:22","Rock, Metal","Poison","Alice Cooper","5","6",videoUrl));
//        rooms.add(new Room(profileUrl,"Daniel Torman","22:22","Rock, Metal","Poison","Alice Cooper","5","6",videoUrl));
//        rooms.add(new Room(profileUrl,"Daniel Torman","22:22","Rock, Metal","Poison","Alice Cooper","5","6",videoUrl));
//        rooms.add(new Room(profileUrl,"Daniel Torman","22:22","Rock, Metal","Poison","Alice Cooper","5","6",videoUrl));
//        rooms.add(new Room(profileUrl,"Daniel Torman","22:22","Rock, Metal","Poison","Alice Cooper","5","6",videoUrl));
//        rooms.add(new Room(profileUrl,"Daniel Torman","22:22","Rock, Metal","Poison","Alice Cooper","5","6",videoUrl));
//        rooms.add(new Room(profileUrl,"Daniel Torman","22:22","Rock, Metal","Poison","Alice Cooper","5","6",videoUrl));
//        rooms.add(new Room(profileUrl,"Daniel Torman","22:22","Rock, Metal","Poison","Alice Cooper","5","6",videoUrl));


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


