package com.example.mango.fehteambuilder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.List;

public class HeroEditActivity extends AppCompatActivity {


    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference myHeroRef;

    private List<Unit> heroDB;
    private String selectedUnitName;

    private Unit currentUnit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hero_edit);
        currentUnit = new Unit();
        selectedUnitName = "takumi";
        //FirebaseDatabase database = FirebaseDatabase.getInstance();
        //DatabaseReference myHeroRef = database.getReference().child("hero").child(selectedUnitName);
        //addDBListener();
    }

    private void addDBListener(){
        myHeroRef.addValueEventListener(new ValueEventListener(){
            public void onDataChange(DataSnapshot dataSnapshot){
                String name = (String)dataSnapshot.child("name").getValue();
                System.out.println(name);
                TextView mTV = (TextView) findViewById(R.id.textViewHeroName);
                mTV.setText(name);
            }

            public void onCancelled(DatabaseError error){

            }
        });
    }

    private void initUnit(String _name, String _title, int[][] _baseStats, String[] _baseSkills,
                          MyEnums.MoveType _moveType, MyEnums.WeaponType _weaponType){
        currentUnit = new Unit(_name, _title, _baseStats, _baseSkills, _moveType, _weaponType);

    }

    private void createTestHero(){
        Unit testUnit = new Unit();



        heroDB.add(testUnit);
    }
}
