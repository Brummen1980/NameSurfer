package com.graph.namesurfer;

import java.util.ArrayList;

public class NameDataEntre {
    private String Name = "";
    private ArrayList<Integer> Data = new ArrayList<>(10);

    public NameDataEntre(String source) {
        if (source == null) throw  new RuntimeException("Source string is null");
        if (source.isEmpty()) throw new RuntimeException("Source string is empty");
        String[] str = source.split(" ");
        if (str.length < 2) throw new RuntimeException("Source string format is not valid");

        for (int i = 1; i < str.length; i++) Data.add(Integer.parseInt(str[i]));
        Name = Utils.Capitalize(str[0]);
    }

    public NameDataEntre Add(NameDataEntre nde){
        if (Name == nde.Name)
            for (int i = 0; i < Math.min(Data.size(), nde.Data.size()); i++)
                Data.set(i, Data.get(i) + nde.Data.get(i));

        return this;
    }

    public int getPointsCount() { return Data.size(); }

    public String getName() { return Name; }
    public Integer getValue(int i) { return Data.get(i); }
}
