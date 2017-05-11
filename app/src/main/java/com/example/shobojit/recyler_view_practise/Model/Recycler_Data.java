package com.example.shobojit.recyler_view_practise.Model;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by SHOBOJIT on 5/10/2017.
 */

public class Recycler_Data {

    private static final String []name = {"Java","Android","HTMl","CSS","Javascript","Python",
            "Ai","Ml","Angular","NodeJs"};
    private static final  int [] icon ={
            android.R.drawable.ic_popup_reminder,
            android.R.drawable.ic_popup_reminder,
            android.R.drawable.ic_popup_reminder,
            android.R.drawable.ic_popup_reminder,
            android.R.drawable.ic_popup_reminder,
            android.R.drawable.ic_popup_reminder,
            android.R.drawable.ic_popup_reminder,
            android.R.drawable.ic_popup_reminder,
            android.R.drawable.ic_popup_reminder,
            android.R.drawable.ic_popup_reminder
    };

    public static List<List_data> getListItem(){
        List<List_data> data = new ArrayList<>();
        for (int x = 0 ; x <=4 ; x++){
            for (int i = 0 ; i<name.length &&i <icon.length;i++){
                List_data item = new List_data();
                item.setIcon(icon[i]);
                item.setName(name[i]);
                data.add(item);
            }
        }
        return data;
    }
}



