package id.co.dev.moeslim.cardview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import id.co.dev.moeslim.cardview.adapter.DetailAdapter;
import id.co.dev.moeslim.cardview.beam.Detail;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.LayoutManager mLayoutManager;
    private DetailAdapter detailAdapter;
    private ArrayList<Detail> arrayDetails = new ArrayList<>();

    String tampung1, tampung2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView)findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);

        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        int[] dataNilai = {
                1,
                2,
                3,
                4,
                5
        };

        String[] data = {
                "Satu",
                "Dua",
                "Tiga",
                "Empat",
                "Lima"
        };

        String[] kata = {
                "Putaran",
                "Lipatan",
                "Bundel",
                "Gabungan",
                "Luapan"
        };

        for (int nomor = 0; nomor < dataNilai.length; ++nomor) {}
        for (int dataNya = 0; dataNya < data.length; ++dataNya){}
        for (int kataNya = 0; kataNya < kata.length; ++kataNya){}

        for (int loop = 0; loop < dataNilai.length; ++loop){
            System.out.println(dataNilai[loop]);
            arrayDetails.add(new Detail("" + data[loop], "" + kata[loop]));
        }



//        arrayDetails.add(new Detail("Wahyu Saputra", "wahyusaputra@gmail.com"));
//        arrayDetails.add(new Detail("Fuji Dari", "daari@gmail.com"));
//        arrayDetails.add(new Detail("Muhammad Ishak", "ishakid@gmail.com"));
//        arrayDetails.add(new Detail("Fuji Septiyani", "septiyanifuji@gmail.com"));
//        arrayDetails.add(new Detail("Wulan Anggraeni", "woelanid@gmail.com"));

        detailAdapter = new DetailAdapter(this, arrayDetails);
        mRecyclerView.setAdapter(detailAdapter);
    }
}
