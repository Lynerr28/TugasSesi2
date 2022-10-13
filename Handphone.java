// TUGAS SESI2 FEBY ALFARABY

package tugas;

public class Handphone {
    String jenis_hp;
    int tahun_pembuatan;
    
    public void setDataHp(String jenis_hp, int tahun_pembuatan){
        this.jenis_hp = jenis_hp;
        this.tahun_pembuatan = tahun_pembuatan;
    }
    
    public String getJenisHp(){
        return jenis_hp;
    }
    
    public int getTahunPembuatan(){
        return tahun_pembuatan;
    }
    
    public static void main(String[] args) {
        Handphone hp = new Handphone();
        hp.setDataHp("Xiaomi", 2017);
        System.out.println("Jenis Hp : "+ hp.jenis_hp);
        System.out.println("Tahun Pembuatan : "+ hp.getTahunPembuatan());
        
    }
    
}
