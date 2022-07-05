package Project_Perpustakaan;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DBPerpus {

    ArrayList<Peminjam> peminjamList = new ArrayList<>();
    ArrayList<Koleksi> koleksiList = new ArrayList<>();
    ArrayList<Transaksi> transaksiList = new ArrayList<>();
    ArrayList<Transaksi> log_Transaksi = new ArrayList<>();
    ArrayList<Koleksi> pesanKoleksiList;

    Dosen dosen = null;
    Mahasiswa mahasiswa = null;
    Umum umum = null;
    Disk dvd = null;
    Buku buku = null;
    Majalah majalah = null;
    Transaksi transaksi = null;
    String jdbcURL = "jdbc:mysql://localhost:3306/aplikasi_perpustakaan?autoReconnect=true&useSSL=false"; //khusus untuk workbench
    String userid = "root";
    String password = "admin";
    Connection conn = null;
    PreparedStatement preparedStatement;
    Statement statement;
    ResultSet resultSet;
    Date tgl_kembali;
    Date tgl_pinjam;
    float denda = 0;

    public DBPerpus(String usr, String pwd) {
        userid = usr;
        password = pwd;
        dbConnect();
    }

    void dbConnect() {
        boolean stat = Boolean.FALSE;
        try {
//            Class.forName("com.myssql.jdbc.Driver");
            conn = DriverManager.getConnection(jdbcURL, userid, password);
            if (conn != null) {
                stat = Boolean.TRUE;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    Connection getConnection() {
        return conn;
    }

    String getNamaPeminjam(String idPeminjam) throws SQLException {
        String nama = "";
        statement = null;
        resultSet = null;
        statement = conn.createStatement();
        if (idPeminjam.charAt(0) == 'M') {
            resultSet = statement.executeQuery("SELECT nama FROM mahasiswa where id_peminjam = '" + idPeminjam + "'");
            if (!resultSet.wasNull()) {
                while (resultSet.next()) {
                    nama = resultSet.getString("nama");
                }
            }
        }
        if (idPeminjam.charAt(0) == 'D') {
            resultSet = statement.executeQuery("SELECT nama FROM dosen where id_peminjam = '" + idPeminjam + "'");
            if (!resultSet.wasNull()) {
                while (resultSet.next()) {
                    nama = resultSet.getString("nama");
                }
            }
        }
        if (idPeminjam.charAt(0) == 'U') {
            resultSet = statement.executeQuery("SELECT nama FROM umum where id_peminjam = '" + idPeminjam + "'");
            if (!resultSet.wasNull()) {
                while (resultSet.next()) {
                    nama = resultSet.getString("nama");
                }
            }
        }
        return nama;
    }

    int deletTransaksi(String idTransaksi, String idKoleksi) {
        String kueri = "DELETE FROM transaksi WHERE id_transaksi = ? and id_koleksi = ?";
        preparedStatement = null;
        int rq = 0;
        try {
            preparedStatement = conn.prepareStatement(kueri);
            preparedStatement.setString(1, idTransaksi);
            preparedStatement.setString(2, idKoleksi);
            rq = preparedStatement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Transaksi Berhasil Di Hapus", "Info", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return rq;
    }

    ArrayList<Peminjam> getPeminjam() throws SQLException {
        peminjamList.clear();
        statement = null;
        resultSet = null;
        statement = conn.createStatement();
        resultSet = statement.executeQuery("SELECT * FROM dosen");
        if (!resultSet.wasNull()) {
            while (resultSet.next()) {
//                String id_peminjam,String nip, String nama, String alamat, int maks_pinjam
                dosen = new Dosen(
                        resultSet.getString("id_peminjam"),
                        resultSet.getString("nip"),
                        resultSet.getString("nama"),
                        resultSet.getString("alamat"),
                        resultSet.getInt("mak_pinjam")
                );
                peminjamList.add(dosen);
            }
        }
        resultSet = null;
        resultSet = statement.executeQuery("SELECT * FROM mahasiswa");
        if (!resultSet.wasNull()) {
            while (resultSet.next()) {
//                String id_peminjam,String nim, String nama, String alamat, int maks_pinjam
                mahasiswa = new Mahasiswa(
                        resultSet.getString("id_peminjam"),
                        resultSet.getString("nim"),
                        resultSet.getString("nama"),
                        resultSet.getString("alamat"),
                        resultSet.getInt("mak_pinjam")
                );
                peminjamList.add(mahasiswa);
            }
        }
        resultSet = null;
        resultSet = statement.executeQuery("SELECT * FROM umum");
        if (!resultSet.wasNull()) {
            while (resultSet.next()) {
                //String id_peminjam,String nik, String nama, String alamat, int maks_pinjam
                umum = new Umum(
                        resultSet.getString("id_peminjam"),
                        resultSet.getString("nik"),
                        resultSet.getString("nama"),
                        resultSet.getString("alamat"),
                        resultSet.getInt("mak_pinjam")
                );
                peminjamList.add(umum);
            }
        }
        return peminjamList;
    }

    ArrayList<Koleksi> getKoleksi() throws SQLException {
        koleksiList.clear();
        statement = null;
        resultSet = null;
        statement = conn.createStatement();
        resultSet = statement.executeQuery("SELECT * FROM dvd");
        if (!resultSet.wasNull()) {
            while (resultSet.next()) {
                //id_koleksi, judul, penerbit, tahun_terbit, status_pinjam, format, isbn
                dvd = new Disk(
                        resultSet.getString("id_koleksi"),
                        resultSet.getString("judul"),
                        resultSet.getString("penerbit"),
                        resultSet.getString("tahun_terbit"),
                        resultSet.getBoolean("status_pinjam"),
                        resultSet.getString("format"),
                        resultSet.getString("isbn")
                );
                koleksiList.add(dvd);
            }
        }
        resultSet = null;
        resultSet = statement.executeQuery("SELECT * FROM buku");
        if (!resultSet.wasNull()) {
            while (resultSet.next()) {
                //id_koleksi, judul, penerbit, tahun_terbit, status_pinjam, halaman, isbn
                buku = new Buku(
                        resultSet.getString("id_koleksi"),
                        resultSet.getString("judul"),
                        resultSet.getString("penerbit"),
                        resultSet.getString("tahun_terbit"),
                        resultSet.getBoolean("status_pinjam"),
                        resultSet.getInt("halaman"),
                        resultSet.getString("isbn")
                );
                koleksiList.add(buku);
            }
        }
        resultSet = null;
        resultSet = statement.executeQuery("SELECT * FROM majalah");
        if (!resultSet.wasNull()) {
            while (resultSet.next()) {
                //id_koleksi, judul, penerbit, tahun_terbit, status_pinjam, volume, seri, issn
                majalah = new Majalah(
                        resultSet.getString("id_koleksi"),
                        resultSet.getString("judul"),
                        resultSet.getString("penerbit"),
                        resultSet.getString("tahun_terbit"),
                        resultSet.getBoolean("status_pinjam"),
                        resultSet.getInt("volume"),
                        resultSet.getInt("seri"),
                        resultSet.getString("issn")
                );
                koleksiList.add(majalah);
            }
        }
        return koleksiList;
    }

    ArrayList<Transaksi> getTransaksi() throws SQLException {
        transaksiList.clear();
        resultSet = null;
        statement = conn.createStatement();//id_transaksi, tgl_pinjam, tgl_kembali, denda, id_koleksi, id_peminjam
        resultSet = statement.executeQuery("SELECT DISTINCT id_transaksi, tgl_pinjam, tgl_kembali, denda, id_koleksi, id_peminjam FROM transaksi");
        if (!resultSet.wasNull()) {
            while (resultSet.next()) {
                String idPK = resultSet.getString("id_transaksi");
                preparedStatement = null;
                preparedStatement = conn.prepareStatement("SELECT id_koleksi FROM transaksi WHERE id_transaksi = ?");
                preparedStatement.setString(1, idPK);
                ResultSet rp = preparedStatement.executeQuery();
                if (!rp.wasNull()) {
                    pesanKoleksiList = new ArrayList<>();
                    Peminjam pinjam = null;
                    while (rp.next()) {
                        String idKoleksi = rp.getString("id_koleksi");
                        ResultSet rq;
                        char tipeKoleksi = idKoleksi.charAt(0);
                        switch (tipeKoleksi) {
                            case 'D':
                                preparedStatement = null;
                                preparedStatement = conn.prepareStatement("SELECT * FROM dvd WHERE id_koleksi = ?");
                                preparedStatement.setString(1, idKoleksi);
                                rq = preparedStatement.executeQuery();
                                if (!rq.wasNull()) {
                                    while (rq.next()) {
                                        dvd = new Disk(
                                                //String id_koleksi, String judul, String penerbit, String tahunTerbit, boolean status_pinjam,String format, String ISBN
                                                rq.getString("id_koleksi"),
                                                rq.getString("judul"),
                                                rq.getString("penerbit"),
                                                rq.getString("tahun_terbit"),
                                                rq.getBoolean("status_pinjam"),
                                                rq.getString("format"),
                                                rq.getString("isbn")
                                        );
                                        pesanKoleksiList.add(dvd);
                                    }
                                }
                                rq.close();
                                break;
                            case 'M':
                                preparedStatement = null;
                                preparedStatement = conn.prepareStatement("SELECT * FROM majalah WHERE id_koleksi = ?");
                                preparedStatement.setString(1, idKoleksi);
                                rq = preparedStatement.executeQuery();
                                if (!rq.wasNull()) {
                                    while (rq.next()) {
                                        //String id_koleksi, String judul, String penerbit, String tahunTerbit, boolean status_pinjam,int volume, int seri, String ISSN
                                        majalah = new Majalah(
                                                rq.getString("id_koleksi"),
                                                rq.getString("judul"),
                                                rq.getString("penerbit"),
                                                rq.getString("tahun_terbit"),
                                                rq.getBoolean("status_pinjam"),
                                                rq.getInt("volume"),
                                                rq.getInt("seri"),
                                                rq.getString("issn")
                                        );
                                        pesanKoleksiList.add(majalah);
                                    }
                                }
                                rq.close();
                                break;
                            case 'B':
                                preparedStatement = null;
                                preparedStatement = conn.prepareStatement("SELECT * FROM buku WHERE id_koleksi = ?");
                                preparedStatement.setString(1, idKoleksi);
                                rq = preparedStatement.executeQuery();
                                if (!rq.wasNull()) {
                                    while (rq.next()) {
                                        buku = new Buku(
                                                //String id_koleksi, String judul, String penerbit, String tahunTerbit, boolean status_pinjam,int halaman, String ISBN
                                                rq.getString("id_koleksi"),
                                                rq.getString("judul"),
                                                rq.getString("penerbit"),
                                                rq.getString("tahun_terbit"),
                                                rq.getBoolean("status_pinjam"),
                                                rq.getInt("halaman"),
                                                rq.getString("isbn")
                                        );
                                        pesanKoleksiList.add(buku);
                                    }
                                }
                                rq.close();
                                break;
                            default:
                        }
                    }
                    String idPeminjam = resultSet.getString("id_peminjam");
                    if (idPeminjam.charAt(0) == 'D') {
                        preparedStatement = null;
                        preparedStatement = conn.prepareStatement("SELECT * FROM dosen WHERE id_peminjam = ?");
                        preparedStatement.setString(1, idPeminjam);
                        ResultSet rpp = preparedStatement.executeQuery();
                        rpp.first();
                        pinjam = new Dosen(
                                rpp.getString("id_peminjam"),
                                rpp.getString("nip"),
                                rpp.getString("nama"),
                                rpp.getString("alamat"),
                                rpp.getInt("mak_pinjam")
                        );
                    }
                    if (idPeminjam.charAt(0) == 'M') {
                        preparedStatement = null;
                        preparedStatement = conn.prepareStatement("SELECT * FROM mahasiswa WHERE id_peminjam = ?");
                        preparedStatement.setString(1, idPeminjam);
                        ResultSet rpp = preparedStatement.executeQuery();
                        rpp.first();
                        pinjam = new Mahasiswa(
                                rpp.getString("id_peminjam"),
                                rpp.getString("nim"),
                                rpp.getString("nama"),
                                rpp.getString("alamat"),
                                rpp.getInt("mak_pinjam")
                        );
                    }
                    if (idPeminjam.charAt(0) == 'U') {
                        preparedStatement = null;
                        preparedStatement = conn.prepareStatement("SELECT * FROM umum WHERE id_peminjam = ?");
                        preparedStatement.setString(1, idPeminjam);
                        ResultSet rpp = preparedStatement.executeQuery();
                        rpp.first();
                        pinjam = new Umum(
                                rpp.getString("id_peminjam"),
                                rpp.getString("nik"),
                                rpp.getString("nama"),
                                rpp.getString("alamat"),
                                rpp.getInt("mak_pinjam")
                        );
                    }
                    /**
                     * String id_transaksi, LocalDate tgl_pinjam, LocalDate
                     * tgl_kembali, float denda, ArrayList<Koleksi> arkoleksi,
                     * Peminjam peminjam*
                     */
                    transaksi = new Transaksi(
                            resultSet.getString("id_transaksi"),
                            resultSet.getDate("tgl_pinjam").toLocalDate(),
                            resultSet.getDate("tgl_kembali").toLocalDate(),
                            resultSet.getFloat("denda"),
                            pesanKoleksiList,
                            pinjam
                    );
                    transaksiList.add(transaksi);
                }
            }
        }
        return transaksiList;
    }

    ArrayList<Transaksi> getLogsTransaksi() throws SQLException {
        transaksiList.clear();
        resultSet = null;
        statement = conn.createStatement();
        resultSet = statement.executeQuery("SELECT * FROM logs_transaksi");
        if (resultSet != null) {
            while (resultSet.next()) {
                transaksi = new Transaksi(
                        resultSet.getString("id_transaksi"),
                        resultSet.getDate("tgl_pinjam").toLocalDate(),
                        resultSet.getDate("tgl_kembali").toLocalDate(),
                        resultSet.getFloat("denda"),
                        resultSet.getString("id_koleksi"),
                        resultSet.getString("id_peminjam")
                );
                transaksiList.add(transaksi);

            }
        }
        return transaksiList;
    }

    ArrayList<Transaksi> GetTransaksi()throws SQLException{
        transaksiList.clear();
        resultSet = null;
        statement = conn.createStatement();
        resultSet = statement.executeQuery("SELECT * FROM transaksi");
        if (resultSet != null) {
            while (resultSet.next()) {
                transaksi = new Transaksi(
                        resultSet.getString("id_transaksi"),
                        resultSet.getDate("tgl_pinjam").toLocalDate(),
                        resultSet.getDate("tgl_kembali").toLocalDate(),
                        resultSet.getFloat("denda"),
                        resultSet.getString("id_koleksi"),
                        resultSet.getString("id_peminjam")
                );
                transaksiList.add(transaksi);

            }
        }
        return transaksiList;
    }
    public int pinjam(String id_transaksi, ArrayList<Koleksi> arkoleksi, Peminjam peminjam) {
        tgl_pinjam = Date.valueOf(LocalDate.now());
        tgl_kembali = Date.valueOf(LocalDate.now().plusDays(30));
        String kueri = "INSERT INTO transaksi VALUES (?,?,?,?,?,?)";
        preparedStatement = null;
        int rq = 0;
        try {
            preparedStatement = conn.prepareStatement(kueri);
            for (Koleksi n : arkoleksi) {
                preparedStatement.setString(1, id_transaksi);
                preparedStatement.setDate(2, tgl_pinjam);
                preparedStatement.setDate(3, tgl_kembali);
                preparedStatement.setFloat(4, 0);
                preparedStatement.setString(5, n.id_koleksi);
                preparedStatement.setString(6, peminjam.getId_peminjam());
                rq = preparedStatement.executeUpdate();
            }
            for (Koleksi o : arkoleksi) {
                updateStatusKoleksiPinjam(o.getId_koleksi());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            rq = 1;
        }
        return rq;
    }

    public int tambahLogsTransaksi(String id_transaksi, ArrayList<Koleksi> arkoleksi, Peminjam peminjam) {
        tgl_pinjam = Date.valueOf(LocalDate.now());
        tgl_kembali = Date.valueOf(LocalDate.now().plusDays(30));
        String kueri = "INSERT INTO logs_transaksi VALUES (?,?,?,?,?,?)";
        preparedStatement = null;
        int rq = 0;
        try {
            preparedStatement = conn.prepareStatement(kueri);
            for (Koleksi n : arkoleksi) {
                preparedStatement.setString(1, id_transaksi);
                preparedStatement.setDate(2, tgl_pinjam);
                preparedStatement.setDate(3, tgl_kembali);
                preparedStatement.setFloat(4, 0);
                preparedStatement.setString(5, n.id_koleksi);
                preparedStatement.setString(6, peminjam.getId_peminjam());
                rq = preparedStatement.executeUpdate();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            rq = 1;
        }
        return rq;
    }

    public int updateStatusKoleksiPinjam(String idKoleksi) {
        int rq = 0;
        String kueri = "";
        char tipe = idKoleksi.charAt(0);
        if (tipe == 'D') {
            preparedStatement = null;
            kueri = "UPDATE dvd SET status_pinjam ='1' where id_koleksi = '" + idKoleksi + "'";
            try {
                preparedStatement = conn.prepareStatement(kueri);
                rq = preparedStatement.executeUpdate();
            } catch (SQLException | HeadlessException ex) {
                System.out.println(ex.getMessage());
            }
        }
        if (tipe == 'B') {
            preparedStatement = null;
            kueri = "UPDATE buku SET status_pinjam ='1' where id_koleksi = '" + idKoleksi + "'";
            try {
                preparedStatement = conn.prepareStatement(kueri);
                rq = preparedStatement.executeUpdate();
            } catch (SQLException | HeadlessException ex) {
                System.out.println(ex.getMessage());
            }
        }
        if (tipe == 'M') {
            preparedStatement = null;
            kueri = "UPDATE majalah SET status_pinjam ='1' where id_koleksi = '" + idKoleksi + "'";
            try {
                preparedStatement = conn.prepareStatement(kueri);
                rq = preparedStatement.executeUpdate();
            } catch (SQLException | HeadlessException ex) {
                System.out.println(ex.getMessage());
            }
        }
        return rq;
    }

    public String getIdKoleksi(String idTransaksi) throws SQLException {
        String idKoleksi = "";
        statement = null;
        resultSet = null;
        statement = conn.createStatement();
        resultSet = statement.executeQuery("select id_koleksi from transaksi where id_transaksi= '" + idTransaksi + "'");
        if (!resultSet.wasNull()) {
            while (resultSet.next()) {
                idKoleksi = resultSet.getString("id_koleksi");
            }
        }
        return idKoleksi;
    }

    public int updateStatusKoleksiKembali(String idKoleksi) {
        int rq = 0;
        String kueri = "";
        char tipe = idKoleksi.charAt(0);
        if (tipe == 'D') {
            preparedStatement = null;
            kueri = "UPDATE dvd SET status_pinjam ='0' where id_koleksi = '" + idKoleksi + "'";
            try {
                preparedStatement = conn.prepareStatement(kueri);
                rq = preparedStatement.executeUpdate();
            } catch (SQLException | HeadlessException ex) {
                System.out.println(ex.getMessage());
            }
        }
        if (tipe == 'B') {
            preparedStatement = null;
            kueri = "UPDATE buku SET status_pinjam ='0' where id_koleksi = '" + idKoleksi + "'";
            try {
                preparedStatement = conn.prepareStatement(kueri);
                rq = preparedStatement.executeUpdate();
            } catch (SQLException | HeadlessException ex) {
                System.out.println(ex.getMessage());
            }
        }
        if (tipe == 'M') {
            preparedStatement = null;
            kueri = "UPDATE majalah SET status_pinjam ='0' where id_koleksi = '" + idKoleksi + "'";
            try {
                preparedStatement = conn.prepareStatement(kueri);
                rq = preparedStatement.executeUpdate();
            } catch (SQLException | HeadlessException ex) {
                System.out.println(ex.getMessage());
            }
        }
        return rq;
    }

    public int kembali(int denda, String id_transaksi, String id_koleksi, String id_peminjam) {
        String query = "update transaksi set denda = '"+denda+"' where id_transaksi ='"+id_transaksi+"' and id_koleksi = '"+id_koleksi+"' and id_peminjam='"+id_peminjam+"'";
        preparedStatement = null;
        int rq = 0;
        try {
            preparedStatement = conn.prepareStatement(query);
            rq = preparedStatement.executeUpdate();
            JOptionPane.showMessageDialog(null, "data Transaksi Telah di ubah", "Informasi", JOptionPane.INFORMATION_MESSAGE);
            updateLogs_transaski(denda,  id_transaksi,  id_koleksi,  id_peminjam);
        } catch (SQLException | HeadlessException ex) {
            System.out.println(ex.getMessage());
        }
        return rq;
    }
    
    public int updateLogs_transaski(int denda, String id_transaksi, String id_koleksi, String id_peminjam) {
        String query = "update logs_transaksi set denda = '"+denda+"' where id_transaksi ='"+id_transaksi+"' and id_koleksi = '"+id_koleksi+"' and id_peminjam='"+id_peminjam+"'";
        preparedStatement = null;
        int rq = 0;
        try {
            preparedStatement = conn.prepareStatement(query);
            rq = preparedStatement.executeUpdate();
            JOptionPane.showMessageDialog(null, "data Transaksi Telah di ubah", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException | HeadlessException ex) {
            System.out.println(ex.getMessage());
        }
        return rq;
    }
    
    void updateTransaksi(){
        String query = "update transaksi set tgl_pinjam ='2021-08-01', tgl_kembali='2021-09-01' where id_transaksi = 'T1638372768' and id_koleksi ='D999'";
        preparedStatement = null;
        int rq = 0;
        try {
            preparedStatement = conn.prepareStatement(query);
            rq = preparedStatement.executeUpdate();
            JOptionPane.showMessageDialog(null, "data Transaksi Telah di ubah", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException | HeadlessException ex) {
            System.out.println(ex.getMessage());
        }
    }

    //bagian insert peminjam
    int insertDosen(String idPeminjam, String nomorIdentitas, String nama, String alamat, int maksPinjam) {
        String kueri = "INSERT INTO dosen VALUES (?,?,?,?,?)";
        preparedStatement = null;
        int rq = 0;
        try {
            preparedStatement = conn.prepareStatement(kueri);
            preparedStatement.setString(1, idPeminjam);
            preparedStatement.setString(2, nomorIdentitas);
            preparedStatement.setString(3, nama);
            preparedStatement.setString(4, alamat);
            preparedStatement.setInt(5, maksPinjam);
            rq = preparedStatement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Dosen Berhasil Di Simpan", "Info", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return rq;
    }

    int insertMahasiswa(String idPeminjam, String nomorIdentitas, String nama, String alamat, int maksPinjam) {
        String kueri = "INSERT INTO mahasiswa VALUES (?,?,?,?,?)";
        preparedStatement = null;
        int rq = 0;
        try {
            preparedStatement = conn.prepareStatement(kueri);
            preparedStatement.setString(1, idPeminjam);
            preparedStatement.setString(2, nomorIdentitas);
            preparedStatement.setString(3, nama);
            preparedStatement.setString(4, alamat);
            preparedStatement.setInt(5, maksPinjam);
            rq = preparedStatement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Mahasiswa Berhasil Di Simpan", "Info", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return rq;
    }

    int insertUmum(String idPeminjam, String nomorIdentitas, String nama, String alamat, int maksPinjam) {
        String kueri = "INSERT INTO umum VALUES (?,?,?,?,?)";
        preparedStatement = null;
        int rq = 0;
        try {
            preparedStatement = conn.prepareStatement(kueri);
            preparedStatement.setString(1, idPeminjam);
            preparedStatement.setString(2, nomorIdentitas);
            preparedStatement.setString(3, nama);
            preparedStatement.setString(4, alamat);
            preparedStatement.setInt(5, maksPinjam);
            rq = preparedStatement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Umum Berhasil Di Simpan", "Info", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return rq;
    }

    //bagian delete peminjam
    int deleteDosen(String id_peminjam) {
        String kueri = "DELETE FROM dosen WHERE id_peminjam = ?";
        preparedStatement = null;
        int rq = 0;
        try {
            preparedStatement = conn.prepareStatement(kueri);
            preparedStatement.setString(1, id_peminjam);
            rq = preparedStatement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Dosen Berhasil Di Hapus", "Info", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return rq;
    }

    int deleteMahasiswa(String id_peminjam) {
        String kueri = "DELETE FROM mahasiswa WHERE id_peminjam = ?";
        preparedStatement = null;
        int rq = 0;
        try {
            preparedStatement = conn.prepareStatement(kueri);
            preparedStatement.setString(1, id_peminjam);
            rq = preparedStatement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Mahasiswa Berhasil Di Hapus", "Info", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return rq;
    }

    int deleteUmum(String id_peminjam) {
        String kueri = "DELETE FROM umum WHERE id_peminjam = ?";
        preparedStatement = null;
        int rq = 0;
        try {
            preparedStatement = conn.prepareStatement(kueri);
            preparedStatement.setString(1, id_peminjam);
            rq = preparedStatement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Umum Berhasil Di Hapus", "Info", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return rq;
    }

    //bagian update peminjam
    int updateDosen(String id_peminjam, String identitas, String nama, String alamat, String mak_pinjam) {
        String query = "UPDATE dosen SET  nip = '" + identitas + "',nama ='" + nama + "',alamat = '" + alamat + "' where id_peminjam = '" + id_peminjam + "'";
        preparedStatement = null;
        int rq = 0;
        try {
            preparedStatement = conn.prepareStatement(query);
            rq = preparedStatement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Dosen Berhasil Di Update", "Info", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException | HeadlessException ex) {
            System.out.println(ex.getMessage());
        }
        return rq;
    }

    int updateMahasiswa(String id_peminjam, String identitas, String nama, String alamat, String mak_pinjam) {
//        id_peminjam, nim, nama, alamat, mak_pinjam
        String query = "UPDATE mahasiswa SET  nim = '" + identitas + "',nama ='" + nama + "',alamat = '" + alamat + "' where id_peminjam = '" + id_peminjam + "'";
        preparedStatement = null;
        int rq = 0;
        try {
            preparedStatement = conn.prepareStatement(query);
            rq = preparedStatement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Mahasiswa Berhasil Di Update", "Info", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException | HeadlessException ex) {
            System.out.println(ex.getMessage());
        }
        return rq;
    }

    int updateUmum(String id_peminjam, String identitas, String nama, String alamat, String mak_pinjam) {
//        id_peminjam, nim, nama, alamat, mak_pinjam
        String query = "UPDATE umum SET  nik = '" + identitas + "',nama ='" + nama + "',alamat = '" + alamat + "' where id_peminjam = '" + id_peminjam + "'";
        preparedStatement = null;
        int rq = 0;
        try {
            preparedStatement = conn.prepareStatement(query);
            rq = preparedStatement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Umum Berhasil Di Update", "Info", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException | HeadlessException ex) {
            System.out.println(ex.getMessage());
        }
        return rq;
    }

    //bagian insert buku
    //id_koleksi, judul, penerbit, tahun_terbit, status_pinjam, halaman, isbn
    int insertBuku(String id_koleksi, String judul, String penerbit, String tahunTerbit, int status_pinjam, int halaman, String ISBN) {
        String kueri = "INSERT INTO buku VALUES (?,?,?,?,?,?,?)";
        preparedStatement = null;
        int rq = 0;
        try {
            preparedStatement = conn.prepareStatement(kueri);
            //id_koleksi, judul, penerbit, tahun_terbit, status_pinjam, halaman, isbn
            preparedStatement.setString(1, id_koleksi);
            preparedStatement.setString(2, judul);
            preparedStatement.setString(3, penerbit);
            preparedStatement.setString(4, tahunTerbit);
            preparedStatement.setInt(5, status_pinjam);
            preparedStatement.setInt(6, halaman);
            preparedStatement.setString(7, ISBN);
            rq = preparedStatement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Buku Berhasil Di Simpan", "Info", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return rq;
    }

    //id_koleksi, judul, penerbit, tahun_terbit, status_pinjam, format, isbn
    int insertDisk(String id_koleksi, String judul, String penerbit, String tahunTerbit, int status_pinjam, String format, String ISBN) {
        String kueri = "INSERT INTO dvd VALUES (?,?,?,?,?,?,?)";
        preparedStatement = null;
        int rq = 0;
        try {
            preparedStatement = conn.prepareStatement(kueri);
            preparedStatement.setString(1, id_koleksi);
            preparedStatement.setString(2, judul);
            preparedStatement.setString(3, penerbit);
            preparedStatement.setString(4, tahunTerbit);
            preparedStatement.setInt(5, status_pinjam);
            preparedStatement.setString(6, format);
            preparedStatement.setString(7, ISBN);
            rq = preparedStatement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Disk Berhasil Di Simpan", "Info", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return rq;
    }

    //id_koleksi, judul, penerbit, tahun_terbit, status_pinjam, volume, seri, issn
    int insertMajalah(String id_koleksi, String judul, String penerbit, String tahunTerbit, int status_pinjam, int volume, int seri, String ISSN) {
        String kueri = "INSERT INTO majalah VALUES (?,?,?,?,?,?,?,?)";
        preparedStatement = null;
        int rq = 0;
        try {
            preparedStatement = conn.prepareStatement(kueri);
            preparedStatement.setString(1, id_koleksi);
            preparedStatement.setString(2, judul);
            preparedStatement.setString(3, penerbit);
            preparedStatement.setString(4, tahunTerbit);
            preparedStatement.setInt(5, status_pinjam);
            preparedStatement.setInt(6, volume);
            preparedStatement.setInt(7, seri);
            preparedStatement.setString(8, ISSN);
            rq = preparedStatement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Majalah Berhasil Di Simpan", "Info", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return rq;
    }

    //bagian delete
    int deleteDisk(String id_koleksi) {
        String kueri = "DELETE FROM dvd WHERE id_koleksi = ?";
        preparedStatement = null;
        int rq = 0;
        try {
            preparedStatement = conn.prepareStatement(kueri);
            preparedStatement.setString(1, id_koleksi);
            rq = preparedStatement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Koleksi Disk Berhasil Di Hapus", "Info", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return rq;
    }

    int deleteBuku(String id_koleksi) {
        String kueri = "DELETE FROM buku WHERE id_koleksi = ?";
        preparedStatement = null;
        int rq = 0;
        try {
            preparedStatement = conn.prepareStatement(kueri);
            preparedStatement.setString(1, id_koleksi);
            rq = preparedStatement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Koleksi Buku Berhasil Di Hapus", "Info", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return rq;
    }

    int deleteMajalah(String id_koleksi) {
        String kueri = "DELETE FROM majalah WHERE id_koleksi = ?";
        preparedStatement = null;
        int rq = 0;
        try {
            preparedStatement = conn.prepareStatement(kueri);
            preparedStatement.setString(1, id_koleksi);
            rq = preparedStatement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Koleksi Majalah Berhasil Di Hapus", "Info", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return rq;
    }

    //update
    int updateDisk(String id_koleksi, String judul, String penerbit, String tahunTerbit, int status_pinjam, String format, String ISBN) {
        //id_koleksi, judul, penerbit, tahun_terbit, status_pinjam, format, isbn
        String query = "UPDATE dvd set judul = '" + judul + "', penerbit = '" + penerbit + "', tahun_terbit ='" + tahunTerbit + "', status_pinjam='" + status_pinjam + "', format='" + format + "', isbn='" + ISBN + "' where id_koleksi = '" + id_koleksi + "'";
        preparedStatement = null;
        int rq = 0;
        try {
            preparedStatement = conn.prepareStatement(query);
            rq = preparedStatement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Disk Berhasil Di Update", "Info", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException | HeadlessException ex) {
            System.out.println(ex.getMessage());
        }
        return rq;
    }

    int updateBuku(String id_koleksi, String judul, String penerbit, String tahunTerbit, int status_pinjam, int halaman, String ISBN) {
        //id_koleksi, judul, penerbit, tahun_terbit, status_pinjam, halaman, isbn
        String query = "UPDATE buku set judul = '" + judul + "', penerbit = '" + penerbit + "', tahun_terbit ='" + tahunTerbit + "', status_pinjam='" + status_pinjam + "', halaman='" + halaman + "', isbn='" + ISBN + "' where id_koleksi = '" + id_koleksi + "'";
        preparedStatement = null;
        int rq = 0;
        try {
            preparedStatement = conn.prepareStatement(query);
            rq = preparedStatement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Buku Berhasil Di Update", "Info", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException | HeadlessException ex) {
            System.out.println(ex.getMessage());
        }
        return rq;
    }

    int updateMajalah(String id_koleksi, String judul, String penerbit, String tahunTerbit, int status_pinjam, int volume, int seri, String ISSN) {
        //id_koleksi, judul, penerbit, tahun_terbit, status_pinjam, volume, seri, issn
        String query = "UPDATE majalah set judul = '" + judul + "', penerbit = '" + penerbit + "', tahun_terbit ='" + tahunTerbit + "', status_pinjam='" + status_pinjam
                + "', volume='" + volume + "', seri='" + seri + "', issn='" + ISSN + "' where id_koleksi = '" + id_koleksi + "'";
        preparedStatement = null;
        int rq = 0;
        try {
            preparedStatement = conn.prepareStatement(query);
            rq = preparedStatement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data majalah Berhasil Di Update", "Info", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException | HeadlessException ex) {
            System.out.println(ex.getMessage());
        }
        return rq;
    }
}
