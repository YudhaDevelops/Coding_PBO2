package pegawai;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;
import java.util.logging.*;

public class dataPegawai {

    ArrayList<Pegawai> pegawaiList = new ArrayList<>();
    Pegawai pegawai;

    public dataPegawai() {
        pegawaiList.clear();
    }

    public void fillData() {
        try {
            DateFormat format;
            format = new SimpleDateFormat("dd/MM/yyyy");
            pegawai = new Pegawai("Herry Suharto", "Jl. Merapi indah no.1 Depok", 9500000, format.parse("8/1/2002"));
            pegawaiList.add(pegawai);
            pegawai = new Pegawai("Sri Hartati", "Jl. Pesona Gading no.1 Ngemplak Sleman", 6500000, format.parse("8/2/2000"));
            pegawaiList.add(pegawai);
            pegawai = new Pegawai("Felicia Tiffany", "Jl. Pradipta Dirgantara no.1 Boyolali", 3000000, format.parse("21/1/2003"));
            pegawaiList.add(pegawai);
            pegawai = new Pegawai("Maximus Quinn", "Jl. Wardhani no.1 Depok", 2000000, format.parse("17/10/2002"));
            pegawaiList.add(pegawai);
            pegawai = new Pegawai("Teresa Amelia", "Jl. Blotan Wedomartani no.1 Depok", 1000000, format.parse("18/12/2002"));
            pegawaiList.add(pegawai);
            pegawai = new Pegawai("Patricius Sugeng", "Jl. Kantil 3 no.272 Condong Catur", 4000000, format.parse("28/11/2007"));
            pegawaiList.add(pegawai);
            pegawai = new Pegawai("Tarcisia Sutirah", "Jl. Cempaka 64B Condong Catur", 1800000, format.parse("29/5/2002"));
            pegawaiList.add(pegawai);
        } catch (ParseException ex) {
            Logger.getLogger(dataPegawai.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
