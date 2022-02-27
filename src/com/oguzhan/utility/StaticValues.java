package com.oguzhan.utility;

import com.oguzhan.repository.entity.BuroElemani;
import com.oguzhan.repository.entity.Hizmetli;
import com.oguzhan.repository.entity.Mudur;
import com.oguzhan.repository.entity.Muhendis;

import java.util.ArrayList;
import java.util.List;

public class StaticValues {

    /**
     * Static ve public olduğu için her yerden erişilebilir...
     */
    public static List<Mudur> mudurList = new ArrayList<>();
    public static List<Muhendis> muhendisList = new ArrayList<>();
    public static List<Hizmetli> hizmetliList = new ArrayList<>();
    public static List<BuroElemani> buroElemaniList = new ArrayList<>();

    /**
     * Birisi gelip bunu elle(kod ile) sıfırlar ise ??
     */
    private static int prs_siraNo = 0;
    // Solution is;
    public static int getPrs_siraNo(){
        prs_siraNo++;
        return prs_siraNo;
    }
    //-------------------


}
