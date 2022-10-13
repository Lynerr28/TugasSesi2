package tugas;


public class SimulasiMotorPcx {
    boolean nyala;
    int perseneling;
    int kecepatan;
    
    SimulasiMotorPcx(){
        nyala = false;
        perseneling = 0;
        kecepatan = 0;
    }
    
    public void dinyalakan(){
        if(nyala==true){
            System.out.println("Motor sudah menyala");
        }
        else{
            System.out.println("Motor berhasil dinyalakan");
            nyala = true;
        }
    }
    
    public void dimatikan(){
        if(nyala == false){
            System.out.println("Motor sudah mati");
        }
        else{
            System.out.println("Motor berhasil dimatikan");
            nyala = false;
        }
    }
    
    public void tambah_perseneling(){
        if(perseneling <= 6){
            perseneling++;
            System.out.println("Gigi : "+ perseneling);
        }
    }
    
    public void kurangi_perseneling(){
        if(perseneling >= 0){
            perseneling--;
            System.out.println("Gigi : "+ perseneling);
        }
        
        if(perseneling == 6&&kecepatan > 150){
            kecepatan = 150;
            System.out.println("Kecepatan anda sekarang : "+ kecepatan);
        }
        else if(perseneling == 5&&kecepatan > 100){
            kecepatan = 100;
            System.out.println("Kecepatan anda sekarang : "+ kecepatan);
        }
        else if(perseneling == 4&&kecepatan > 75){
            kecepatan = 75;
            System.out.println("Kecepatan anda seakrang : "+ kecepatan);
        }
        else if(perseneling == 3&&kecepatan > 50){
            kecepatan = 50;
            System.out.println("Keceaptan anda sekarang : "+ kecepatan);
        }
        else if(perseneling == 2&&kecepatan > 25){
            kecepatan = 25;
            System.out.println("Keecepatan anda sekarang : "+ kecepatan);
        }
        else if(perseneling == 1&&kecepatan > 10){
            kecepatan = 10;
            System.out.println("Kecepatan anda sekarang : "+ kecepatan);
        }
    }
    
    public void tambah_kecepatan(int jumlah_kecepatan){
        if(nyala == true){
            
            if(perseneling == 0){
                System.out.println("Tidak bisa berjalan");
                System.out.println("Perseneling anda normmal");
            }
            else if(perseneling == 1){
                if(kecepatan + jumlah_kecepatan > 10){
                    System.out.println("Kecepatan akan melebihi maksimal kecepatan di gigi 1");
                }
                else{
                    kecepatan += jumlah_kecepatan;
                }
                System.out.println("Kecepatan anda sekarang : "+ kecepatan);
            }
            else if(perseneling == 2){
                if(kecepatan + jumlah_kecepatan > 25){
                    System.out.println("Kecepatan akan melebihi maksimal kecepatan di gigi 2");
                }
                else{
                    kecepatan += jumlah_kecepatan;
                }
                System.out.println("Kecepatan anda sekarang: "+ kecepatan);
            }
            else if(perseneling == 3){
                if(kecepatan + jumlah_kecepatan > 50){
                    System.out.println("Kecepatan akan melebohi maksimal kecepatan di gigi 3");
                }
                else{
                    kecepatan += jumlah_kecepatan;
                }
                System.out.println("Kecepatan anda sekarang: "+ kecepatan);
            }
            else if(perseneling == 4){
                if(kecepatan + jumlah_kecepatan > 75){
                    System.out.println("Kecepatan akan melebihi maksimal kecepatan di gigi 4");
                }
                else{
                    kecepatan += jumlah_kecepatan;
                }
                System.out.println("Kecepatan anda sekarang: "+ kecepatan);
            }
            else if(perseneling == 5){
                if(kecepatan + jumlah_kecepatan > 100){
                    System.out.println("Kecepatan akan melebihi maksimal kecepatan pada gigi 5"); 
                }
                else{
                    kecepatan += jumlah_kecepatan;
                }
                System.out.println("Keceptan anda sekarang: "+ kecepatan);
            }
            else if(perseneling == 6){
                if(kecepatan + jumlah_kecepatan > 150){
                    System.out.println("Kecepatan akan melebihi maksimal kecepatan pada gigi 6");
                }
                else{
                    kecepatan += jumlah_kecepatan;
                }
                System.out.println("Kecepatan anda sekarang: "+ kecepatan);
            }
        }
        else{
            System.out.println("Belum nyala");
        }
    }
    public void kurangi_kecepatan(int jumlah_kecepatan){
        if(nyala == true){
            kecepatan -= jumlah_kecepatan;
            System.out.println("Kecepatan dikurangi");
            System.out.println("Kecepatan anda sekarang: "+ kecepatan);
        }
    }
    
    public void infoMotor(){
        if(kecepatan >= 0&&kecepatan <= 50){
            System.out.println("kecepatan rendah");
        }
        else if(kecepatan >=51&&kecepatan < 75){
            System.out.println("Kecepatan sedang");
        }
        else if(kecepatan >= 75){
            System.out.println("Kecepatan tinggi");
        }
    }
    
    public static void main(String[] args) {
        SimulasiMotorPcx pcxBapak = new SimulasiMotorPcx();
        
        pcxBapak.dinyalakan();
        pcxBapak.tambah_perseneling();
        pcxBapak.tambah_perseneling();
        pcxBapak.tambah_kecepatan(100);
        pcxBapak.kurangi_kecepatan(20);
        pcxBapak.kurangi_perseneling();
        pcxBapak.tambah_kecepatan(50);
        pcxBapak.tambah_kecepatan(50);
        pcxBapak.tambah_perseneling();
        pcxBapak.tambah_perseneling();
        pcxBapak.tambah_perseneling();
        pcxBapak.tambah_kecepatan(90);
        
        pcxBapak.infoMotor();
    }
}
