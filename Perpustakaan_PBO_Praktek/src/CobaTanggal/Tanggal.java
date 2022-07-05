package CobaTanggal;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Tanggal {

    private String getTanggal() {
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date date = new Date();
        return dateFormat.format(date);
    }

    private String getWaktu() {
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);
    }
//    private String tambahTanggal(String tgl){
//        LocalDate date = LocalDate.parse();
//        LocalDate tanggal = date.plusDays(5);
//        return tanggal.toString();
//    }

    public static void main(String Args[]) {
        Tanggal tgl = new Tanggal();
        String tanggal = tgl.getTanggal();
//        System.out.println("Tanggal mendatang : " + tgl.tambahTanggal(tanggal));
        System.out.println("Sekarang tanggal : " + tgl.getTanggal());
        System.out.println("Waktu sekarang : " + tgl.getWaktu());

        Date _now = new Date();
        Instant _instant = _now.toInstant().minus(5, ChronoUnit.DAYS);
        Date _newDate = Date.from(_instant);
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        
        System.out.println("new Date : "+ dateFormat.format(_newDate));
        
        
        Instant _instant2 = _now.toInstant().plus(5, ChronoUnit.DAYS);
        Date _newDate2 = Date.from(_instant2);
        DateFormat dateFormat2 = new SimpleDateFormat("dd-MM-yyyy");
        
        System.out.println("new Date : "+ dateFormat2.format(_newDate2));
    }

}
