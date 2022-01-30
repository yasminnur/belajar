package tolukl;

import java.util.Scanner;

public class TolUKL {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int IdKendaraan, IdTol;
        System.out.println("Daftar Golongan Kendaraan");
        System.out.println("1. Sedan, Jip, Pick Up");
        System.out.println("2. Truk dengan 2 sumbu");
        System.out.println("3. Truk dengan 3 sumbu");
        System.out.print("Masukkan nomor golongan kendaraan anda = ");
        IdKendaraan = input.nextInt();
        System.out.println("Daftar Ruas Tol");
        System.out.println("1. Waru - Sidoarjo - Waru");
        System.out.println("2. Waru - Porong - Waru");
        System.out.println("3. Sidoarjo - Porong - Sidoarjo");
        System.out.println("4. Porong - Kejapanan");
        System.out.println("5. Kejapanan - Gempol");
        System.out.println("6. Dupak - Waru");
        System.out.print("Masukkan nomor ruas tol yang anda pilih = ");
        IdTol = input.nextInt();

        if (IdTol == 1) {
            System.out.println("Ruas Waru - Sidoarjo - Waru");
            if (IdKendaraan == 1) {
                int Gol1WaruSidoarjo = 6000;
                int Gol1SidoarjoWaru = 6000;
                int Total = Gol1WaruSidoarjo + Gol1SidoarjoWaru;
                System.out.println("Tarif masuk keluar ");
                System.out.println("Masuk = " + Gol1WaruSidoarjo);
                System.out.println("Keluar = " + Gol1SidoarjoWaru);
                System.out.println("Total Tarif = " + Total);
            }else if (IdKendaraan == 2 ) {
                int Gol45WaruSidoarjo = 9000;
                int Gol45SidoarjoWaru = 9000;
                int Total = Gol45WaruSidoarjo + Gol45SidoarjoWaru;
                System.out.println("Tarif masuk keluar ");
                System.out.println("Masuk = " + Gol45WaruSidoarjo);
                System.out.println("Keluar = " + Gol45SidoarjoWaru);
                System.out.println("Total Tarif = " + Total);
            }else if (IdKendaraan == 3 ) {
                int Gol45WaruSidoarjo = 9000;
                int Gol45SidoarjoWaru = 9000;
                int Total = Gol45WaruSidoarjo + Gol45SidoarjoWaru;
                System.out.println("Tarif masuk keluar ");
                System.out.println("Masuk = " + Gol45WaruSidoarjo);
                System.out.println("Keluar = " + Gol45SidoarjoWaru);
                System.out.println("Total Tarif = " + Total);
            }else if (IdKendaraan == 4) {
                int Gol23WaruSidoarjo = 12000;
                int Gol23SidoarjoWaru = 12000;
                int Total = Gol23WaruSidoarjo + Gol23SidoarjoWaru;
                System.out.println("Tarif masuk keluar ");
                System.out.println("Masuk = " + Gol23WaruSidoarjo);
                System.out.println("Keluar = " + Gol23SidoarjoWaru);
                System.out.println("Total Tarif = " + Total);
            }else if (IdKendaraan == 5) {
                int Gol23WaruSidoarjo = 12000;
                int Gol23SidoarjoWaru = 12000;
                int Total = Gol23WaruSidoarjo + Gol23SidoarjoWaru;
                System.out.println("Tarif masuk keluar ");
                System.out.println("Masuk = " + Gol23WaruSidoarjo);
                System.out.println("Keluar = " + Gol23SidoarjoWaru);
                System.out.println("Total Tarif = " + Total); 
            }
            }

            // ==================================================
            if (IdTol == 2) {
                System.out.println("Ruas Waru - Porong - Waru");
                if (IdKendaraan == 1) {
                    int Gol1WaruPorong = 9000;
                    int Gol1PorongWaru = 9000;
                    int Total = Gol1WaruPorong + Gol1PorongWaru;
                    System.out.println("Tarif masuk keluar ");
                    System.out.println("Masuk = " + Gol1WaruPorong);
                    System.out.println("Keluar = " + Gol1PorongWaru);
                    System.out.println("Total Tarif = " + Total);
                }if (IdKendaraan == 2) {
                    int Gol23WaruPorong = 14000;
                    int Gol23PorongWaru = 14000;
                    int Total = Gol23WaruPorong + Gol23PorongWaru;
                    System.out.println("Tarif masuk keluar ");
                    System.out.println("Masuk = " + Gol23WaruPorong);
                    System.out.println("Keluar = " + Gol23PorongWaru);
                    System.out.println("Total Tarif = " + Total);
                }if (IdKendaraan == 3) {
                    int Gol23WaruPorong = 14000;
                    int Gol23PorongWaru = 14000;
                    int Total = Gol23WaruPorong + Gol23PorongWaru;
                    System.out.println("Tarif masuk keluar ");
                    System.out.println("Masuk = " + Gol23WaruPorong);
                    System.out.println("Keluar = " + Gol23PorongWaru);
                    System.out.println("Total Tarif = " + Total);
                }if (IdKendaraan == 4) {
                    int Gol45WaruPorong = 18500;
                    int Gol45PorongWaru = 18500;
                    int Total = Gol45WaruPorong + Gol45PorongWaru;
                    System.out.println("Tarif masuk keluar ");
                    System.out.println("Masuk = " + Gol45WaruPorong);
                    System.out.println("Keluar = " + Gol45PorongWaru);
                    System.out.println("Total Tarif = " + Total);
                }if (IdKendaraan == 5) {
                    int Gol45WaruPorong = 18500;
                    int Gol45PorongWaru = 18500;
                    int Total = Gol45WaruPorong + Gol45PorongWaru;
                    System.out.println("Tarif masuk keluar ");
                    System.out.println("Masuk = " + Gol45WaruPorong);
                    System.out.println("Keluar = " + Gol45PorongWaru);
                    System.out.println("Total Tarif = " + Total);
                }
            }
            // =============================================
            if (IdTol == 3) {
                System.out.println("Ruas Sidoarjo - Porong - Sidoarjo");
                if (IdKendaraan == 1) {
                    int Gol1SidoarjoPorong = 5500;
                    int Gol1PorongSidoarjo = 5500;
                    int Total = Gol1SidoarjoPorong + Gol1PorongSidoarjo;
                    System.out.println("Tarif masuk keluar ");
                    System.out.println("Masuk = " + Gol1SidoarjoPorong);
                    System.out.println("Keluar = " + Gol1PorongSidoarjo);
                    System.out.println("Total Tarif = " + Total);
                }if (IdKendaraan == 2) {//gol 2 dan 3
                    int Gol23SidoarjoPorong = 8500;
                    int Gol23PorongSidoarjo = 8500;
                    int Total = Gol23SidoarjoPorong + Gol23PorongSidoarjo;
                    System.out.println("Tarif masuk keluar ");
                    System.out.println("Masuk = " + Gol23SidoarjoPorong);
                    System.out.println("Keluar = " + Gol23PorongSidoarjo);
                    System.out.println("Total Tarif = " + Total);
                }if (IdKendaraan == 3) {
                    int Gol23SidoarjoPorong = 8500;
                    int Gol23PorongSidoarjo = 8500;
                    int Total = Gol23SidoarjoPorong + Gol23PorongSidoarjo;
                    System.out.println("Tarif masuk keluar ");
                    System.out.println("Masuk = " + Gol23SidoarjoPorong);
                    System.out.println("Keluar = " + Gol23PorongSidoarjo);
                    System.out.println("Total Tarif = " + Total);
                }if (IdKendaraan == 4) {
                    int Gol45SidoarjoPorong = 11500;
                    int Gol45PorongSidoarjo = 11500;
                    int Total = Gol45SidoarjoPorong + Gol45PorongSidoarjo;
                    System.out.println("Tarif masuk keluar ");
                    System.out.println("Masuk = " + Gol45SidoarjoPorong);
                    System.out.println("Keluar = " + Gol45PorongSidoarjo);
                    System.out.println("Total Tarif = " + Total);
                }if (IdKendaraan == 5) {
                    int Gol45SidoarjoPorong = 11500;
                    int Gol45PorongSidoarjo = 11500;
                    int Total = Gol45SidoarjoPorong + Gol45PorongSidoarjo;
                    System.out.println("Tarif masuk keluar ");
                    System.out.println("Masuk = " + Gol45SidoarjoPorong);
                    System.out.println("Keluar = " + Gol45PorongSidoarjo);
                    System.out.println("Total Tarif = " + Total);
                }
            }
            //=============================================================
            if (IdTol == 4) {
                System.out.println("Ruas Porong - Kejapanan");
                if (IdKendaraan == 1) {
                    int Gol1PorongKejapanan = 6000;
                    System.out.println("Tarifnya ");
                    System.out.println("Tarif = " + Gol1PorongKejapanan);
                }if (IdKendaraan == 2) {
                    int Gol23PorongKejapanan = 8500;
                    System.out.println("Tarifnya ");
                    System.out.println("Tarif = " + Gol23PorongKejapanan);
                }if (IdKendaraan == 3) {
                    int Gol23PorongKejapanan = 8500;
                    System.out.println("Tarifnya ");
                    System.out.println("Tarif = " + Gol23PorongKejapanan);
                }if (IdKendaraan == 4) {
                    int Gol45PorongKejapanan = 11500;
                    System.out.println("Tarifnya ");
                    System.out.println("Tarif = " + Gol45PorongKejapanan);
                }if (IdKendaraan == 5) {
                    int Gol45PorongKejapanan = 11500;
                    System.out.println("Tarifnya ");
                    System.out.println("Tarif = " + Gol45PorongKejapanan);    
                }
                }
            //=====================================================
            if (IdTol == 5) {
                System.out.println("Ruas Kejapanan - Gempol");
                if (IdKendaraan == 1) {
                    int Gol1KejapananGempol = 3000;
                    System.out.println("Tarifnya ");
                    System.out.println("Tarif = " + Gol1KejapananGempol);       
                }if (IdKendaraan == 2) {
                    int Gol23KejapananGempol = 5000;
                    System.out.println("Tarif nya");
                    System.out.println("Tarif = " + Gol23KejapananGempol);
                }if (IdKendaraan == 3) {
                    int Gol23KejapananGempol = 5000;
                    System.out.println("Tarif nya");
                    System.out.println("Tarif = " + Gol23KejapananGempol);
                }if (IdKendaraan == 4) { 
                    int Gol45KejapananGempol = 6500;
                    System.out.println("Tarifnya ");
                    System.out.println("Tarif = " + Gol45KejapananGempol);
                }if (IdKendaraan == 5) { 
                    int Gol45KejapananGempol = 6500;
                    System.out.println("Tarifnya ");
                    System.out.println("Tarif = " + Gol45KejapananGempol);
                    }
                }
                            //=======================================================
            if (IdTol == 6) {
                System.out.println("Ruas Dupak - Waru");
                if (IdKendaraan == 1) {
                    int Gol1DupakWaru = 5000;
                    System.out.println("Tarifnya ");
                    System.out.println("Tarif = " + Gol1DupakWaru);
                }if (IdKendaraan == 2) {
                    int Gol23DupakWaru = 8000;
                    System.out.println("Tarif nya");
                    System.out.println("Tarif = " + Gol23DupakWaru);
                }if (IdKendaraan == 3) {
                    int Gol23DupakWaru = 8000;
                    System.out.println("Tarif nya");
                    System.out.println("Tarif = " + Gol23DupakWaru);
                }if (IdKendaraan == 4) { 
                    int Gol45DupakWaru = 10500;
                    System.out.println("Tarifnya ");
                    System.out.println("Tarif = " + Gol45DupakWaru);
                }if (IdKendaraan == 5) { 
                    int Gol45DupakWaru = 10500;
                    System.out.println("Tarifnya ");
                    System.out.println("Tarif = " + Gol45DupakWaru);
                                }
                            }
                        }

                    }

    
